package com.travelAgency.TravelAgency;

import java.util.ArrayList;
import java.util.List;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;
    private List<Passenger> signedUpPassengers;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
        this.signedUpPassengers = new ArrayList<>();
    }

    public boolean isPassengerSignedUp(Passenger passenger) {
        return signedUpPassengers.contains(passenger);
    }

    private double getBalanceFromDatabase(int passengerNumber) {
        // Placeholder code - replace with actual logic to retrieve balance from the database
        // Example: Assuming the balance is stored in a "Passenger" table in a database
        // Implement the appropriate database interaction logic to retrieve the balance for the given passengerNumber
        // Return the retrieved balance
        // Example placeholder code:
        // double balance = DatabaseHelper.retrieveBalance(passengerNumber);
        // return balance;
        return 0.0; // Placeholder value, replace it with the actual retrieval logic
    }

    private void updateBalanceInDatabase(int passengerNumber, double newBalance) {
        // Placeholder code - replace with actual logic to update balance in the database
        // Example: Assuming the balance is stored in a "Passenger" table in a database
        // Implement the appropriate database interaction logic to update the balance for the given passengerNumber
        // Example placeholder code:
        // DatabaseHelper.updateBalance(passengerNumber, newBalance);
        System.out.println("Updating balance for passenger " + passengerNumber + " to " + newBalance);
    }

    private double getBalance(Passenger passenger, PassengerType passengerType) {
        if (passengerType == PassengerType.STANDARD || passengerType == PassengerType.GOLD) {
            int passengerNumber = passenger.getPassengerNumber();
            double balance = getBalanceFromDatabase(passengerNumber);
            return balance;
        }
        return 0.0;
    }

    private void deductFromBalance(Passenger passenger, double amount, PassengerType passengerType) {
        if (passengerType == PassengerType.STANDARD) {
            int passengerNumber = passenger.getPassengerNumber();
            double currentBalance = getBalanceFromDatabase(passengerNumber);
            double newBalance = currentBalance - amount;
            updateBalanceInDatabase(passengerNumber, newBalance);
        }
    }

    public boolean hasAvailability() {
        return signedUpPassengers.size() < capacity;
    }

    public boolean signUpPassenger(Passenger passenger) {
        if (hasAvailability()) {
            signedUpPassengers.add(passenger);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableSpaces() {
        return capacity - signedUpPassengers.size();
    }
}
