public class Money {
    private double amount;
    private String currency;

    public Money(double amount) {
        this.amount = amount;
        this.currency = "PKR"; // Default currency
    }

    public double getAmount() { return amount; }
    
    @Override
    public String toString() { return currency + " " + amount; }
}
