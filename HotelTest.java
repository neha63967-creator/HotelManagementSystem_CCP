import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    @Test
    public void testCreateReservation_InHotel() {
        // Arrange
        // Hotel name , Name object hai
        Name hName = new Name("Serena", "Karachi");
        Hotel hotel = new Hotel(hName);
        
        // Act
        hotel.createReservation(); 
        
        // Assert
        assertNotNull(hotel.getName());
        assertEquals("Serena Karachi", hotel.getName().toString());
    }

    @Test
    public void testAvailability_WithRooms() throws Exception {
        // Arrange
        Name hName = new Name("Marriott", "Hotel");
        Hotel hotel = new Hotel(hName);

        RoomKind kind = new RoomKind("Single");
        Money price = new Money(5000);
        RoomType type = new RoomType(kind, price);
       
        Room r = new Room(101, type);

        hotel.addRoom(r);
        
        // Act & Assert

        assertTrue(hotel.available()); 
    }
}