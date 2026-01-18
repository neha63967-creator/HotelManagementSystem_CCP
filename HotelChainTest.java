import org.junit.Test;
import java.util.Date;
import java.util.Calendar;

public class HotelChainTest {

    // Helper method to create dates easily
    private Date createDate(int daysFromNow) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, daysFromNow);
        return cal.getTime();
    }

    @Test
    public void testMakeReservation_SuccessfulFlow() throws Exception {
        // Arrange
        HotelChain chain = new HotelChain();
        
        // Hotel create karein (Name object ke sath)
        Hotel h = new Hotel(new Name("PC", "Karachi"));
        chain.addHotel(h);

        // ReserverPayer ke liye objects taiyar karein
        Identity id = new Identity("ID-001");
        Name pName = new Name("Zain", "Ahmed");
        Address addr = new Address("Islamabad", "Sector F-6");
        CreditCard card = new CreditCard("1234567812345678");
        ReserverPayer rp = new ReserverPayer(id, pName, addr, card);

        // Dates taiyar karein
        Date start = createDate(1);
        Date end = createDate(5);

        // Act & Assert
        // Naye HotelChain logic ke mutabiq objects pass karein
        chain.makeReservation(h, rp, 99, start, end);
    }

    @Test
    public void testAddHotel_Storage() throws Exception {
        // Arrange
        HotelChain chain = new HotelChain();
        Hotel h = new Hotel(new Name("Serena", "Islamabad"));
        
        // Act
        chain.addHotel(h);
    }

    @Test(expected = Exception.class)
    public void testMakeReservation_NullHotel_ThrowsException() throws Exception {
        // Arrange
        HotelChain chain = new HotelChain();
        Identity id = new Identity("ID-002");
        ReserverPayer rp = new ReserverPayer(id, new Name("Ali", "Khan"), 
                                            new Address("Khi", "Street 1"), 
                                            new CreditCard("000011112222"));

        // Act
        // Agar hotel null bhejenge to humne HotelChain mein check lagaya hua hai
        chain.makeReservation(null, rp, 1, new Date(), new Date());
    }
}