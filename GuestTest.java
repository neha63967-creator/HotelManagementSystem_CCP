import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GuestTest {
    @Test
    public void testCreateGuest_ShouldSetDetails() {
        // Arrange
        Guest guest = new Guest();
        Name guestName = new Name("Ali", "Khan"); // Objects banaye
        Address guestAddr = new Address("Karachi", "Pakistan");

        // Act
        guest.create(guestName, guestAddr); // Objects pass kiye

        // Assert
        assertEquals("Ali Khan", guest.getName().toString());
        assertEquals("Pakistan, Karachi", guest.getAddressDetails().toString());
    }
}