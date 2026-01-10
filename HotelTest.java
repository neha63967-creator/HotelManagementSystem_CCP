import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HotelTest {
    @Test
    public void testCreateReservation_InHotel() {
        // Arrange
        Hotel hotel = new Hotel("Serena");
        ReserverPayer rp = new ReserverPayer("1", "Ali", "KHI", "123");
        
        // Act
        Reservation res = hotel.createReservation(1, "today", "tomorrow", "next-week", rp);
        
        // Assert
        assertNotNull(res);
        assertEquals(1, res.getNumber());
    }

    @Test
    public void testAvailability_WithRooms() throws HotelSystemException {
        Hotel hotel = new Hotel("Marriott");
        Room r = new Room(101);
        hotel.addRoom(r);
        RoomType type = new RoomType("Single", 100);
        
        assertTrue(hotel.available(type));
    }

    
}