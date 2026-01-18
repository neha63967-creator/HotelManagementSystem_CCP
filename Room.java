public class Room {

    private int number;
    private Guest occupant; 
    private RoomType type;

    public Room(int number, RoomType type) { 
        this.number = (number <= 0) ? 999 : number; 
        this.type = type; // Ab ye sahi assign hoga
    }

    public void createGuest( Name name, Address address) {
        this.occupant = new Guest();
        this.occupant.create(name, address);
        System.out.println(
            "Room " + number + " is now occupied by " + name
        );
    }

    public int getNumber() {
        return number;
    }

     public Guest getOccupant() {
        return occupant;
    }
    
    public RoomType getType() {
         return type;
     }

   public boolean isAvailable() {
        return occupant == null;
    }

   
}
