public class CreditCard {
    private String number;

    public CreditCard(String number) 
    { 
        this.number = number; 
    }
    @Override
    public String toString()
     { 
        return "****-****-****-" + number.substring(number.length() - 4);
     }
}
