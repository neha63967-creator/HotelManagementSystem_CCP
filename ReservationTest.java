import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReservationTest {
    @Test
    public void testReservationCreation() {
        // Arrange
        ReserverPayer rp = new ReserverPayer("1", "Ali", "KHI", "123");
        Reservation res = new Reservation(555, "2026-01-08", "2026-01-10", "2026-01-15", rp);
        
        // Act & Assert
        assertEquals(555, res.getNumber());
        assertEquals("2026-01-10 to 2026-01-15", res.getDates());
        assertEquals(rp, res.getPayer());
    }

    @Test
    public void testReservationDetails() {
        // Arrange
        ReserverPayer rp = new ReserverPayer("ID-1", "Zain", "ISB", "5555");
        Reservation res = new Reservation(99, "2026-01-01", "2026-01-05", "2026-01-10", rp);

        // Act & Assert
        assertEquals("2026-01-05 to 2026-01-10", res.getDates());
        assertEquals(rp, res.getPayer());
        assertEquals(99, res.getNumber());
    }
}