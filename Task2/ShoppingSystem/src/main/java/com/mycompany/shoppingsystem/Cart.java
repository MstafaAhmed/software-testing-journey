package com.mycompany.shoppingsystem;
import java.util.ArrayList;
/**
 *
 * @author compu magic
 */
public class Cart {
   private int cartID;

    // Maximum number of different items
    private final int maxCap = 50;

    // A Cart contains a list of Item objects
    private ArrayList<Item> listOfItems;

    // Stores the quantity of each item
    // The index corresponds to the item in listOfItems
    private ArrayList<Integer> listOfItemsQ;


    // Constructor
    public Cart(int cartID) {

        this.cartID = cartID;

        listOfItems = new ArrayList<>();
        listOfItemsQ = new ArrayList<>();
    }


    // Get Cart ID
    public int getCartID() {
        return cartID;
    }


    // Set Cart ID
    public void setCartID(int cartID) {
        this.cartID = cartID;
    }


    // Add item
    public void addItem(Item item, int quantity) {

        if (item == null) {
            System.out.println("Invalid item.");
            return;
        }

        if (quantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }


        // Check whether item already exists
        for (int i = 0; i < listOfItems.size(); i++) {

            if (listOfItems.get(i).equals(item)) {

                listOfItemsQ.set(
                        i,
                        listOfItemsQ.get(i) + quantity
                );

                System.out.println("Item quantity increased.");
                return;
            }
        }


        // Check capacity
        if (listOfItems.size() >= maxCap) {
            System.out.println("Cart is full.");
            return;
        }


        // Add new item
        listOfItems.add(item);
        listOfItemsQ.add(quantity);

        System.out.println("Item added successfully.");
    }


    // Delete item
    public void deleteItem(int index) {

        if (index < 0 || index >= listOfItems.size()) {
            System.out.println("Invalid item index.");
            return;
        }


        // Remove item and its quantity
        listOfItems.remove(index);
        listOfItemsQ.remove(index);

        System.out.println("Item deleted successfully.");
    }


    // Modify item quantity
    public void modifyItem(int index, int newQuantity) {

        if (index < 0 || index >= listOfItems.size()) {
            System.out.println("Invalid item index.");
            return;
        }

        if (newQuantity <= 0) {
            System.out.println("Quantity must be greater than zero.");
            return;
        }

        listOfItemsQ.set(index, newQuantity);

        System.out.println("Item quantity modified successfully.");
    }


    // Display cart
    public void displayCart() {

        System.out.println("========== CART ==========");
        System.out.println("Cart ID: " + cartID);

        if (listOfItems.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }


        for (int i = 0; i < listOfItems.size(); i++) {

            System.out.println(
                    (i + 1) + ". " +
                    listOfItems.get(i) +
                    " | Quantity: " +
                    listOfItemsQ.get(i)
            );
        }

        System.out.println("==========================");
        System.out.println("Total: " + getTotal());
    }


    // Calculate total price
    public double getTotal() {

        double total = 0;

        for (int i = 0; i < listOfItems.size(); i++) {

            total += listOfItems.get(i).getPrice()
                    * listOfItemsQ.get(i);
        }

        return total;
    }


    // Get number of different items
    public int getNumberOfItems() {
        return listOfItems.size();
    }


    // Get item
    public Item getItem(int index) {

        if (index < 0 || index >= listOfItems.size()) {
            return null;
        }

        return listOfItems.get(index);
    }


    // Get quantity
    public int getQuantity(int index) {

        if (index < 0 || index >= listOfItems.size()) {
            return 0;
        }

        return listOfItemsQ.get(index);
    }


    // Get all items
    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }


    // Get all quantities
    public ArrayList<Integer> getListOfItemsQ() {
        return listOfItemsQ;
    }
 
}
