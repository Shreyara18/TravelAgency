# ✈️ Travel Agency Management System

A Java-based Travel Agency Management System built with **Spring Boot** that models travel packages, destinations, activities, and passengers. The application demonstrates object-oriented design principles by managing travel itineraries, passenger enrollment, activity registration, and package information.

---

## ✨ Features

- 📦 Create travel packages with passenger capacity
- 🌍 Add multiple destinations to a travel package
- 🎯 Create activities for each destination
- 👥 Register passengers
- 🏷️ Support multiple passenger types
  - Standard
  - Gold
  - Premium
- 📝 Sign passengers up for activities
- 📋 Print travel package itinerary
- 👤 Display passenger details
- 🎫 Display available activities with remaining capacity

---

## 🛠️ Tech Stack

- Java 20
- Spring Boot 3
- Maven
- JUnit 5

---

## 📂 Project Structure

```text
TravelAgency/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/travelAgency/TravelAgency/
│   │   │       ├── Activity.java
│   │   │       ├── Destination.java
│   │   │       ├── Passenger.java
│   │   │       ├── PassengerType.java
│   │   │       ├── TravelAgencyApplication.java
│   │   │       └── TravelPackage.java
│   │   └── resources/
│   └── test/
│       └── java/
├── pom.xml
├── HLD.text
├── LLD.text
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

- Java 20
- Maven 3.8+

### Clone the repository

```bash
git clone https://github.com/Shreyara18/TravelAgency.git
```

### Navigate to the project

```bash
cd TravelAgency
```

### Build the project

```bash
mvn clean install
```

### Run the application

```bash
mvn spring-boot:run
```

Alternatively,

```bash
./mvnw spring-boot:run
```

---

## 📖 Project Overview

The system models the following entities:

### Travel Package

- Package name
- Passenger capacity
- Destinations
- Registered passengers

### Destination

- Destination name
- Available activities

### Activity

- Activity name
- Description
- Cost
- Capacity
- Associated destination

### Passenger

- Passenger name
- Passenger number
- Passenger type
- Registered activities

---

## 🧪 Testing

Run all unit tests using:

```bash
mvn test
```

The project includes unit tests for:

- Activity
- Destination
- Passenger
- Travel Package

---

## 🏗️ Design

The repository includes:

- **HLD.text** — High-Level Design
- **LLD.text** — Low-Level Design

These documents describe the application's architecture and object-oriented design.

---

## 🔮 Future Enhancements

- 🌐 REST APIs
- 🗄️ Database integration (MySQL/PostgreSQL)
- 🔐 Authentication & Authorization
- 📅 Booking management
- 💳 Payment integration
- 🖥️ Frontend user interface
- 📊 Admin dashboard

---

## 👩‍💻 Author

**Shreya Ranjan**

GitHub: https://github.com/Shreyara18

---
