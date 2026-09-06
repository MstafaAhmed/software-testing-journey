package com.mycompany.shoppingsystem;

/**
 *
 * @author compu magic
 */
public class Item {
    
    // Attributes
    private String name;
    private double price;

    // Default constructor
    public Item() {
    }

    // Parameterized constructor
    public Item(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // Display item information
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
