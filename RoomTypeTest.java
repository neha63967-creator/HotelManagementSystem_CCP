import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoomTypeTest {
    @SuppressWarnings("deprecation")
    @Test
    public void testRoomTypeConstructor_ShouldStoreValues() throws HotelSystemException {
        // Arrange & Act
        RoomType type = new RoomType("Deluxe", 500.0);
        // Assert
        assertEquals("Deluxe", type.getKind());
        assertEquals(500.0, type.getCost());
    }
}