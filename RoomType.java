public class RoomType {

    private String kind;
    private double cost;

    public RoomType(String kind, double cost) throws HotelSystemException {
        if (cost < 0) {
            throw new HotelSystemException("Room cost cannot be negative.");
        }
        this.kind = (kind == null) ? "Standard" : kind;
        this.cost = cost;
    }

    public String getKind() {
        return kind;
    }

    public double getCost() {
        return cost;
    }
}
