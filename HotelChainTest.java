import org.junit.Test;
import org.junit.Assert;

public class HotelChainTest {

    @Test
    public void testMakeReservation_SuccessfulFlow() throws Exception {
        HotelChain chain = new HotelChain();
        Hotel h = new Hotel("PC");
        chain.addHotel(h);
        ReserverPayer rp = new ReserverPayer("1", "Zain", "ISB", "5555");

        // Simple check: Agar ye crash nahi hua, to test pass hai
        chain.makeReservation("PC", 99, "Jan-1", "Jan-5", rp);
    }

    @Test
    public void testAddHotel_Storage() {
        HotelChain chain = new HotelChain();
        Hotel h = new Hotel("Serena");
        chain.addHotel(h);
    }

    @Test(expected = Exception.class)
    public void testMakeReservation_InvalidHotel_ThrowsException() throws Exception {
        HotelChain chain = new HotelChain();
        ReserverPayer rp = new ReserverPayer("1", "Ali", "KHI", "999");

        // Agar hotel nahi mila to Exception ani chahiye (expected = Exception.class)
        chain.makeReservation("NonExistentHotel", 1, "Jan 1", "Jan 5", rp);
    }
}