package com.travelAgency.TravelAgency;
import java.util.List;
import java.util.ArrayList;
public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity && !isPassengerEnrolled(passenger)) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    private boolean isPassengerEnrolled(Passenger passenger) {
        return passengers.contains(passenger);
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            List<Activity> activities = destination.getActivities();
            for (Activity activity : activities) {
                System.out.println("Activity: " + activity.getName());
                System.out.println("Description: " + activity.getDescription());
                System.out.println("Cost: " + activity.getCost());
                System.out.println("Capacity: " + activity.getCapacity());
                System.out.println("-------------------");
            }
            System.out.println("===================");
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Name: " + passenger.getName());
            System.out.println("Passenger Number: " + passenger.getPassengerNumber());
            System.out.println("-------------------");
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : itinerary) {
            List<Activity> activities = destination.getActivities();
            for (Activity activity : activities) {
                if (activity.hasAvailability()) {
                    System.out.println("Activity: " + activity.getName());
                    System.out.println("Spaces Available: " + activity.getAvailableSpaces());
                    System.out.println("-------------------");
                }
            }
        }
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<Destination> getItinerary() {
        return itinerary;
    }
}
