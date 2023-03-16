package Coffeedore64;

import java.util.*;

/**
 * CoffeeKiosk
 */
public class CoffeeKiosk {

    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public CoffeeKiosk(){
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }

    /*
     addMenuItem
        - The addMenuItem method should create a new item object with the given name and price.
        - Add the new Item object to the menu items array.
        - The new menu item itself will also need to be assigned an index property. The value should be its position, its index, in the menu array.
     */

     public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        menu.add(item);
        item.setIndex(menu.indexOf(item));
     }

     public void displayMenu(){
        for(int i=0; i<menu.size(); i++){
            System.out.println(String.format("%d %s -- $%.2f", i, menu.get(i).getName(), menu.get(i).getPrice()));
        }
     }

    /*
     The newOrder method will take input from the user in the terminal to create a new 
     order instance and add it to the orders array.
     */
     
    public void newOrder() {
    	/*
        Shows the user a message prompt and then sets their input to a variable, name
        */ 
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        /* 
         Your code:
         Create a new order with the given input string
         Show the user the menu, so they can choose items to add.
        */
        Order order = new Order(name);
        displayMenu();
    	/*
            Prompts the user to enter an item number
        */ 
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        /*
        Write a while loop to collect all user's order items
        */ 
        while(!itemNumber.equals("q")) {
            /*
                Get the item object from the menu, and add the item to the order
                Ask them to enter a new item index or q again, and take their input
            */ 
            try{
                order.addItem(menu.get(Integer.parseInt(itemNumber)));
            }catch(NumberFormatException e){
                System.out.println("Invalid input, please try again");
            }catch(IndexOutOfBoundsException e){
                System.out.println("Invalid input, please try again");
            }
            
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        System.out.println(String.format("Thank you %s, here are your order details:", name));
        order.display();
        
    }

}