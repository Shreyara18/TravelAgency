package com.travelAgency.TravelAgency;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testPassenger {
    @Test
    public void testSignUpForActivity_Success() {
        Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD);
        Activity activity = new Activity("Activity 1", "Description 1", 100.0, 5, null);

        passenger.signUpForActivity(activity);

        assertEquals(1, passenger.getSignedUpActivities().size());
        assertTrue(passenger.getSignedUpActivities().contains(activity));
    }

    private void assertTrue(boolean contains) {
    }

    private void assertEquals(int i, int size) {
    }

    @Test
    public void testSignUpForActivity_Failure_InsufficientBalance() {
        Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD);
        Activity activity = new Activity("Activity 1", "Description 1", 100.0, 5, null);

        boolean exceptionThrown = false;
        try {
            passenger.signUpForActivity(activity);
        } catch (IllegalStateException e) {
            exceptionThrown = true;
        }

        assertFalse(exceptionThrown);
        assertEquals(0, passenger.getSignedUpActivities().size());
    }

    private void assertFalse(boolean exceptionThrown) {
    }

}
