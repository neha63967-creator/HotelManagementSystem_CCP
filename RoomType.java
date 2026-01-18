public class RoomType {

    private RoomKind kind; 
    private Money cost;

    public RoomType(RoomKind kind, Money cost) throws HotelSystemException {
        // Error Fix 1: Money object se amount nikal kar check karein
        if (cost == null || cost.getAmount() < 0) {
            throw new HotelSystemException("Room cost cannot be negative.");
        }
        
        // Error Fix 2: String ki jagah RoomKind ka object use karein
        // Agar kind null hai to naya RoomKind object banayein
        this.kind = (kind == null) ? new RoomKind("Standard") : kind;
        this.cost = cost;
    }

    public RoomKind getKind() {
        return kind;
    }

    public Money getCost() {
        return cost;
    }
}