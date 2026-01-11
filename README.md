#  Hotel Management System (Java OOP):

A professional, object-oriented implementation of a **Hotel Management System**, developed as part of the Software Construction course. This project follows the incremental development model, mapped directly to UML Figures 6-19.

## Key Features:

* **Hotel Hierarchy:** Manage multiple hotels under a unified `HotelChain` controller.
* **Dynamic Room Booking:** Handles `RoomType` costs and availability states (Available/Reserved).
* **Reserver & Payment Logic:** Implements Inheritance with `Guest` and `ReserverPayer` for secure guest records.
* **Association Classes:** Uses `HowMany` to link reservations with specific room requirements.
* **Defensive Programming:** Robust error handling using custom `HotelSystemException` for null checks and negative price validation.

## Technology Stack:

* **Core:** Java (JDK 11+)
* **Testing:** JUnit 4 (20 Unit Tests for full verification).
* **Tools:** VS Code, Git/GitHub.
* **Concepts:** Inheritance, Encapsulation, and HashMap for fast searching.

##  Project Roadmap & UML Mapping

This project was built incrementally. Below is the mapping of versions to specific UML requirements:
 
| Days      | Version Focus | Area                       | Key Implementation & UML Reference                                 |
| :--------:| :-----------: | :------------------------: | :----------------------------------------------------------------: |
| **Day 1** | V1            | Initial Skeleton           | Created Room, RoomType, Guest, and Hotel classes.                  |
| **Day 1** | V2            | Controller & Inheritance   | Added HotelChain controller and ReserverPayer inheritance.         |
| **Day 1** | V3            | Association Classes        | Implemented Reservation and HowMany bridge classes.                |
| **Day 1** | V4            | Behavioral Logic           | Added Reservation logic and Room states based on Fig 15, 16, 19.   |
| **Day 1** | V5            | Defensive Programming      | First implementation of Custom Exceptions and Null Checks.         |
| **Day 1** | V6            | Logic Verification         | Finalized main class and resolved initial errors/warnings.         |
| **Day 1** | V7            | Initial Documentation      | Simple README added for project overview.                          |
| **Day 2** | V8            | System Design              | Implemented full UML structure with all classes and methods.       |
| **Day 3** | V9            | Unit Testing               | Completed and verified all 20 unit tests.                          |
| **Day 4** | V10           | Flow Verification          | Integrated all 8 classes in Main for end-to-end flow testing.      |
| **Day 5** | V11           | Final Refactoring          | Fixed all warnings, maintained UML, and finalized defensive logic. |

**Note:** Private methods (e.g., `canMakeReservation`) are preserved to maintain 100% UML compliance, even if flagged as unused by the IDE.

## How to Run

1. **Clone the Repository:**
git clone https://github.com/neha63967-creator/HotelManagementSystem_CCP.git

2. **Open in VS Code:** Ensure you have the *Java Extension Pack* installed.
3. **Run Main Program:** Execute `Main.java` to see the **Happy Path** and **Defensive Tests** in the terminal.
4. **Run Unit Tests:** Open the *Test Explorer* and click "Run Tests" to verify all 20 test cases.

## Verification Status

* **JUnit Results:** 20/20 Passed (Core functionality 100% verified).
* **Warnings:** 0 Logic Warnings (UML structural notices only).
* **Documentation:** README and Code Comments updated for V12.

Developed as an incremental Software Construction project.
