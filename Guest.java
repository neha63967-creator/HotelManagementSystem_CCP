public class Guest {
    
    private Name name;
    private Address addressDetails;

    public void create(Name name, Address addressDetails) {
        this.name = name;
        this.addressDetails = addressDetails;
        System.out.println("Guest profile created for: " + name.toString());
    }

    public Name getName() {
        return name;
    }

    public Address getAddressDetails() {
        return addressDetails;
    }
}