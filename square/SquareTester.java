package square;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class SquareTester
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x coordinate for a rectangle's center: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the y coordinate for a rectangle's center: ");
        int y = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the the side length of this rectangle: ");
        int sideW = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the the side length of this rectangle: ");
        int sideH = scanner.nextInt();
        scanner.nextLine();
        if(sideW == sideH)
        {
            Square square = new Square(x, y, sideW);

            System.out.println(square.getSquare().toString());
            System.out.println("The area of this Square is: " + square.getArea());

        }else
        {
            Rectangle rectangle = new Rectangle(x, y, sideW, sideH);
            System.out.println(rectangle.toString());
            System.out.println("The Area: " + (sideW * sideH));
        }

    }
}
