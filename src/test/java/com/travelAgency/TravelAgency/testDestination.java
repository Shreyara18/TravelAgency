package com.travelAgency.TravelAgency;

import org.junit.jupiter.api.Test;

class testDestination {
    @Test
    void testAddActivity() {
        Destination destination = new Destination("Destination 1");
        Activity activity = new Activity("Activity 1", "Description 1", 100.0, 5, destination);

        destination.addActivity(activity);

        assertEquals(1, destination.getActivities().size());
        assertTrue(destination.getActivities().contains(activity));
    }

    private void assertTrue(boolean contains) {
    }

    private void assertEquals(int i, int size) {
    }

    // Add more test cases as needed
}
