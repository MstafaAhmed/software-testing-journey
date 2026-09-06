package com.mycompany.shoppingsystem;
import java.time.LocalDate;

/**
 *
 * @author compu magic
 */
public class Bill {
    
    // Attributes
    private final int billID;
    private LocalDate billDate;


    // A Bill belongs to a Customer
    private Customer customer;

    // A Bill is created from a Cart
    private Cart cart;

    private boolean paid;
    private boolean cancelled;

    // Default constructor
    public Bill() {
        billID = 0;
        billDate = LocalDate.now();
        paid = false;
        cancelled = false;
    }

    // Parameterized constructor
    public Bill(int billID, Customer customer, Cart cart) {

        this.billID = billID;
        this.customer = customer;
        this.cart = cart;

        this.billDate = LocalDate.now();

        this.paid = false;
        this.cancelled = false;
    }


    // Get Bill ID
    public int getBillID() {
        return billID;
    }


    // Get Bill Date
    public LocalDate getBillDate() {
        return billDate;
    }


    // Set Bill Date
    public void setBillDate(LocalDate billDate) {
        this.billDate = billDate;
    }


    // Get Customer
    public Customer getCustomer() {
        return customer;
    }


    // Set Customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    // Get Cart
    public Cart getCart() {
        return cart;
    }


    // Set Cart
    public void setCart(Cart cart) {
        this.cart = cart;
    }


    // Get Paid status
    public boolean isPaid() {
        return paid;
    }


    // Get Cancelled status
    public boolean isCancelled() {
        return cancelled;
    }


    // Calculate total amount
    public double getTotal() {

        if (cart == null) {
            return 0;
        }

        return cart.getTotal();
    }


    // Display bill
    public void getBillData() {

        System.out.println("\n========== BILL ==========");

        System.out.println("Bill ID: " + billID);

        System.out.println("Date: " + billDate);


        if (customer != null) {

            System.out.println(
                    "Customer: " +
                    customer.getName()
            );
        }


        if (cart != null) {

            System.out.println(
                    "Total: " +
                    cart.getTotal()
            );
        } else {

            System.out.println("Total: 0.0");
        }


        System.out.println("Paid: " + paid);

        System.out.println("Cancelled: " + cancelled);

        System.out.println("==========================");
    }


    // Pay bill
    public void pay() {

        if (cancelled) {

            System.out.println(
                    "Cannot pay cancelled bill."
            );

            return;
        }


        if (paid) {

            System.out.println(
                    "Bill already paid."
            );

            return;
        }


        paid = true;

        System.out.println(
                "Payment successful."
        );
    }


    // Delete item from cart
    public void deleteItem(int index) {

        if (cart != null) {

            cart.deleteItem(index);

        } else {

            System.out.println(
                    "No cart associated with this bill."
            );
        }
    }


    // Cancel bill
    public void cancelBill() {

        if (paid) {

            System.out.println(
                    "Cannot cancel a paid bill."
            );

            return;
        }


        if (cancelled) {

            System.out.println(
                    "Bill already cancelled."
            );

            return;
        }


        cancelled = true;

        System.out.println(
                "Bill cancelled."
        );
    }

}
