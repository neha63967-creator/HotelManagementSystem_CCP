public class Room {

    private int number;
    private boolean isReserved = false;
    private Guest occupant; 

    public Room(int number) {
        this.number = (number <= 0) ? 999 : number; 
    }

    public void createGuest(String id, String name, String address) {
        this.occupant = new Guest();
        this.occupant.create(name, address);
        this.isReserved = true;
        System.out.println(
            "Room " + number + " is now occupied by " + name
        );
    }

    public int getNumber() {
        return number;
    }

    public boolean isAvailable() {
        return !isReserved;
    }

    public void setReserved(boolean status) {
        this.isReserved = status;
    }
}
