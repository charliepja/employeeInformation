import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin dataBaseAdmin1;

    @Before
    public void before() {
        this.dataBaseAdmin1 = new DatabaseAdmin("Charlie", "AB123456CD", 15000.00);
    }

    @Test
    public void hasAName() {
        assertEquals("Charlie", dataBaseAdmin1.getName());
    }

    @Test
    public void hasANationalInsurance() {
        assertEquals("AB123456CD", dataBaseAdmin1.getNationalInsurance());
    }

    @Test
    public void hasASalary() {
        assertEquals(15000.00, dataBaseAdmin1.getSalary(), 0.01);
    }

    @Test
    public void canGetSalaryIncrease() {
        dataBaseAdmin1.salaryIncrease(300.00);
        assertEquals(15300.00, dataBaseAdmin1.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(150.00, dataBaseAdmin1.payBonus(), 0.01);
    }

}

