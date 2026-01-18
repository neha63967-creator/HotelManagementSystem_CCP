import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReserverPayerTest {
    @Test
    public void testReserverPayerDetails() {
        // Arrange
        Identity pId = new Identity("RP1");
        Name pName = new Name("Sara", "Khan");
        // FIX: Sirf 2 parameters (city, street)
        Address pAddress = new Address("Lahore", "Main Blvd"); 
        // FIX: CreditCard number kam se kam 4 digits ka hona chahiye toString() ke liye
        CreditCard pCard = new CreditCard("12345678");

        // Act
        ReserverPayer rp = new ReserverPayer(pId, pName, pAddress, pCard);
        
        // Assert
        assertEquals(pId, rp.getId());
        assertEquals("Sara Khan", rp.getName().toString());
    }

    @Test
    public void testCreateMethod() {
        // Arrange
        Address initialAddr = new Address("LHR", "Street 1");
        ReserverPayer rp = new ReserverPayer(new Identity("RP-001"), new Name("Ali", ""), initialAddr, new CreditCard("12345678"));
        
        // Act
        Name newName = new Name("Ali", "Khan");
        Address newAddr = new Address("Karachi", "Street 10");
        rp.create(newName, newAddr);
        
        // Assert
        assertEquals("Ali Khan", rp.getName().toString());
    }
}