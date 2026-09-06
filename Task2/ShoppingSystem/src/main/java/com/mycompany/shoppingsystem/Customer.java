package com.mycompany.shoppingsystem;

/**
 *
 * @author compu magic
 */
import java.util.ArrayList;

public class Customer {

    // Attributes
    private final int id;
    private String name;
    private String cardNumber;
    private String address;
    private String mobile;

    // A Customer can own one or more Carts
    private ArrayList<Cart> carts;

    // A Customer can own one or more Bills
    private ArrayList<Bill> bills;

    // Default constructor
    public Customer() {
        id = 0;
        carts = new ArrayList<>();
        bills = new ArrayList<>();
    }

    // Parameterized constructor
    public Customer(int id, String name,String cardNumber,String address, String mobile) {
        this.id = id;
        this.name = name;
        this.cardNumber = cardNumber;
        this.address = address;
        this.mobile = mobile;

        // Initialize ArrayLists
        carts = new ArrayList<>();
        bills = new ArrayList<>();

        // Create the first cart for this customer
        Cart cart = new Cart(id);
        carts.add(cart);
    }


    // =========================
    // Getters
    
    // Get Customer ID
    public int getId() {
        return id;
    }

    // Get Name
    public String getName() {
        return name;
    }

    // Get Card Number
    public String getCardNumber() {
        return cardNumber;
    }

    // Get Address
    public String getAddress() {
        return address;
    }

    // Get Mobile
    public String getMobile() {
        return mobile;
    }

    // Get all carts
    public ArrayList<Cart> getCarts() {
        return carts;
    }

    // Get all bills
    public ArrayList<Bill> getBills() {
        return bills;
    }


    // Get a specific cart
    public Cart getCart(int index) {

        if (index < 0 || index >= carts.size()) {
            return null;
        }

        return carts.get(index);
    }

    // Get the first/current cart
    public Cart getCart() {

        if (carts.isEmpty()) {
            return null;
        }

        return carts.get(0);
    }

    // =========================
    // Setters

    public void setName(String name) {
        this.name = name;
    }


    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    // =========================
    // Cart Methods

    // Add a cart
    public void addCart(Cart cart) {

        if (cart != null) {
            carts.add(cart);
        }
    }


    // Create a new cart
    public Cart createCart(int cartID) {

        Cart cart = new Cart(cartID);

        carts.add(cart);

        return cart;
    }

    // Remove a cart
    public void removeCart(Cart cart) {

        carts.remove(cart);
    }


    // Get number of carts
    public int getNumberOfCarts() {
        return carts.size();
    }

    // =========================
    // Bill Methods

    // Add a bill
    public void addBill(Bill bill) {

        if (bill != null) {
            bills.add(bill);
        }
    }

    // Create a bill from a cart
    public Bill createBill(int billID, Cart cart) {

        if (cart == null) {
            return null;
        }

        Bill bill = new Bill(
                billID,
                this,
                cart
        );

        bills.add(bill);

        return bill;
    }

    // Remove a bill
    public void removeBill(Bill bill) {

        bills.remove(bill);
    }

    // Get number of bills
    public int getNumberOfBills() {
        return bills.size();
    }

    // =========================
    // Display Customer Data
    // =========================

    public void getData() {

        System.out.println(
                "========== CUSTOMER =========="
        );

        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Address: " + address);
        System.out.println("Mobile: " + mobile);

        System.out.println("Number of Carts: "
                + carts.size());

        System.out.println("Number of Bills: "
                + bills.size());

        System.out.println(
                "=============================="
        );
    }


}
