import java.util.*;

public class HotelChain {

    // UML Associations: Map use kar rahe hain fast lookup ke liye
    private Map<Name, Hotel> hotels = new HashMap<>();
    private Map<Identity, ReserverPayer> payers = new HashMap<>();

    // UML Operation: +makeReservation()
    public void makeReservation(Hotel hotel, ReserverPayer rp, int resNum, Date start, Date end) throws Exception {
        
        // Error Handling: Puraane code ki tarah defensive checks
        if (hotel == null) {
            throw new HotelSystemException("Reservation failed: Hotel object is null.");
        }
        if (rp == null) {
            throw new HotelSystemException("Reservation failed: ReserverPayer details are required.");
        }
        if (start == null || end == null) {
            throw new HotelSystemException("Reservation failed: Stay dates cannot be null.");
        }

        // Business Logic: UML private operations ka istemal
        if (canMakeReservation()) {
            Reservation res = new Reservation(resNum, new Date(), start, end, rp);
            rp.setReservation(res);
            System.out.println("Success: Reservation #" + resNum + " made at " + hotel.getName());
        } else {
            throw new HotelSystemException("System currently not accepting new reservations.");
        }
    }

    // UML Operation: +cancelReservation()
    public void cancelReservation(ReserverPayer rp) throws Exception {
        if (rp == null || rp.getReservation() == null) {
            throw new HotelSystemException("Error: No active reservation found to cancel.");
        }

        if (canCancelReservation()) {
            int oldNum = rp.getReservation().getNumber();
            rp.setReservation(null);
            System.out.println("Success: Reservation #" + oldNum + " has been cancelled.");
        }
    }

    // UML Operation: +checkInGuest()
    public void checkInGuest(Room room, Name guestName, Address addr) throws Exception {
        // Defensive Checks
        if (room == null) throw new HotelSystemException("Check-in failed: Room is null.");
        if (guestName == null || addr == null) throw new HotelSystemException("Check-in failed: Guest details missing.");
        
        if (!room.isAvailable()) {
            throw new HotelSystemException("Check-in failed: Room " + room.getNumber() + " is already occupied.");
        }

        if (canCheckInGuest()) {
            room.createGuest(guestName, addr);
        }
    }

    // UML Operation: +checkOutGuest()
    public void checkOutGuest(Room room) throws Exception {
        if (room == null) throw new HotelSystemException("Check-out failed: Room is null.");
        
        if (room.isAvailable()) {
            System.out.println("Warning: Room " + room.getNumber() + " was already empty.");
            return;
        }

        if (canCheckOutGuest()) {
            System.out.println("Guest checked out from room: " + room.getNumber());
            // Logical check-out: Room class mein occupant null karne ka logic call karein
        }
    }

    // UML Operation: +createReserverPayer()
    public void createReserverPayer(Identity id, Name name, Address addr, CreditCard card) throws Exception {
        // Validation
        if (id == null || name == null || addr == null || card == null) {
            throw new HotelSystemException("Cannot create Payer: All identity and contact details are mandatory.");
        }

        ReserverPayer rp = new ReserverPayer(id, name, addr, card);
        payers.put(id, rp);
        System.out.println("Success: New ReserverPayer added with ID: " + id);
    }

    // --- Private Defensive Logic (UML Specified) ---
    private boolean canMakeReservation() { return true; }
    private boolean canCancelReservation() { return true; }
    private boolean canCheckInGuest() { return true; }
    private boolean canCheckOutGuest() { return true; }

    // Helper to add hotels
    public void addHotel(Hotel h) throws Exception {
        if (h == null) throw new HotelSystemException("Cannot add a null hotel to the chain.");
        hotels.put(h.getName(), h);
    }
}