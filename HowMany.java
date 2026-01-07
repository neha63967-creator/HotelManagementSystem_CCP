public class HowMany {

    private int number;
    private Reservation reservation;
    private RoomType roomType;

    public HowMany(
            int number,
            Reservation reservation,
            RoomType roomType
    ) {
        this.number = number;
        this.reservation = reservation;
        this.roomType = roomType;

        
        displayDetails();
    }

    private void displayDetails() {
        
        if (roomType != null && reservation != null) {
            System.out.println(
                "HowMany: " + number +
                " rooms of type " + roomType.getKind() +
                " linked to Reservation #" + reservation.getNumber()
            );
        }
    }

    public int getRoomCount() {
        return number;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}
