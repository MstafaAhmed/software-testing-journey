package com.mycompany.listofitems;

/**
 *
 * @author compu magic
 */
public class Item {
 
    private final int id;
    private String name;
    private double price;
    private String category;
    //=========================================================================
    // Constructors
    public Item(){
         id = 0;
    }
    
    public Item(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    //=========================================================================
    // getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    
    public String getCategory() {
        return category;
    }
    
    //=========================================================================
    // setter
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }

    
    public void setCategory(String category) {
        this.category = category;
    }

    public void display() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Price: " + price);
    System.out.println("Category: " + category);
}
}