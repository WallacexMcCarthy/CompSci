package numberformater;

import java.util.Scanner;
import java.util.SortedMap;

public class Tester
{
    public static void main(String[] args)
    {
        int[] ints = new int[100];
        Scanner in = new Scanner(System.in);
        boolean isValidInput = false;
        int userInput = -1;
        int userBase = 10;
        for(int i = 0; i < ints.length; i++)
        {
            int randomInt = (int)(Math.random() * 100000000) - 50000001;
            ints[i] = randomInt;
        }

        while(!isValidInput)
        {
            System.out.println("What format would you like your numbers to be displayed as?");
            System.out.println("These are the options: ");
            System.out.println("1. Regular Formatting: 10 would be displayed as 10, no change.");
            System.out.println("2. Accounting Format: formats negative numbers with parentheses; for example, –1 as (1)");
            System.out.println("3. Decimal Seperated Format: formats an integer with decimal separators; for example, " +
                    "one million as 1,000,000.");
            System.out.println("4. Base Formatter: formats the numbers to any base of your choosing. ");
            System.out.print("Enter the respective number for the format you want (1, 2, 3, or 4): ");
            userInput = in.nextInt();
            in.nextLine();
            if(userInput > 0 && userInput < 5)
            {
                isValidInput = true;
            }else
            {
                System.out.println("That is a invalid input! ");
                System.out.println("Try Again! ");
            }
        }

        if(userInput == 4)
        {
            boolean isValid = false;
            while(!isValid)
            {
                System.out.print("Enter the base that you want your number to be formatted into int the range of [2, 36]: ");
                userBase = in.nextInt();
                in.nextLine();
                if(userBase >= 2 && userBase <= 36)
                {
                    isValid = true;
                }else
                {
                    System.out.println("That is a invalid input! ");
                    System.out.println("Try Again! ");
                }
            }
        }

        if(userInput == 1)
        {
            DefaultFormatter defaultFormatter= new DefaultFormatter();
            for(int i = 0; i < ints.length; i++)
            {
                System.out.println(defaultFormatter.format(ints[i]));
            }
        }else if(userInput == 2)
        {
            AccountingFormatter accountingFormatter = new AccountingFormatter();
            for(int i = 0; i < ints.length; i++)
            {
                System.out.println(accountingFormatter.format(ints[i]));
            }
        }else if(userInput == 3)
        {
            DecimalSeparatorFormatter decimalSeparatorFormatter = new DecimalSeparatorFormatter();
            for(int i = 0; i < ints.length; i++)
            {
                System.out.println(decimalSeparatorFormatter.format(ints[i]));
            }
        }else
        {
            BaseFormatter baseFormatter = new BaseFormatter(userBase);
            for(int i = 0; i < ints.length; i++)
            {
                System.out.println(baseFormatter.format(ints[i]));
            }
        }
    }
}
