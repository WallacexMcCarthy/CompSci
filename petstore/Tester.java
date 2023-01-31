package petstore;

import java.util.Scanner;

public class Tester
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double price = -1.0;
        double discounted = 0.0;
        int quantity = 0;
        boolean isPet = false;
        boolean inputCorrect = false;
        boolean leaveLoop = false;
        boolean leaveLoopInput = false;
        Invoice invoice = new Invoice();


        while(leaveLoop == false)
        {
            leaveLoop = false;
            inputCorrect = false;
            leaveLoopInput = false;
            System.out.print("Enter the price: ");
            price = input.nextDouble();
            input.nextLine();
            System.out.print("Enter the quantity: ");
            quantity = input.nextInt();
            input.nextLine();

            while (inputCorrect == false)
            {
                System.out.print("Is this item a pet? (Y for YES | N for NO) ");
                String isAPet = input.next();
                input.nextLine();


                if(isAPet.equals("Y"))
                {
                    isPet = true;
                    inputCorrect = true;
                }
                else if (isAPet.equals("N"))
                {
                    isPet = false;
                    inputCorrect = true;
                }
                else
                {
                    System.out.println("Enter a valid input!");
                    inputCorrect = false;
                }
            }
            invoice.add(new Item(price, isPet, quantity));
            while(leaveLoopInput == false)
            {
                System.out.println("Would like like to add another item or pet? (Y for YES | N for NO)");
                String endTransaction = input.next();
                input.nextLine();

                if (endTransaction.equals("Y"))
                {
                    leaveLoop = false;
                    leaveLoopInput = true;
                }
                else if (endTransaction.equals("N"))
                {
                    leaveLoop = true;
                    leaveLoopInput = true;
                }
                else
                {
                    System.out.println("Enter a valid inout!");
                    leaveLoopInput = false;
                }
            }
        }

        discounted = invoice.getDiscount();

        System.out.println("The total is: $" + discounted);

    }
}
