import java.util.*;

public class Reservation {
    private Date reservationDate;
    private Date startDate;
    private Date endDate;
    private int number;
    
    private ReserverPayer payer; 
    private List<Room> rooms = new ArrayList<>(); 
    private List<HowMany> requirements = new ArrayList<>(); 

    public Reservation(int number, Date resDate, Date start, Date end, ReserverPayer payer) {
        // Defensive Check 1: ID positive honi chahiye
        if (number <= 0) {
            this.number = (int)(Math.random() * 10000); 
        } else {
            this.number = number;
        }

        // Defensive Check 2: Dates logical honi chahiye
        if (start != null && end != null && end.before(start)) {
            throw new IllegalArgumentException("End date cannot be before start date.");
        }

        // Defensive Check 3: Payer null nahi hona chahiye
        if (payer == null) {
            throw new IllegalArgumentException("A reservation must have a payer.");
        }

        this.reservationDate = (resDate == null) ? new Date() : resDate;
        this.startDate = start;
        this.endDate = end;
        this.payer = payer;
    }

    public void create() {
        System.out.println("--- Reservation Receipt ---");
        System.out.println("Reservation ID: " + number);
        System.out.println("Booked On: " + reservationDate);
        
        // Defensive Print: Agar dates null hon to crash na ho
        String stay = (startDate != null && endDate != null) 
                      ? startDate + " to " + endDate 
                      : "Dates not set";
        System.out.println("Stay Duration: " + stay);
        
        System.out.println("Payer Name: " + payer.getName().toString());

        // Defensive Logic: Agar koi room add nahi hua to warning dikhayein
        if (rooms.isEmpty()) {
            System.out.println("Status: PENDING (No rooms allocated yet)");
        } else {
            System.out.println("Rooms Allocated: " + rooms.size());
        }
        System.out.println("---------------------------");
    }

    public void addRoom(Room room) {
        // Defensive: Duplicate room add na ho
        if (room != null && !rooms.contains(room)) {
            rooms.add(room);
        }
    }

    public ReserverPayer getPayer() {
        return payer;
    }
    
    public void addRequirement(int count, RoomType type) {
        if (count > 0 && type != null) {
            HowMany hm = new HowMany(count, this, type);
            requirements.add(hm);
        }
    }

    public int getNumber() { return number; }
}