import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // Example 1: Create a StaffMember(1, "John Doe", 50000) and verify that the salary is 50000
    @Test
    void testCreateStaffMember() {
        StaffMember staff = new StaffMember(1, "John Doe", 50000);
        assertEquals(50000, staff.getSalary());
    }

    // Example 2: Verify that Salary cannot be set to a negative value
    @Test
    void testSalaryCannotBeNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new StaffMember(2, "Jane Doe", -10000);
        });
        assertEquals("Compensation must be positive", exception.getMessage());
    }

    // Example 3: Verify that the incentive is 20% of the compensation (Salary)
    @Test
    void testIncentive20() {
        Supervisor supervisor = new Supervisor(3, "Alice Smith", 60000, "Sales");
        assertEquals(12000, supervisor.getIncentive(), 0.01);
    }
}

