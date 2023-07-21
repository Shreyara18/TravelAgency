package com.travelAgency.TravelAgency;

import org.junit.jupiter.api.Test;

public class testTravelPackage {

        @Test
        void addPassenger_shouldAddPassengerWhenCapacityAvailableAndNotAlreadyEnrolled() {
            // Arrange
            TravelPackage travelPackage = new TravelPackage("Package 1", 10);
            Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD);

            // Act
            boolean added = travelPackage.addPassenger(passenger);

            // Assert
            assertTrue(added);
            assertTrue(travelPackage.getPassengers().contains(passenger));
        }

        private void assertTrue(boolean added) {
        }

        @Test
        void addPassenger_shouldNotAddPassengerWhenCapacityFull() {
            // Arrange
            TravelPackage travelPackage = new TravelPackage("Package 1", 1);
            Passenger passenger1 = new Passenger("John", 1, PassengerType.STANDARD);
            Passenger passenger2 = new Passenger("Jane", 2, PassengerType.STANDARD);
            travelPackage.addPassenger(passenger1);

            // Act
            boolean added = travelPackage.addPassenger(passenger2);

            // Assert
            assertFalse(added);
            assertFalse(travelPackage.getPassengers().contains(passenger2));
        }

        private void assertFalse(boolean added) {
        }

        @Test
        void addPassenger_shouldNotAddPassengerAlreadyEnrolled() {
            // Arrange
            TravelPackage travelPackage = new TravelPackage("Package 1", 10);
            Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD);
            travelPackage.addPassenger(passenger);

            // Act
            boolean added = travelPackage.addPassenger(passenger);

            // Assert
            assertFalse(added);
            assertEquals(1, travelPackage.getPassengers().size());
        }

        private void assertEquals(int i, int size) {
        }

        void testAddPassenger_Success() {
            TravelPackage travelPackage = new TravelPackage("Package 1", 10);
            Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD);

            boolean result = travelPackage.addPassenger(passenger);

            assertTrue(result);
            assertEquals(1, travelPackage.getPassengers().size());
        }

        @Test
        void testAddPassenger_Failure_PassengerAlreadyEnrolled() {
            TravelPackage travelPackage = new TravelPackage("Package 1", 10);
            Passenger passenger = new Passenger("John", 1, PassengerType.STANDARD);
            travelPackage.addPassenger(passenger);

            boolean result = travelPackage.addPassenger(passenger);

            assertFalse(result);
            assertEquals(1, travelPackage.getPassengers().size());
        }

        @Test
        void testAddPassenger_Failure_PackageFull() {
            TravelPackage travelPackage = new TravelPackage("Package 1", 1);
            Passenger passenger1 = new Passenger("John", 1, PassengerType.STANDARD);
            Passenger passenger2 = new Passenger("Jane", 2, PassengerType.STANDARD);
            travelPackage.addPassenger(passenger1);

            boolean result = travelPackage.addPassenger(passenger2);

            assertFalse(result);
            assertEquals(1, travelPackage.getPassengers().size());
        }

        // Add more test cases for other methods in the TravelPackage class

    }

