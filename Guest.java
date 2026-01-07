public class Guest {

    protected String name;
    protected String addressDetails;

    public void create(String name, String addressDetails) {
        this.name = name;
        this.addressDetails = addressDetails;
        System.out.println("Guest profile created for: " + name);
    }

    public String getName() {
        return name;
    }

    public String getAddressDetails() {
        return addressDetails;
    }
}
