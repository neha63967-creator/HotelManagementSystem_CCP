import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RoomTypeTest {
    
    @Test
    public void testRoomAndRoomTypeConnection() throws Exception {
        // 1. Arrange: Objects taiyar karein
        RoomKind deluxe = new RoomKind("Deluxe");
        Money price = new Money(5000);
        RoomType type = new RoomType(deluxe, price);

        // 2. Act: Room banayein aur type assign karein
        // UML ke mutabiq Room aur RoomType ka 1-to-1 connection hai
        Room room = new Room(101, type);

        // 3. Assert: Verify karein ke data sahi store hua
        assertEquals("Deluxe", room.getType().getKind().getType());
        
        // Money object se amount nikal kar compare karein
        assertEquals(5000.0, room.getType().getCost().getAmount(), 0.01);
    }
}