import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn_shouldReturnTrue_andSetStartTime() {
        Employee emp = new Employee(101, "Dana Wyatt", "Housekeeping", 15.50);

        boolean result = emp.punchIn(10.0);

        assertTrue(result);
        assertEquals(10.0, emp.startTime);
    }

    @Test
    void punchIn_shouldReturnFalse_whenAlreadyPunchedIn() {
        Employee emp = new Employee(101, "Dana Wyatt", "Housekeeping", 15.50);
        emp.startTime = 9.0;

        boolean result = emp.punchIn(10.0);

        assertFalse(result);
        assertEquals(9.0, emp.startTime);
    }

    @Test
    void punchOut_shouldReturnTrue_andAddHoursWorked() {
        Employee emp = new Employee(101, "Dana Wyatt", "Housekeeping", 15.50);
        emp.punchIn(10.0);

        boolean result = emp.punchOut(14.75); // 4.75 h

        assertTrue(result);
        assertEquals(4.75, emp.getHoursWorked(), 0.001);
    }

    @Test
    void punchOut_shouldReturnFalse_whenNotPunchedIn() {
        Employee emp = new Employee(101, "Dana Wyatt", "Housekeeping", 15.50);

        boolean result = emp.punchOut(14.0);

        assertFalse(result);
        assertEquals(0, emp.getHoursWorked(), 0.001);
    }
}