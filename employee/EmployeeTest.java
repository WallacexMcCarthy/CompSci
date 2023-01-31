package employee;


import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest
{
    Employee employee = new Employee("John Doe", 75_000);
    Manager manager = new Manager("John Doe", 75_000, "Security");
    Executive executive = new Executive("John Doe", 75_000, "Security");

    @Test
    private void testEmployee()
    {
        Assert.assertEquals("Name: John Doe\n" + "Salary: 75000", employee.toString());
    }

    @Test
    private void testManager()
    {
        Assert.assertEquals("Name: John Doe\n" + "Salary: 75000\n" + "Department: Security", manager.toString());
    }
    @Test
    private void testExecutive()
    {
        Assert.assertEquals("Name: Executive John Doe\n" + "Salary: 75000\n" + "Department: Security", executive.toString());
    }


}
