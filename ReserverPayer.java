
public class ReserverPayer extends Guest {
    private String creditCardDetails; // Figure 13

    public ReserverPayer(String id, String name, String addressDetails, String creditCardDetails) {
        // Super ka matlab hai Parent (Guest) ke constructor ko data bhejna
        super(id, name, addressDetails); 
        this.creditCardDetails = creditCardDetails;
    }

    public String getCreditCardDetails() { return creditCardDetails; }
}