public class HowMany {
    private int number; // UML: number : Integer
    private Reservation reservation;
    private RoomType roomType;

    public HowMany(int number, Reservation reservation, RoomType roomType) {
        this.number = number;
        this.reservation = reservation;
        this.roomType = roomType;
    }

    public void displayDetails() {
        if (roomType != null && reservation != null) {
            System.out.println("HowMany: " + number + 
                " rooms of type [" + roomType.getKind().getType() + 
                "] for Reservation #" + reservation.getNumber());
        }
    }

    public int getNumber() { return number; }
    public RoomType getRoomType() { return roomType; }
}