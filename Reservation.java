public class Reservation {

    private String reservationDate;
    private String startDate;
    private String endDate;
    private int number;
    private ReserverPayer payer;

    public Reservation(
            int number,
            String resDate,
            String start,
            String end,
            ReserverPayer payer
    ) {
        this.number = number;
        this.reservationDate = resDate;
        this.startDate = start;
        this.endDate = end;
        this.payer = payer;
    }

    public void create() {
        System.out.println(
            "Reservation #" + number + " created on " + reservationDate
        );
        System.out.println(
            "Duration: " + startDate + " to " + endDate
        );

        if (payer != null) {
            System.out.println("Payer: " + payer.getName());
        }
    }

    public int getNumber() {
        return number;
    }

    public String getDates() {
        return startDate + " to " + endDate;
    }

    public ReserverPayer getPayer() {
        return payer;
    }
}
