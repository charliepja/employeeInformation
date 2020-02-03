import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager1;

    @Before
    public void before(){

        manager1 = new Manager("Charlie", "AB123456C", 15000.00, "memes");
    }

    @Test
    public void hasAName() {

        assertEquals("Charlie", manager1.getName());
    }

    @Test
    public void hasANationalInsurance() {
        assertEquals("AB123456C", manager1.getNationalInsurance());
    }

    @Test
    public void hasASalary() {
        assertEquals(15000.00, manager1.getSalary(), 0.01);
    }

    @Test
    public void hasADeptName() {
        assertEquals("memes", manager1.getDeptName());
    }

    @Test
    public void canRaiseASalary() {
        manager1.raiseSalary(200.00);
        assertEquals(15200.00, manager1.getSalary(), 0.01);
    }

    @Test
    public void canGetABonus() {

        assertEquals(150.00, manager1.payBonus(), 0.01);
    }

    @Test
    public void canChangeNameNotNull() {
        manager1.setName("Matt");
        assertEquals("Matt", manager1.getName());
    }

    @Test
    public void cannotChangeNameNull() {
        manager1.setName("");
        assertEquals("Charlie", manager1.getName());
    }

    @Test
    public void cannotRaiseSalaryWhenNegative() {
        manager1.raiseSalary(-1.00);
        assertEquals(15000.00, manager1.getSalary(), 0.01);
    }

}
