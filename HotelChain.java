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

        if (canMakeReservation()) {
            Hotel hotel = hotels.get(hotelName);
            if (hotel == null)
                throw new Exception("Hotel not found!");

            hotel.createReservation(resNum, "2026-01-07", start, end, rp);
        }
    }

    public void cancelReservation(int resNum) {
        if (canCancelReservation()) {
            System.out.println(
                "Processing Cancellation for Reservation #" + resNum
            );
        }
    }

    public void checkInGuest(String id) {
        if (canCheckInGuest()) {
            System.out.println("Checking in Guest with ID: " + id);
        }
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

    public void addHotel(Hotel h) {
        hotels.put(h.getName(), h);
    }
}
