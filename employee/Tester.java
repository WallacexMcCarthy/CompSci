package employee;

import java.util.Scanner;

public class Tester
{

    public static void main(String[] args)
    {
        boolean error = true;
        String employeeName;
        int exployeeSalary;
        String employeeType;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your employee's first and last name: ");
        employeeName = scanner.nextLine();
        System.out.print("Enter your employee's salary: ");
        exployeeSalary = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What department would you like your employee to be managing? ");
        String employeeDepartment = scanner.nextLine();
        Executive executive = new Executive(employeeName, exployeeSalary, employeeDepartment);



        while(error)
        {
            System.out.print("Would you like a regular employee, a manager or an executive? " +
                    "(Enter one of the following: regular, manager, executive) ");
            employeeType = scanner.next();
            scanner.nextLine();

            if(employeeType.equals("regular"))
            {
                System.out.println(executive.toStringEmployee());
                error = false;

            }else if(employeeType.equals("manager"))
            {
                System.out.println(executive.toStringManager());
                error = false;

            }else if(employeeType.equals("executive"))
            {
                System.out.println(executive.toString());
                error = false;

            }else
            {
                System.out.println("Incorrect Input!");

            }



        }
    }
}
