import java.util.Calendar;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println("===== HOTEL MANAGEMENT SYSTEM: OPERATIONAL EXECUTION =====");
        System.out.println("==========================================================\n");
        try {
            HotelChain globalChain = new HotelChain();
            System.out.println("[SYSTEM]: HotelChain 'Global-Stay' has been successfully initialized.");
            System.out.println("==========================================================\n");
            System.out.println("[STEP 2]:Now creating 5 hotels and adding them to the chain...\n");
           Hotel serena = new Hotel(new Name("Serena", "Karachi"));
            Hotel marriott = new Hotel(new Name("Marriott", "Islamabad"));
            Hotel pc = new Hotel(new Name("PC-Hotel", "Lahore"));
            Hotel avari = new Hotel(new Name("Avari", "Karachi"));
            Hotel regent = new Hotel(new Name("Regent-Plaza", "Karachi"));

            globalChain.addHotel(serena);
            globalChain.addHotel(marriott);
            globalChain.addHotel(pc);
            globalChain.addHotel(avari);
            globalChain.addHotel(regent);

            System.out.println("Current Hotels in Global-Stay Chain:");
            System.out.println("1. " + serena.getName());
            System.out.println("2. " + marriott.getName());
            System.out.println("3. " + pc.getName());
            System.out.println("4. " + avari.getName());
            System.out.println("5. " + regent.getName());
            System.out.println("==========================================================\n");

            RoomType deluxe = new RoomType(new RoomKind("Deluxe"), new Money(500.0));
            RoomType standard = new RoomType(new RoomKind("Standard"), new Money(250.0));

            System.out.println("[STEP 3]: RoomTypes 'Deluxe' aur 'Standard' are created ");
            System.out.println("==========================================================\n");

            // STEP 4: Making rooms for hotels
            Room r101 = new Room(101, deluxe);
            Room r102 = new Room(102, standard);
            serena.addRoom(r101);
            serena.addRoom(r102);

            Room r201 = new Room(201, deluxe); 
            Room r202 = new Room(202, standard);
            marriott.addRoom(r201);
            marriott.addRoom(r202);

            Room r301 = new Room(301, deluxe);
            Room r302 = new Room(302, standard);
            Room r303 = new Room(303, standard);
            pc.addRoom(r301);
            pc.addRoom(r302);
            pc.addRoom(r303);

            Room r401 = new Room(401, deluxe);
            Room r402 = new Room(402, standard);
            avari.addRoom(r401);
            avari.addRoom(r402);

            Room r501 = new Room(501, standard);
            regent.addRoom(r501);

            System.out.println("[STEP 4]: Rooms are added to respective hotels.");
            System.out.println("==========================================================\n");
            System.out.println("--- CURRENT HOTEL INVENTORY & STATUS REPORT ---");

            // Reporting for Serena
            System.out.println("\nHotel: Serena");
            System.out.println("  - Room 101 | Type: Deluxe   | Cost: " + deluxe.getCost() + " | Status: " + (r101.isAvailable() ? "Available" : "Occupied"));
            System.out.println("  - Room 102 | Type: Standard | Cost: " + standard.getCost() + " | Status: " + (r102.isAvailable() ? "Available" : "Occupied"));

            // Reporting for Marriott
            System.out.println("\nHotel: Marriott");
            System.out.println("  - Room 201 | Type: Deluxe   | Cost: " + deluxe.getCost() + " | Status: " + (r201.isAvailable() ? "Available" : "Occupied"));
            System.out.println("  - Room 202 | Type: Standard | Cost: " + standard.getCost() + " | Status: " + (r202.isAvailable() ? "Available" : "Occupied"));

            // Reporting for PC-Hotel
            System.out.println("\nHotel: PC-Hotel");
            System.out.println("  - Room 301 | Type: Deluxe   | Cost: " + deluxe.getCost() + " | Status: " + (r301.isAvailable() ? "Available" : "Occupied"));
            System.out.println("  - Room 302 | Type: Standard | Cost: " + standard.getCost() + " | Status: " + (r302.isAvailable() ? "Available" : "Occupied"));
            System.out.println("  - Room 303 | Type: Standard | Cost: " + standard.getCost() + " | Status: " + (r303.isAvailable() ? "Available" : "Occupied"));

            // Reporting for Avari
            System.out.println("\nHotel: Avari");
            System.out.println("  - Room 401 | Type: Deluxe   | Cost: " + deluxe.getCost() + " | Status: " + (r401.isAvailable() ? "Available" : "Occupied"));
            System.out.println("  - Room 402 | Type: Standard | Cost: " + standard.getCost() + " | Status: " + (r402.isAvailable() ? "Available" : "Occupied"));

            // Reporting for Regent-Plaza
            System.out.println("\nHotel: Regent-Plaza");
            System.out.println("  - Room 501 | Type: Standard | Cost: " + standard.getCost() + " | Status: " + (r501.isAvailable() ? "Available" : "Occupied"));
            System.out.println("\n>>> INVENTORY CHECK COMPLETE. PROCEEDING TO RESERVATIONS...");
            System.out.println("==========================================================\n");
            
            // --- PROCESS START: RESERVATION & CHECKING ---
            // CASE 1: 
            System.out.println("RESERVATION & CHECKING PROCESS STARTED...\n");
            System.out.println(">>> Guest: 'Zain' is looking for his favorite hotel...");
            
            ReserverPayer zain = new ReserverPayer(
                new Identity("RP-01"), 
                new Name("Zain", "Ali"), 
                new Address("Lahore", "Main Road"), 
                new CreditCard("555512345678VISA")
            );
              
            // STEP 1: Search for Hotel in Global Chain
            System.out.println("[CHECKING]: Does 'Serena' exist in our Global-Stay Chain?");
            try {
                System.out.println("============== Guest Reservation Attempt ==============\n");
                
                // For Date objects (January 2026 )
                Calendar cal = Calendar.getInstance();
                cal.set(2026, Calendar.MAY, 1);
                Date startDate = cal.getTime();
                cal.set(2026, Calendar.MAY, 5);
                Date endDate = cal.getTime();

                globalChain.makeReservation(serena, zain, 1001, startDate, endDate);
                
                System.out.println("[SUCCESS]: 'Serena' found in our system!");
                System.out.println("========================================================\n");

                // STEP 2: Link Reservation with RoomType (Association Class HowMany)
                Reservation res1001 = new Reservation(1001, new Date(), startDate, endDate, zain);
                new HowMany(1, res1001, deluxe); 
                System.out.println("========================================================\n");

                // STEP 3: Now search for Room availability
                System.out.println("CHECKING ROOM AVAILABILITY...");
                System.out.println("[CHECKING]: Looking for an available Deluxe room in Serena...");
                
                if (serena.available()) { 
                    System.out.println("[LOG]: Rooms are available in Serena.");
                    System.out.println("========================================================\n");

                    // STEP 4: Physical Occupancy (Check-in)
                    System.out.println("Processing Check-in for Zain Ali...");
         
                    globalChain.checkInGuest(r101, zain.getName(), zain.getAddressDetails()); 
        
                    r101.createGuest(zain.getName(), zain.getAddressDetails()); 
                    
                    System.out.println("[STATUS]: Room 101 is now occupied by Zain Ali.");
                    System.out.println("\n================ Zain's Check-in completed ===============\n");
                } else {
                    System.out.println("[SORRY]: No rooms are available in Serena at this time.");
                }
            } catch (Exception e) {
                System.err.println("[DENIED]: Error in process: " + e.getMessage());
            }

        // --- CASE 2: Sara's Attempt (Handling Occupied Rooms) ---
            System.out.println("\n>>> Now Guest: 'Sara' wants to book a room at Serena.");
            
            ReserverPayer sara = new ReserverPayer(
                new Identity("RP-02"), 
                new Name("Sara", "Khan"), 
                new Address("Karachi", "Clifton"), 
                new CreditCard("424212345678VISA")
            );

            System.out.println("[CHECKING]: Room Availability for Sara Khan...");

            // Check Room 101 first
            if (!r101.isAvailable()) {
                System.out.println("[CONFLICT ARISE]: Room 101 is already occupied by " + zain.getName());
                System.out.println("Searching for the next available room in Serena...\n");

                // Check Room 102
                if (r102.isAvailable()) {
                    System.out.println("[SUCCESS]: Room 102 is available for Sara.");

                    Calendar calSara = Calendar.getInstance();
                    calSara.set(2026, Calendar.MAY, 10);
                    Date startSara = calSara.getTime();
                    calSara.set(2026, Calendar.MAY, 15);
                    Date endSara = calSara.getTime();

                    System.out.println("============== Guest Reservation Attempt ==============\n");
                 
                    globalChain.makeReservation(serena, sara, 1002, startSara, endSara);
                    System.out.println("========================================================\n");
                    
                    // HowMany linkage for Sara
                    Reservation res1002 = new Reservation(1002, new Date(), startSara, endSara, sara);
                    new HowMany(1, res1002, deluxe);
                    System.out.println("========================================================\n");
                    
                    // Sara Check-in
                    System.out.println("Processing Check-in for Sara Khan...");
                    globalChain.checkInGuest(r102, sara.getName(), sara.getAddressDetails());
                    r102.createGuest(sara.getName(), sara.getAddressDetails());
                    
                    System.out.println("[STATUS]: Sara Khan has been successfully settled in Room 102.");
                    System.out.println("========================================================\n");
                } else {
                    System.out.println("[SORRY]: All Deluxe rooms in Serena are currently full.");
                }
            }

          // --- CASE 3: Guest Check-out and Immediate Re-booking ---
            System.out.println(">>> Zain Ali is ending his stay and checking out of the hotel...");
            
            globalChain.checkOutGuest(r101); 
            System.out.println("[LOG]: Inventory Update: Room 101 is now VACANT and ready for the next guest.");
            System.out.println("========================================================\n");
            
            // New Guest 'Ali Raza' arrives looking for a room in Serena
            System.out.println(">>> New Guest 'Ali Raza' is requesting a room at Serena Hotel.");
            ReserverPayer ali = new ReserverPayer(
                new Identity("RP-03"), 
                new Name("Ali", "Raza"), 
                new Address("Islamabad", "G-11"), 
                new CreditCard("444455556666CASH")
            );

            // Check if the recently vacated room is now available for Ali
            if (r101.isAvailable()) {
                System.out.println("[SUCCESS]: Room 101 is available. Initiating booking for Ali Raza.");
        
                Calendar calAli = Calendar.getInstance();
                calAli.set(2026, Calendar.JUNE, 1);
                Date startAli = calAli.getTime();
                calAli.set(2026, Calendar.JUNE, 10);
                Date endAli = calAli.getTime();

                // Create Reservation for Ali
                System.out.println("============== Guest Reservation Attempt ==============\n");
                globalChain.makeReservation(serena, ali, 1003, startAli, endAli);
                System.out.println("========================================================\n");
                
                // Linking with HowMany
                Reservation res1003 = new Reservation(1003, new Date(), startAli, endAli, ali);
                new HowMany(1, res1003, deluxe);
                System.out.println("========================================================\n");
                
                // Ali Check-in
                System.out.println("Processing Check-in for Ali Raza...");
                globalChain.checkInGuest(r101, ali.getName(), ali.getAddressDetails());
                r101.createGuest(ali.getName(), ali.getAddressDetails());
                
                System.out.println("[STATUS]: Ali Raza has successfully checked into Room 101 (previously occupied by Zain).");
                System.out.println("========================================================\n");
            } else {
                System.out.println("[ALERT]: Room 101 is still showing as occupied.");
            }

           // --- CASE 4: Invalid Hotel (Defensive Check) ---
            System.out.println(">>> Guest: 'Hamza' is attempting to book at a non-existent hotel...");
            
            try {
                ReserverPayer hamza = new ReserverPayer(
                    new Identity("RP-04"), 
                    new Name("Hamza", "Irfan"), 
                    new Address("Dubai", "Marina"), 
                    new CreditCard("1111222233334444")
                );

                // Simulation: Hotel which we dont have in chain
                Hotel nonExistentHotel = null; 

                globalChain.makeReservation(nonExistentHotel, hamza, 9999, new Date(), new Date());

            } catch (HotelSystemException e) {
                // Hamari custom exception yahan catch hogi
                System.err.println("[DENIED]: Validation Failed: " + e.getMessage());
                System.out.println("[SYSTEM]: Hamza was notified that the hotel is not part of our chain.");
            }

        } catch (Exception e) {
            System.err.println("[CRITICAL ERROR]: " + e.getMessage());
        }

        System.out.println("\n=========================================");
        System.out.println("   ALL SCENARIOS COMPLETED SUCCESSFULLY");
        System.out.println("=========================================");
    }
}