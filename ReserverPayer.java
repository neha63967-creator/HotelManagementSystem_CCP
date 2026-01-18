public class ReserverPayer extends Guest {
    // UML Attributes
    private CreditCard creditCardDetails; 
    private Identity id;                  

    // UML Association: 0..1 Reservation
    private Reservation reservation;

    public ReserverPayer(Identity id, Name name, Address address, CreditCard card) {
        // Guest class (Parent) ka setup
        this.create(name, address); 
        this.id = id;
        this.creditCardDetails = card;
    }

    @Override
    public void create(Name name, Address address) {
        super.create(name, address); // Guest class ka create logic
        System.out.println("ReserverPayer profile finalized with Identity: " + id);
    }

    // Reservation ke sath link banane ke liye
    public void setReservation(Reservation res) {
        this.reservation = res;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public Identity getId() { return id; }

    public CreditCard getCreditCardDetails()
     {
    return creditCardDetails;
    }
}