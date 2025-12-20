import java.util.*;

public class HotelChain {
    private Map<String, Hotel> hotels = new HashMap<>();

    public void makeReservation(String hotelName, int resNum, String start, String end, ReserverPayer rp) throws HotelSystemException {
        // Defensive Check: Agar payer null hai
        if (rp == null) {
            throw new HotelSystemException("Error: Reserver/Payer information is missing!");
        }

        Hotel targetHotel = hotels.get(hotelName);
        
        // Defensive Check: Agar hotel nahi mila
        if (targetHotel == null) {
            throw new HotelSystemException("Error: Hotel '" + hotelName + "' does not exist in our chain.");
        }

        targetHotel.createReservation(resNum, "20-12-2025", start, end, rp);
    }
    
    public void addHotel(Hotel h) {
        if (h != null) hotels.put(h.getName(), h);
    }
}