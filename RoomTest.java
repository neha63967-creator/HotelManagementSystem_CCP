import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RoomTest {
    @Test
    public void testInitialAvailability_ShouldBeTrue() {
        // RoomType ka dummy object (Abhi ke liye null de sakte hain ya object banayein)
        Room room = new Room(101, null); 
        assertTrue(room.isAvailable());
    }

    @Test
    public void testCreateGuest_ShouldMakeRoomUnavailable() {
        // Arrange
        Room room = new Room(102, null);
        Name guestName = new Name("John", "Doe");
        Address guestAddr = new Address("London", "Baker Street");

        // Act
        // Humne Guest class se 'id' parameter hata diya tha UML ke mutabiq
        room.createGuest( guestName, guestAddr); 

        // Assert
        assertFalse(room.isAvailable());
    }
}