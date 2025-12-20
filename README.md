# HotelManagementSystem_CCP

This project is a Java-based implementation of a **Hotel Management System**, developed as part of the Software Construction course. The system follows professional OOP principles and follows the provided UML diagrams in document (Figures 6-19).

## Key Features
* **Hotel Management:** Add and manage different hotels.
* **Room Booking:** Handles different room types (Family, Single, etc.) and availability.
* **Guest Records:** Stores guest details and payment info.
* **Reservation System:** Links guests with rooms and specific dates.

## Technology Used
* **Language:** Java
* **Concepts:** Inheritance, Encapsulation, and HashMap for fast searching.

## 🚀 How to Run
1. Open your terminal in the project folder.
2. Compile the files:
   `javac -d . *.java`
3. Run the program:
   `java HotelManagementSystem_CCP.Main`

## Project Features & UML Mapping

| Version | Focus Area                    | UML Reference                            |
| ------  | ----------------------------- | ---------------------------------------- |
| **V1**  | Domain Model & Core Classes   | Figure 6, 7 & 13                         |
| **V2**  | Inheritance & Hierarchy       | Guest & ReserverPayer (Fig 13)           |
| **V3**  | Associations & Bridge Classes | Reservation & HowMany (Fig 14, Table 10) |
| **V4**  | Behavioral Logic & State      | Room States & Flow (Fig 15, 16, 19)      |
| **V5**  | Defensive Programming         | Custom Exceptions & Null Checks          |
| **V6**  | Integration & Testing         | Snapshot Verification (Fig 8-12)         |

*Developed as an incremental Software Construction project.*