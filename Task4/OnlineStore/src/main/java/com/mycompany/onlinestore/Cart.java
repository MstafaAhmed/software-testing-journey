package com.mycompany.onlinestore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mostafa ahmed 
 */
public class Cart {
    private List<Item> items;
    //================ Constructor =====================

    public Cart() {
        items = new ArrayList<>();
    }
    
    //================ Add Item ========================

    public void addItem(Item item) {
        items.add(item);
    }

    //================ Remove Item =====================

    public void removeItem(Item item) {
        items.remove(item);
    }
    
    //================ Calculate Total =================

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
    //================ Checkout ========================

    public void checkout() {
        for (Item item : items) {
            item.sell();
        }

        items.clear();
    }

public List<Item> getItems() {
    return items;
}
    
    
}
