import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RoomTest {
    @Test
    public void testInitialAvailability_ShouldBeTrue() {
        Room room = new Room(101);
        assertTrue(room.isAvailable());
    }

    @Test
    public void testCreateGuest_ShouldMakeRoomUnavailable() {
        // Arrange
        Room room = new Room(102);
        // Act
        room.createGuest("G1", "John", "London");
        // Assert
        assertFalse(room.isAvailable());
    }
}