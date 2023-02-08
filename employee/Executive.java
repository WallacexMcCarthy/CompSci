package employee;

public class Executive extends Manager
{
    /**
     * Executive inherit from Manager, a child class of Employee.
     * @param name employee name
     * @param salary employee salary
     * @param department employee department
     */
    public Executive(String name, int salary, String department) {
        super(name, salary, department);
    }
    /**
     * Overridden toString that returns all the Executive's charistics but now with departments as well.
     * @return Executive charistics with department and the Executive identifier in the name.
     */
    @Override
    public String toString()
    {

        String output = "Name: Executive " + name + "\n" + "Salary: " + salary + "\n" + "Department: " + department;
        return output;
    }
}
