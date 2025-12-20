import java.util.*;

public class HotelChain {
    private Map<String, Hotel> hotels = new HashMap<>();

    public void addHotel(Hotel h) { hotels.put(h.getName(), h); }

    // User calls this (Fig 15, 18)
    public void makeReservation(String hotelName, int resNum, String start, String end, ReserverPayer rp) {
        Hotel targetHotel = hotels.get(hotelName);
        if (targetHotel != null) {
            targetHotel.createReservation(resNum, "20-12-2025", start, end, rp);
        } else {
            System.out.println("Error: Hotel not found!");
        }
    }
}