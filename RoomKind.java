public class RoomKind {
    private String type; // e.g., "Deluxe", "Suite"

    public RoomKind(String type) {
        this.type = type;
    }

    public String getType() { return type; }

    @Override
    public String toString() { return type; }
}
