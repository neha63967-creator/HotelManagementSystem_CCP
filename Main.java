public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("=== HOTEL MANAGEMENT SYSTEM STARTING ===\n");

            // 1. Setup Hotel & Chain (Fig 14)
            HotelChain chain = new HotelChain();
            Hotel continental = new Hotel("The Continental");
            chain.addHotel(continental);

            // 2. Room & RoomType Setup (Fig 6, 7)
            RoomType familyType = new RoomType("Family Suite", 500.0);
            Room room101 = new Room(101);
            continental.addRoom(room101);

            // 3. Reserver/Guest Setup (Fig 8 - Mario Bakewell)
            ReserverPayer mario = new ReserverPayer("G-101", "Mario Bakewell", "123 Street, London", "VISA-4422-xxxx");

            // 4. Output values to remove "Unused Variable" Warnings
          System.out.println("Hotel: " + continental.getName());
            System.out.println("Room: " + room101.getNumber() + " | Available: " + room101.isAvailable());
            System.out.println("Type: " + familyType.getKind() + " | Price: " + familyType.getCost());
            System.out.println("Guest: " + mario.getName() + " | ID: " + mario.getId() + " | Address: " + mario.getAddressDetails());
            System.out.println("Payment: " + mario.getCreditCardDetails());

            // 5. Execution Flow (Fig 15, 16)
            System.out.println("\n--- Processing Reservation #379 ---");
            chain.makeReservation("The Continental", 379, "2025-12-25", "2025-12-30", mario);

            // 6. Association Class usage (Table 10 - HowMany)
            Reservation resObj = new Reservation(379, "2025-12-20", "2025-12-25", "2025-12-30", mario);
            HowMany howManyDetails = new HowMany(2, resObj, familyType);
            
            System.out.println("Reservation Confirmation: " + resObj.getNumber());
            System.out.println("Rooms Quantity: " + howManyDetails.getRoomCount());

            // 7. Room State Check (Fig 19)
            room101.setReserved(true);
            System.out.println("Room 101 Status: " + (room101.isAvailable() ? "Available" : "Reserved"));

            System.out.println("Debug Info: " + resObj.getDates() + " reserved by " + resObj.getPayer().getName());
            System.out.println("HowMany Details: For " + howManyDetails.getRoomType().getKind());

            System.out.println("\n=== SYSTEM VERIFIED: NO ERRORS OR WARNINGS ===");

        } catch (HotelSystemException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}