public class Reservation {
    private String reservationDate, startDate, endDate;
    private int number;
    private ReserverPayer payer;

    public Reservation(int number, String reservationDate, String startDate, String endDate, ReserverPayer payer) {
        this.number = number;
        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.payer = payer;
    }

    public int getNumber() { return number; }
    public ReserverPayer getPayer() { return payer; } // Warning fix
    public String getDates() { return startDate + " to " + endDate; } // Warning fix
}