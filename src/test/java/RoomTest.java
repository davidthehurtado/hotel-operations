import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_shouldReturnTrue_andSetOccupiedAndDirty_whenRoomCleanAndEmpty() {
        // Arrange
        Room room = new Room();

        // Act
        boolean result = room.checkIn();

        // Assert
        assertTrue(result);
        assertTrue(room.occupied);
        assertTrue(room.dirty);
    }

    @Test
    void checkIn_shouldReturnFalse_whenAlreadyOccupied() {
        Room room = new Room();
        room.occupied = true;

        boolean result = room.checkIn();

        assertFalse(result);
        assertTrue(room.occupied);
    }

    @Test
    void checkIn_shouldReturnFalse_whenDirty() {
        Room room = new Room();
        room.dirty = true;

        boolean result = room.checkIn();

        assertFalse(result);
        assertTrue(room.dirty);
    }

    @Test
    void checkOut_shouldReturnTrue_andMarkDirty_whenOccupied() {
        Room room = new Room();
        room.occupied = true;

        boolean result = room.checkOut();

        assertTrue(result);
        assertFalse(room.occupied);
        assertTrue(room.dirty);
    }

    @Test
    void checkOut_shouldReturnFalse_whenNotOccupied() {
        Room room = new Room();

        boolean result = room.checkOut();

        assertFalse(result);
        assertFalse(room.occupied);
    }

    @Test
    void cleanRoom_shouldReturnTrue_andSetDirtyFalse_whenNotOccupiedAndDirty() {
        Room room = new Room();
        room.dirty = true;

        boolean result = room.cleanRoom();

        assertTrue(result);
        assertFalse(room.dirty);
    }

    @Test
    void cleanRoom_shouldReturnFalse_whenOccupied() {
        Room room = new Room();
        room.occupied = true;
        room.dirty = true;

        boolean result = room.cleanRoom();

        assertFalse(result);
        assertTrue(room.dirty); // still dirty
    }
}
