package petstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Invoice
{
    // initialization of all the variables that will be used in this class.
    private Scanner input;
    private ArrayList<Item> list;
    private Item item;


    public Invoice()
    {
        this.input = new Scanner(System.in);
        this.list = new ArrayList<>();
        this.item = new Item(-1.0, false, 0);
    }

    /*
    adds the parameter anItem of type Item to the already created arrayList of Items.
     */
    public void add(Item anItem)
    {
        list.add(anItem);
    }

    /* the getDiscount method runs through every index in the list ArrayList or items and if these items are not pets
    then that Item's price will be added to the discount variable. following all of these indexs being checked, if
    there were more than 4 items that are not pets and one or more pets, then the discounted variable will be
    multiplied by 0.8 as that is a 20% discount.
    */
    public double getDiscount()
    {
    double discounted = 0.0;
    int numOfItemsNotPet = 0;
    int numOfItemsArePets = 0;
    for(int index = 0; index < list.size(); index++)
    {
        Item currentItem = list.get(index);
        if (currentItem.getIsPet() == false)
        {
            numOfItemsNotPet += currentItem.getQuantity();
            discounted += currentItem.getPrice() * currentItem.getQuantity();
        }
        else if(currentItem.getIsPet() == true)
        {
            numOfItemsArePets += 1;
        }
    }

    if(numOfItemsNotPet >= 5 && numOfItemsArePets >= 1)
    {
        discounted = discounted * 0.8;
    }

    return discounted;
    }
}
