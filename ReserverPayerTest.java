import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReserverPayerTest {
    @Test
    public void testReserverPayerDetails() {
        // Arrange
        ReserverPayer rp = new ReserverPayer("RP1", "Sara", "Lahore", "4242-VISA");
        // Act & Assert
        assertEquals("RP1", rp.getId());
        assertEquals("4242-VISA", rp.getCreditCardDetails());
        assertEquals("Sara", rp.getName());
    }

    @Test
    public void testCreateMethod() {
        ReserverPayer rp = new ReserverPayer("RP-001", "Ali", "LHR", "5555");
        // Act
        rp.create("Ali Khan", "Lahore, PK");
        // Assert
        assertEquals("Ali Khan", rp.getName());
    }
}