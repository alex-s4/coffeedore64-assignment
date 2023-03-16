package Coffeedore64;

import java.io.Console;

public class TestOrders{
    public static void main(String[] args) {
        
        //****************** MENU ITEMS ********************//
        
        CoffeeKiosk coffeeKiosk1 = new CoffeeKiosk();

        coffeeKiosk1.addMenuItem("mocha", 2.0);
        coffeeKiosk1.addMenuItem("latte", 2.5);
        coffeeKiosk1.addMenuItem("drip coffee", 3.5);
        coffeeKiosk1.addMenuItem("capuccino", 3.0);
        coffeeKiosk1.addMenuItem("ham & cheese croissant", 1.99);

        
        // coffeeKiosk1.displayMenu();
        coffeeKiosk1.newOrder();

    }
}