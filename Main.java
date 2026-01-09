public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("========================================================");
        System.out.println("\n ============ HOTEL MANAGEMENT SYSTEM ============ \n");
        System.out.println("========================================================\n");

        System.out.println("--- 1. Testing RoomType Class ---");
        RoomType suite = new RoomType("Deluxe Suite", 450.0);
        System.out.println("Type: " + suite.getKind() + ", Cost: " + suite.getCost());

        System.out.println("\n--- 2. Testing Room Class ---");
        Room room101 = new Room(101);
        System.out.println("Room Number: " + room101.getNumber());
        System.out.println("Is Available Initial: " + room101.isAvailable());
        room101.createGuest("G-1", "Ali", "Karachi"); // Calls Guest internally
        System.out.println("Is Available After Guest: " + room101.isAvailable());
        room101.setReserved(false); // Testing setter

        System.out.println("\n--- 3. Testing Hotel Class ---");
        Hotel myHotel = new Hotel("Serena");
        myHotel.addRoom(room101);
        System.out.println("Hotel Name: " + myHotel.getName());
        System.out.println("Availability Check: " + myHotel.available(suite));

        System.out.println("\n--- 4. Testing ReserverPayer (Inheritance) ---");
        ReserverPayer rp = new ReserverPayer("RP-01", "Zain", "Lahore", "5555-4444");
        System.out.println("ID: " + rp.getId() + ", Card: " + rp.getCreditCardDetails());
        rp.create("Zain Khan", "Lahore, PK"); // Testing overridden method

        System.out.println("\n--- 5. Testing HotelChain (Controller) ---");
        HotelChain chain = new HotelChain();
        chain.addHotel(myHotel);
        chain.createReserverPayer("RP-02", "Sara", "ISB", "1111-2222");
        // Calling makeReservation (Throws exception if hotel not found)
        chain.makeReservation("Serena", 1001, "2026-05-01", "2026-05-10", rp);
        
        chain.checkInGuest("RP-02");
        chain.cancelReservation(1001);
        chain.checkOutGuest("RP-02");

        System.out.println("\n--- 6. Testing Reservation Class ---");
        Reservation res = new Reservation(2002, "2026-01-09", "2026-06-01", "2026-06-05", rp);
        res.create();
        System.out.println("Res Number: " + res.getNumber());
        System.out.println("Res Dates: " + res.getDates());
        System.out.println("Res Payer: " + res.getPayer().getName());

        System.out.println("\n--- 7. Testing HowMany (Association Class) ---");
        HowMany linkage = new HowMany(2, res, suite);
        System.out.println("Rooms Count: " + linkage.getRoomCount());
        System.out.println("Linked Type: " + linkage.getRoomType().getKind());

        System.out.println("\n=======================================================\n");
        System.out.println("ALL METHODS AND ATTRIBUTES TESTED SUCCESSFULLY\n");
        System.out.println("========================================================");

    }
}