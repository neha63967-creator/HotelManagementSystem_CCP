public class Guest {
    private String id; // Figure 7 aur 14 ke mutabiq
    private String name; 
    private String addressDetails; 

    public Guest(String id, String name, String addressDetails) {
        this.id = id;
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public String getAddressDetails() { return addressDetails; }
}