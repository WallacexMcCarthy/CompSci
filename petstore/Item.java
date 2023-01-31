package petstore;

/*
A pet shop wants to give a discount to its clients if they buy one or more pets and at least five other items. The discount is equal to 20 percent of the cost of the other items, but not the pets.
Use a class Item to describe an item, with any needed methods and a constructor
public Item(double price, boolean isPet, int quantity)
An invoice holds a collection of Item objects; use an array or array list to store them. In the Invoice class, implement methods
public void add(Item anItem)
public double getDiscount()
Write a program that prompts a cashier to enter each price and quantity, and then a Y for a pet or N for another item. Use a price of –1 as a sentinel. In the loop, call the add method; after the loop, call the getDiscount method and display the returned value.
 */

import java.time.Year;
import java.util.Scanner;

public class Item
{
    // initialization of all the variables that will be used in this class.
    double price;
    boolean isPet;
    int quantity;

// sets these variables to the parameter variables that correlate. This is so the user or program can access
// each variable individually through getter methods.

    /**
     *
     * @param price the price
     * @param isPet if the item is a pet or not
     * @param quantity the amount of the item being biugbt
     */
    public Item(double price, boolean isPet, int quantity)
    {
        this.price = price;
        this.isPet = isPet;
        this.quantity = quantity;
    }

    // getter method for the price of the item
    public double getPrice()
    {
        double price = this.price;
        return price;
    }
    // getter method for if it is a pet
    public boolean getIsPet()
    {
        boolean isPet = this.isPet;
        return isPet;
    }
    // getter method for quantity of these items.
    public int getQuantity()
    {
        int quantity = this.quantity;
        return quantity;
    }
}
