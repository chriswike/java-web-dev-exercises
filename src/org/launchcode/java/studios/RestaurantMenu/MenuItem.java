package org.launchcode.java.studios.RestaurantMenu;

public class MenuItem {
    //Make the MenuItem field. All objects are private. Set default price as 0.0
    private String name;
    private String description;
    private String category;
    private double price = 0.0;
    private String date;
    private boolean isNew;

    //Write a constructor that initializes the MenuItem class and its field properties
    public MenuItem(String name, String description, String category, double price, String date, boolean isNew) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.date = date;
        this.isNew = isNew;
    }

    //Write the getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }


    // Write the setters
}
