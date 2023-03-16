package Coffeedore64;

import java.util.ArrayList;

/**
 * Order
 */
public class Order {

    // MEMBER VARIABLES
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    Order(){
        this.setName("Guest");
        this.items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!

    // Create a method called addItem that takes an Item object as an argument and adds 
    // the item to the order's items array. No need to return anything.

    public void addItem(Item order){
        this.items.add(order);
    }

    // Create a method called getStatusMessage that returns a String message. If the order is 
    // ready, return "Your order is ready.", if not, return "Thank you for waiting. Your order will be 
    // ready soon."

    public String getStatusMessage(){
        return getReady() ? "Your order is ready." : "Thank you for waiting. Your order will be ready soon.";
    }

    // Create a method called getOrderTotal that sums together each of the item's prices, and returns the total amount.

    public double getOrderTotal(){
        double totalPrice = 0;
        for (int i=0; i<getItems().size(); i++){
            totalPrice += getItems().get(i).getPrice();
        }
        return totalPrice;
    }

    // Create a method called display that prints out the order information

    public void display(){
        System.out.println(String.format("Customer Name: %s", getName()));
        for(var i=0; i<getItems().size(); i++){
            System.out.println(String.format("%s - $%.2f", getItems().get(i).getName(), getItems().get(i).getPrice() ));
        }
        System.out.println(String.format("Total: $%.2f\n", getOrderTotal()));
    }
    
    // GETTERS & SETTERS

    public String getName(){
        return name;
    }

    public boolean getReady(){
        return ready;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

}