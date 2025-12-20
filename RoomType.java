public class RoomType {
    private String kind; // e.g., "family", "double"
    private double cost; // Figure 6

    public RoomType(String kind, double cost) {
        this.kind = kind;
        this.cost = cost;
    }

    public String getKind() {
        return kind;
    }

    // Yeh method miss tha, isse add karein:
    public double getCost() {
        return cost;
    }
}