import java.util.*;

public class HotelChain {
    private Map<String, Hotel> hotels = new HashMap<>();

    public void addHotel(Hotel h) {
        if (h != null) hotels.put(h.getName(), h);
    }

    public void makeReservation(String hotelName, int resNum, String start, String end, ReserverPayer rp) throws HotelSystemException {
        Hotel targetHotel = hotels.get(hotelName);
        if (targetHotel == null) {
            throw new HotelSystemException("Hotel '" + hotelName + "' not found!");
        }
        targetHotel.createReservation(resNum, "20-12-2025", start, end, rp);
    }
}