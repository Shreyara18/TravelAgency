package com.travelAgency.TravelAgency;


import java.util.ArrayList;
import java.util.List;
import com.travelAgency.TravelAgency.PassengerType;
public class Passenger {
    private String name;
    private int passengerNumber;
    private PassengerType passengerType;
    private List<Activity> signedUpActivities;
    private double balance;

    public Passenger(String name, int passengerNumber, PassengerType passengerType) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.signedUpActivities = new ArrayList<>();
        this.balance = 0.0;
    }

    public void signUpForActivity(Activity activity) {
        if (passengerType == PassengerType.PREMIUM) {
            signedUpActivities.add(activity);
        } else {
            double cost = activity.getCost();
            if (passengerType == PassengerType.GOLD) {
                cost *= 0.9; // 10% discount for gold passengers
            }
            if (passengerType == PassengerType.STANDARD && cost > getBalance()) {
                throw new IllegalStateException("Insufficient balance.");
            }
            if (cost <= getBalance()) {
                signedUpActivities.add(activity);
                if (passengerType == PassengerType.STANDARD) {
                    deductFromBalance(cost);
                }
            }
        }
    }

    private boolean isPassengerSignedUp(Activity activity) {
        return signedUpActivities.contains(activity);
    }

    public List<Activity> getSignedUpActivities() {
        return signedUpActivities;
    }

    double getBalance() {
        if (passengerType == PassengerType.STANDARD || passengerType == PassengerType.GOLD) {
            // Retrieve the balance from a database or any other data source based on passenger's ID
            double balance = retrieveBalanceFromDatabase(passengerNumber);
            return balance;
        }
        // For premium passengers, no balance is applicable
        return 0.0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    private void deductFromBalance(double amount) {
        if (passengerType == PassengerType.STANDARD || passengerType == PassengerType.GOLD) {
            // Deduct the given amount from the balance
            this.balance -= amount;
            // Update the balance in the database or any other data source based on passenger's ID
            updateBalanceInDatabase(passengerNumber, this.balance);
        }}

    private double retrieveBalanceFromDatabase(int passengerNumber) {
        // Placeholder code - replace with actual logic to retrieve balance from the database
        // For demonstration purposes, returning a fixed balance of 100.0
        return 100.0;
    }

    private void updateBalanceInDatabase(int passengerNumber, double amount) {
        // Placeholder code - replace with actual logic to update balance in the database
        // For demonstration purposes, printing the update instead of actual database update
        System.out.println("Updating balance for passenger " + passengerNumber + " by " + amount);
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }
}
