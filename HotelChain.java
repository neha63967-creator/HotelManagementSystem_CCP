import java.util.*;

public class HotelChain {

    private Map<String, Hotel> hotels = new HashMap<>();
    private List<ReserverPayer> payers = new ArrayList<>();

    public void makeReservation(
            String hotelName,
            int resNum,
            String start,
            String end,
            ReserverPayer rp
    ) throws Exception {

        // Defensive: Check for null or empty inputs
        if (hotelName == null || hotelName.trim().isEmpty()) {
            throw new HotelSystemException("Hotel name cannot be empty.");
        }
        if (rp == null) {
            throw new HotelSystemException("Reserver details are required.");
        }

        Hotel hotel = hotels.get(hotelName);
        if (hotel == null) {
            throw new HotelSystemException("Hotel '" + hotelName + "' not found in our chain.");
        }

        hotel.createReservation(resNum, "2026-01-10", start, end, rp);
    }

    public void cancelReservation(int resNum) {
        if (canCancelReservation()) {
            System.out.println(
                "Processing Cancellation for Reservation #" + resNum
            );
        }
    }

    public void checkInGuest(String id) {
        if (id == null) {
            System.out.println("Error: Invalid ID provided.");
            return;
        }
        System.out.println("Checking in Guest with ID: " + id);
    }

    public void checkOutGuest(String id) {
        if (canCheckOutGuest()) {
            System.out.println("Checking out Guest with ID: " + id);
        }
    }

    public void createReserverPayer(
            String id,
            String name,
            String addr,
            String card
    ) {
        ReserverPayer rp = new ReserverPayer(id, name, addr, card);
        rp.create(name, addr);
        payers.add(rp);
    }

    private boolean canMakeReservation() {
        return true;
    }

    private boolean canCancelReservation() {
        return true;
    }

    private boolean canCheckInGuest() {
        return true;
    }

    private boolean canCheckOutGuest() {
        return true;
    }

    public void addHotel(Hotel h) throws HotelSystemException {
        if (h == null) throw new HotelSystemException("Cannot add a null hotel.");
        hotels.put(h.getName(), h);
    }
}
