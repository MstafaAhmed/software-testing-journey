
package com.mycompany.shoppingsystem;

/**
 *
 * @author compu magic
 */
public class ShoppingSystem {
        public static void main(String[] args) {

        //  Create Items
        Item laptop = new Item("Laptop", 25000);
        Item mouse = new Item("Mouse", 500);
        Item keyboard = new Item("Keyboard", 1200);

        //  Create Customer
        Customer customer = new Customer(1,"Mostafa","123456789", "Benha","01012345678" );
        
        //  Get Customer's Cart
        Cart cart = customer.getCart();

        // Add Items to Cart
        cart.addItem(laptop, 1);
        cart.addItem(mouse, 2);
        cart.addItem(keyboard, 1);

        //  Display Cart      
        cart.displayCart();

        //  Create Bill
        Bill bill = customer.createBill(1001,cart );

        //  Display Bill
        bill.getBillData();

        // Pay Bill
        bill.pay();

        // 9. Display Final Bill
        bill.getBillData();
    }


}
