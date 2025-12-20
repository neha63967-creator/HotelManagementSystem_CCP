import java.util.*;

public class Hotel {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    public void addRoom(Room r) { rooms.add(r); }
    public String getName() { return name; }

    // Figure 16 & 18 logic
    public Reservation createReservation(int resNum, String date, String start, String end, ReserverPayer rp) {
        Reservation newRes = new Reservation(resNum, date, start, end, rp);
        reservations.add(newRes);
        System.out.println("Reservation " + resNum + " created in " + this.name);
        return newRes;
    }
}