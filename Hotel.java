import java.util.*;

public class Hotel {

    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    public Reservation createReservation(int resNum, String date, String start, String end, ReserverPayer rp) {
        if (resNum <= 0) resNum = (int)(Math.random()*10000);{
            Reservation res = new Reservation(resNum, date, start, end, rp);
            res.create();
            reservations.add(res);
            System.out.println("Hotel " + name + " added Reservation #" + resNum);
            return res;
        } 
    }
    

    public boolean available(RoomType type) {
        for (Room r : rooms) {
            if (r.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room r) {
        rooms.add(r);
    }
}
