import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer1;

    @Before
    public void before() {
        this.developer1 = new Developer("Charlie", "AB123456CD", 15000.00);
    }

    @Test
    public void hasAName() {
        assertEquals("Charlie", developer1.getName());
    }

    @Test
    public void hasANationalInsurance() {
        assertEquals("AB123456CD", developer1.getNationalInsurance());
    }

    @Test
    public void hasASalary() {
        assertEquals(15000.00, developer1.getSalary(), 0.01);
    }

    @Test
    public void canGetSalaryIncrease() {
        developer1.salaryIncrease(300.00);
        assertEquals(15300.00, developer1.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(150.00, developer1.payBonus(), 0.01);
    }

}
