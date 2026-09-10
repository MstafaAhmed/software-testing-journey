package com.mycompany.studentmanagementsystem;

/**
 *
 * @author mostafa ahmed
 * 
 */
public abstract class Person {
  
    private int id;
    private String name;
    private String email;
    private String phone;
    
    // ============= Constructors ===============================

    public Person(int id, String name, String email, String phone) {
        // we call setter methods to applay checks before assigns values 
        setId(id);   
        setName(name);
        setEmail(email);
        setPhone(phone);
    }
    //======================= Getters ================================
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    
    //======================= Setters ================================
    
    public void setId(int id){
        // check that the id > 0
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0.");
            }
        this.id = id;        
    }
    
    public void setName(String name){
        // check that the name is valid input
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }
    
    public void setEmail(String email){
        // check validation of email and that it must contain @
        if (email == null || email.trim().isEmpty() || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email.");
        }
        this.email = email;
    }
    public void setPhone(String phone){
        // check validation of phone number
        if (phone == null || phone.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone cannot be empty.");
        }
        this.phone = phone;
    }
    
    //======================= Methods ================================

    public abstract void displayInfo();

    // Getters and setters

    
}
