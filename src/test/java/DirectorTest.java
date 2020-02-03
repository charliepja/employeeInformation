import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director1;

    @Before
    public void before() {
        this.director1 = new Director("Charlie", "AB123456CD", 15000.00, "memes", 20000.00);
    }

    @Test
    public void hasAName() {
        assertEquals("Charlie", director1.getName());
    }

    @Test
    public void hasANationalInsurance() {
        assertEquals("AB123456CD", director1.getNationalInsurance());
    }

    @Test
    public void hasASalary() {
        assertEquals(15000.00, director1.getSalary(), 0.01);
    }

    @Test
    public void hasADeptName() {
        assertEquals("memes", director1.getDeptName());
    }

    @Test
    public void hasABudget() {
        assertEquals(20000.00, director1.getBudget(), 0.01);
    }

    @Test
    public void canGetSalaryRaise() {
        director1.raiseSalary(300.00);
        assertEquals(15300.00, director1.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(150.00, director1.payBonus(), 0.01);
    }
}
