public class ReserverPayer extends Guest {

    private String id;
    private String creditCardDetails;

    public ReserverPayer(
            String id,
            String name,
            String address,
            String card
    ) {
        this.id = id;
        this.name = name;
        this.addressDetails = address;
        this.creditCardDetails = card;
    }

    @Override
    public void create(String name, String addressDetails) {
        super.create(name, addressDetails);
        System.out.println(
            "Reserver/Payer identity verified with ID: " + this.id
        );
    }

    public String getId() {
        return id;
    }

    public String getCreditCardDetails() {
        return creditCardDetails;
    }
}
