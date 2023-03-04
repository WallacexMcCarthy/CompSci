package NumberFormater;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        DefaultFormatter defaultFormatter= new DefaultFormatter();
        AccountingFormatter accountingFormatter = new AccountingFormatter();
        DecimalSeparatorFormatter decimalSeparatorFormatter = new DecimalSeparatorFormatter();
        BaseFormatter baseFormatter = new BaseFormatter(10);
        int[] ints = new int[100];
        Scanner in = new Scanner(System.in);
        boolean isValidInput = false;
        int userInput = -1;
        int userBase = 10;
        for(int i = 0; i < ints.length; i++)
        {
            ints[i] = (int)(Math.random() * 100000000);;
        }

        while(!isValidInput)
        {
            System.out.println("How do you want your number formatted as?");
            System.out.println("These are the options: ");
            System.out.println("1. Regular Formatting: 10 would be displayed as 10, no change.");
            System.out.println("2. Accounting Format: formats negative numbers with parentheses; for example, –1 as (1)");
            System.out.println("3. Decimal Seperated Format: formats an integer with decimal separators; for example, " +
                    "one million as 1,000,000.");
            System.out.println("4. Base Formatter: formats the numbers to any base from 2 - 36.");
            System.out.print("Enter the number for the format you want (1, 2, 3, or 4): ");
            userInput = in.nextInt();
            in.nextLine();
            if(userInput >= 1 && userInput <= 4)
            {
                isValidInput = true;
            }else
            {
                System.out.println("Invalid! ");
            }
        }

        if(userInput == 4)
        {
            boolean isValid = false;
            while(!isValid)
            {
                System.out.print("Enter the base in the range of [2, 36]: ");
                userBase = in.nextInt();
                in.nextLine();
                if(userBase >= 2 && userBase <= 36)
                {
                    baseFormatter = new BaseFormatter(userBase);
                    isValid = true;
                }else
                {
                    System.out.println("Invalid! ");
                }
            }
        }

        if(userInput == 1)
        {
            for(int i = 0; i < ints.length; i++)
            {
                System.out.println(defaultFormatter.format(ints[i]));
            }
        }else if(userInput == 2)
        {
            for(int i = 0; i < ints.length; i++)
            {
                System.out.println(accountingFormatter.format(ints[i]));
            }
        }else if(userInput == 3)
        {
            for(int i = 0; i < ints.length; i++)
            {
                System.out.println(decimalSeparatorFormatter.format(ints[i]));
            }
        }else
        {
            for(int i = 0; i < ints.length; i++)
            {
                System.out.println(baseFormatter.format(ints[i]));
            }
        }
    }
}
