package employee;

public class Manager extends Employee
{
    String department;

    /**
     * manager inherit from Employee, a child class of Employee.
     * @param name employee name
     * @param salary employee salary
     * @param department employee department
     */
    public Manager(String name, int salary, String department)
    {
        super(name, salary);
        this.department = department;
    }

    /**
     * Overridden toString that returns all the manager's charistics but now with departments as well.
     * @return manager's charistics with the addition of department
     */
//    @Override
    public String toStringManager()
    {

        String output = "Name: " + name + "\n" + "Salary: " + salary + "\n" + "Department: " + department;
        return output;
    }

}
