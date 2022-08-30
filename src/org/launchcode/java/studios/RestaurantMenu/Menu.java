package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;

public class Menu {
    // make this method main so the compiler starts here
    public static void main(String[] args) {

        // Instantiate the MenuItem class and create menu item objects

        MenuItem item1 = new MenuItem("Tunisian Salad", "Diced tomatoes, onions, cucumbers, jalapeños, apples, lemon vinaigrette", "main", 12.00, "Aug 2, 2022", true);
        MenuItem item2 = new MenuItem("Nicoise", "Potatoes, green beans, olives, tuna and hard boiled eggs", "main", 10.00, "Aug 1, 1990", false);

        // make an arraylist to hold all the menu items

        ArrayList<MenuItem> menu = new ArrayList<>();

        // add the menu items to the arraylist menu
        menu.add(item1);
        menu.add(item2);

        // use a for loop to print the contents of the menu
        System.out.println("Menu");
        for (MenuItem i : menu) {
            System.out.println("*****");
            System.out.println("Name: " + i.getName());
            System.out.println("Description: " + i.getDescription());
            System.out.println("Category: " + i.getCategory());
            System.out.println("Price: " + i.getPrice());
            System.out.println("Date: " + i.getDate());
            System.out.println("*****");
        }

// maybe write a method that will separate the categories of menuItems

// maybe write a method that gets current time looks at date added and if its more than 30 days, change the isNew boolean
    }
}
