public class Room {
    private int number;
    private boolean isReserved = false; // Naya attribute (Fig 19 state)

    public Room(int number) {
        this.number = number;
    }

    public int getNumber() { return number; }
    
    public boolean isAvailable() { return !isReserved; }
    
    public void setReserved(boolean status) { this.isReserved = status; }
}