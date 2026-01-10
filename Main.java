public class Main {
    public static void main(String[] args) {

        System.out.println("========================================================");
        System.out.println("\n ============ HOTEL MANAGEMENT SYSTEM (V13) ============ \n");
        System.out.println("========================================================\n");

        try {
            // --- PART A: THE HAPPY PATH (Successful Flow) ---
            System.out.println(">>> PHASE 1: SUCCESSFUL SYSTEM FLOW TEST");
            
            RoomType suite = new RoomType("Deluxe Suite", 450.0);
            Room room101 = new Room(101);
            
            Hotel myHotel = new Hotel("Serena");
            myHotel.addRoom(room101);
            
            HotelChain chain = new HotelChain();
            chain.addHotel(myHotel);
            
            ReserverPayer rp = new ReserverPayer("RP-01", "Zain", "Lahore", "5555-4444");
            
            // Successful reservation
            chain.makeReservation("Serena", 1001, "2026-05-01", "2026-05-10", rp);
            
            Reservation res = new Reservation(2002, "2026-01-09", "2026-06-01", "2026-06-05", rp);
            HowMany linkage = new HowMany(2, res, suite);

            System.out.println("Verified Linkage for: " + linkage.getRoomCount() + " rooms.");
            System.out.println("\n[SUCCESS] Happy path completed without errors.\n");

            // --- PART B: DEFENSIVE PROGRAMMING TEST (Intentional Errors) ---
            System.out.println(">>> PHASE 2: DEFENSIVE PROGRAMMING & EXCEPTION TEST");

            // 1. Test: Adding a null hotel
            try {
                System.out.print("Testing null hotel addition: ");
                chain.addHotel(null);
            } catch (HotelSystemException e) {
                System.out.println("CAUGHT: " + e.getMessage());
            }

            // 2. Test: Making reservation for non-existent hotel
            try {
                System.out.print("Testing non-existent hotel: ");
                chain.makeReservation("Grand Hotel", 101, "Jan-1", "Jan-5", rp);
            } catch (HotelSystemException e) {
                System.out.println("CAUGHT: " + e.getMessage());
            }

            // 3. Test: Negative Price Check
            try {
                System.out.print("Testing negative price: ");
                RoomType cheapRoom = new RoomType("Budget", -50.0);
                System.out.println("Room type created: " + cheapRoom.getKind());
            } catch (HotelSystemException e) {
                System.out.println("CAUGHT: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Unexpected System Error: " + e.getMessage());
        }
        
        System.out.println("\n=======================================================");
        System.out.println("   ALL TESTS (SUCCESS & DEFENSIVE) COMPLETED");
        System.out.println("========================================================");
    }
}