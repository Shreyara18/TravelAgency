package com.travelAgency.TravelAgency;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

import static org.junit.jupiter.api.Assertions.*;


import com.travelAgency.TravelAgency.Activity;

public class testActivity {
    @Test
    void testIsPassengerSignedUp() {
        // Create a mock Passenger
        Passenger mockPassenger = mock(Passenger.class);

        // Create an Activity and sign up the mock passenger
        Activity activity = new Activity("Activity 1", "Description 1", 100.0, 5, mock(Destination.class));
        activity.signUpPassenger(mockPassenger);

        // Test if the passenger is signed up
        assertTrue(activity.isPassengerSignedUp(mockPassenger));
    }

    @Test
    void testHasAvailability() {
        // Create an Activity with capacity 2
        Activity activity = new Activity("Activity 1", "Description 1", 100.0, 2, mock(Destination.class));

        // Sign up two passengers to fill the capacity
        activity.signUpPassenger(mock(Passenger.class));
        activity.signUpPassenger(mock(Passenger.class));

        // Test if the activity has availability
        assertFalse(activity.hasAvailability());
    }

    @Test
    void testSignUpPassenger() {
        // Create an Activity with capacity 1
        Activity activity = new Activity("Activity 1", "Description 1", 100.0, 1, mock(Destination.class));

        // Create a mock Passenger
        Passenger mockPassenger = mock(Passenger.class);

        // Test signing up a passenger
        boolean isSignedUp = activity.signUpPassenger(mockPassenger);

        // Verify that the passenger is signed up
        assertTrue(isSignedUp);
    }

    @Test
    void testSignUpPassengerWithFullCapacity() {
        // Create an Activity with capacity 1
        Activity activity = new Activity("Activity 1", "Description 1", 100.0, 1, mock(Destination.class));

        // Create two mock Passengers
        Passenger mockPassenger1 = mock(Passenger.class);
        Passenger mockPassenger2 = mock(Passenger.class);

        // Sign up two passengers to fill the capacity
        activity.signUpPassenger(mockPassenger1);

        // Test signing up another passenger when the capacity is full
        boolean isSignedUp = activity.signUpPassenger(mockPassenger2);

        // Verify that the second passenger is not signed up due to full capacity
        assertFalse(isSignedUp);
    }
}
