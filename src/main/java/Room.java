public class Room {
    private int numberOfBeds;
    private double price;
    boolean occupied;
    boolean dirty;

    // CONSTRUCTOR
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // GETTERS
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    // 🔹 UPDATED METHODS (now return boolean)
    public boolean checkIn() {
        if (!isAvailable()) {
            System.out.println("❌ Room not available. Must be clean and unoccupied.");
            return false;
        } else {
            occupied = true;
            dirty = true;
            System.out.println("✅ Guest checked in. Room is now occupied and dirty.");
            return true;
        }
    }

    public boolean checkOut() {
        if (!occupied) {
            System.out.println("❌ Cannot check out. Room is not occupied.");
            return false;
        } else {
            occupied = false;
            dirty = true;
            System.out.println("✅ Guest checked out. Room marked dirty for cleaning.");
            return true;
        }
    }

    public boolean cleanRoom() {
        if (occupied) {
            System.out.println("❌ Cannot clean while occupied!");
            return false;
        }
        if (!dirty) {
            System.out.println("⚠️ Room already clean.");
            return false;
        }
        dirty = false;
        System.out.println("✅ Room cleaned and ready for new guests.");
        return true;
    }

    public Room() {
        this.occupied = false;
        this.dirty = false;
    }
}