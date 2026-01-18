import java.util.*;

public class Hotel {

    private Name name;
    private List<Room> rooms = new ArrayList<>(); 
    private List<RoomType> roomTypes = new ArrayList<>(); 
    private Reservation reservation; 

    public Hotel(Name name) {
        if (name == null) {
            throw new IllegalArgumentException("Hotel name cannot be null");
        }
        this.name = name;
    }

    public void createReservation() {
        System.out.println("New reservation process started for " + name.toString());
    }

    public boolean available() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms available in this hotel.");
            return false;
        }
        for (Room r : rooms) {
            if (r.getOccupant() == null) { 
                return true;
            }
        }
        return false;
    }

    public void addRoom(Room r) {
        if (r != null) rooms.add(r);
    }

    public void addRoomType(RoomType rt) {
        if (rt != null) roomTypes.add(rt);
    }

    public Name getName() {
        return name;
    }
}
