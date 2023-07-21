package com.travelAgency.TravelAgency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelAgencyApplication {

	public static void main(String[] args) {

		SpringApplication.run(TravelAgencyApplication.class, args);
System.out.println("start");
		// Create instances of classes and test functionality
		TravelPackage travelPackage = new TravelPackage("Package 1", 10);
		Destination destination1 = new Destination("Destination 1");
		Destination destination2 = new Destination("Destination 2");
		Activity activity1 = new Activity("Activity 1", "Description 1", 100.0, 5, destination1);
		Activity activity2 = new Activity("Activity 2", "Description 2", 200.0, 8, destination2);
		Passenger passenger1 = new Passenger("John", 1, PassengerType.STANDARD);
		Passenger passenger2 = new Passenger("Jane", 2, PassengerType.GOLD);

		// Add destinations and activities to the travel package
		travelPackage.getItinerary().add(destination1);
		travelPackage.getItinerary().add(destination2);
		destination1.getActivities().add(activity1);
		destination2.getActivities().add(activity2);

		// Add passengers to the travel package
		travelPackage.addPassenger(passenger1);
		travelPackage.addPassenger(passenger2);

		// Sign up passengers for activities
		passenger1.signUpForActivity(activity1);
		passenger2.signUpForActivity(activity2);

		// Print itinerary, passenger list, and available activities
		travelPackage.printItinerary();
		travelPackage.printPassengerList();
		travelPackage.printAvailableActivities();


	}
}
