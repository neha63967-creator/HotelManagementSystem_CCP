import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Date;
import java.util.Calendar;

public class ReservationTest {
    
    private Date createDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return cal.getTime();
    }

    @Test
    public void testReservationCreation() {
        // Arrange
        Name name = new Name("Ali", "Khan");
        // FIX: Address sirf 2 Strings leta hai aapki class ke mutabiq
        Address addr = new Address("Khi", "Street 1"); 
        Identity id = new Identity("1");
        CreditCard card = new CreditCard("1234-5678");
        
        ReserverPayer rp = new ReserverPayer(id, name, addr, card);
        
        Date resDate = new Date();
        Date start = createDate(2026, 0, 10);
        Date end = createDate(2026, 0, 15);

        // Act
        Reservation res = new Reservation(555, resDate, start, end, rp);
        
        // Assert
        assertEquals(555, res.getNumber());
        assertEquals(rp, res.getPayer()); 
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDates_ShouldThrowException() {
        Name name = new Name("Zain", "Ahmed");
        Address addr = new Address("LHR", "Street A");
        ReserverPayer rp = new ReserverPayer(new Identity("ID-1"), name, addr, new CreditCard("0000000000001234"));
        
        Date start = createDate(2026, 0, 15);
        Date end = createDate(2026, 0, 10); 

        new Reservation(99, new Date(), start, end, rp);
    }
}