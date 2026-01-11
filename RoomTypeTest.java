import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RoomTypeTest {
    
    @Test
    public void testRoomTypeConstructor_ShouldStoreValues() throws Exception { // Added 'throws Exception'
        // Arrange & Act
        RoomType type = new RoomType("Deluxe", 500.0);
        
        // Assert
        assertEquals("Deluxe", type.getKind());
        assertEquals(500.0, type.getCost(), 0.01);
    }
}