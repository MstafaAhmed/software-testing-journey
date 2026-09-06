
package com.mycompany.onlinestore;

/**
 *
 * @author mostafa ahmed
 * AI used to solve some bugs and errors
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class OnlineStore {

    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);

        //================ Store Inventory =================

        List<Item> inventory = new ArrayList<>();

        inventory.add(new I_C_Shirt("Cotton Shirt",25.0,10, "M","Blue","Cotton"));

        inventory.add(new I_C_Socks("Sport Socks",10.0, 20, "L", "White", 3));

        inventory.add(new I_C_Hat("Baseball Hat", 15.0, 8, "M", "Black", "Baseball" ));

        inventory.add(new I_D_Printer("HP Printer", 150.0, 5, "HP", 12, true ));

        inventory.add(new I_D_Laptop("Dell Laptop", 900.0, 4, "Dell", 24, 16));

        inventory.add(new I_D_Projector("Epson Projector", 600.0, 3, "Epson", 24, 3500 ));

        //================ Cart ============================

        Cart cart = new Cart();

        //================ Menu Loop =======================

        boolean running = true;

        while (running) {

            System.out.println("\n=================================");
            System.out.println("       ONLINE STORE SYSTEM");
            System.out.println("=================================");
            System.out.println("1. View Store Inventory");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Return Item");
            System.out.println("6. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                //==================================================
                // 1. View Store Inventory
                //==================================================

                case 1:

                    System.out.println("\n========== STORE INVENTORY ==========");

                    for (int i = 0; i < inventory.size(); i++) {

                        Item item = inventory.get(i);

                        System.out.println("\nID: " + i);
                        System.out.println("Name: " + item.getName());
                        System.out.println("Price: $" + item.getPrice());
                        System.out.println("Available: " + item.getAvailableCopies());
                        System.out.println("Category: " + item.getCategory());
                        
                        item.displayDetails();

                        }

                    break;

                //==================================================
                // 2. Add Item to Cart
                //==================================================

                case 2:

                    System.out.println("\n========== ADD ITEM ==========");

                    for (int i = 0; i < inventory.size(); i++) {

                        Item item = inventory.get(i);

                        System.out.println( i + " - " + item.getName() + " | $" + item.getPrice() + 
                                             " | Stock: " + item.getAvailableCopies()); 
                    }

                    System.out.print("Enter item ID: ");
                    int itemIndex = scanner.nextInt();

                    if (itemIndex >= 0 && itemIndex < inventory.size()) {

                        Item selectedItem = inventory.get(itemIndex);

                        if (selectedItem.getAvailableCopies() > 0) {

                            cart.addItem(selectedItem);

                            System.out.println(selectedItem.getName()+ " added to cart.");

                        } else {
                            System.out.println("Sorry, this item is out of stock.");
                        }

                    } else {
                        System.out.println("Invalid item ID.");
                    }

                    break;

                //==================================================
                // 3. View Cart
                //==================================================

                case 3:

                    System.out.println("\n========== YOUR CART ==========");

                    if (cart.getItems().isEmpty()) {

                        System.out.println("Cart is empty.");

                    } else {

                        for (Item item : cart.getItems()) {

                            System.out.println(item.getName()+ " | $" + item.getPrice() + " | "+ item.getCategory());
                        }

                        System.out.println("--------------------------------");

                        System.out.println("Total: $"+ cart.calculateTotal());
                    }
                    break;
                //==================================================
                // 4. Checkout
                //==================================================
                case 4:

                    System.out.println("\n========== CHECKOUT ==========");

                    if (cart.getItems().isEmpty()) {

                        System.out.println("Cart is empty.");

                    } else {

                        System.out.println("Receipt:");

                        for (Item item : cart.getItems()) {

                            System.out.println( item.getName() + " | " + item.getCategory() + " | $" + item.getPrice());
                        }

                        System.out.println("--------------------------------");

                        System.out.println("Total: $" + cart.calculateTotal());

                        cart.checkout();

                        System.out.println("Checkout completed successfully!");
                    }

                    break;

                //==================================================
                // 5. Return Item
                //==================================================

                case 5:

                    System.out.println("\n========== RETURN ITEM ==========");

                    System.out.print("Enter item ID to return: ");

                    int returnIndex = scanner.nextInt();

                    if (returnIndex >= 0 && returnIndex < inventory.size()) {
                        Item itemToReturn = inventory.get(returnIndex);
                        itemToReturn.returnItem();
                        System.out.println(itemToReturn.getName()+ " returned successfully."
                        );

                    } else {

                        System.out.println("Invalid item ID.");
                    }
                    break;
                //==================================================
                // 6. Exit
                //==================================================
                case 6:
                    running = false;
                    System.out.println( "Thank you for using Online Store!");
                    break;

                //==================================================
                // Invalid Choice
                //==================================================
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        
    }
}
