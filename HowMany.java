public class HowMany {
    private int number;
    private Reservation reservation; // In par warning ho sakti hai
    private RoomType roomType;

    public HowMany(int number, Reservation reservation, RoomType roomType) {
        this.number = number;
        this.reservation = reservation;
        this.roomType = roomType;
    }

    public int getRoomCount() { return number; }
    
    // Inhe add karne se 'Unused Field' warning chali jayegi
    public Reservation getReservation() { return reservation; }
    public RoomType getRoomType() { return roomType; }
}