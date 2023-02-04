package employee;

public class Employee
{
    String name;
    int salary;

    /**
     * Exployee object that includes a name and salary
     * @param name employee name
     * @param salary employee salary
     */
    public Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Overridden toString that returns all the employee's charismatics.
     * @return employee charistics
     */
//    @Override
    public String toStringEmployee()
    {

        String output = "Name: " + name + "\n" + "Salary: " + salary ;
        return output;
    }

}
