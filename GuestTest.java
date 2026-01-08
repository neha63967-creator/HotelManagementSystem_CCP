import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuestTest {
    @Test
    public void testCreateGuest_ShouldSetDetails() {
        // Arrange
        Guest guest = new Guest();
        // Act
        guest.create("Ali Khan", "Karachi, Pakistan");
        // Assert
        assertEquals("Ali Khan", guest.getName());
        assertEquals("Karachi, Pakistan", guest.getAddressDetails());
    }

    
}