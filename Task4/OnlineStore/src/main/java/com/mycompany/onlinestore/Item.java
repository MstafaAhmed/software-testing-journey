package com.mycompany.onlinestore;

/**
 *
 * @author mostafa ahmed
 */
public abstract class Item {
    
    private String name;
    private double price ;
    private int availableCopies;
    
    //================== constructor =================
    public Item(String name , double price ,int availableCopies){
        this.name = name;
        this.price = price;
        this.availableCopies = availableCopies;
    
    }
    
    //====================== Getter ==========================
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    public int getAvailableCopies(){
        return availableCopies;
    }
        
    //=======================setter============================
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setAvailableCopies(int availableCopies){
        this.availableCopies = availableCopies;
    }
    
        
    //=======================Methods============================
    
    public void sell(){
        if(availableCopies <= 0){
            System.out.println(this.name  +" is out of stock.");
        }else{
            availableCopies--;
        }
    }
    public void returnItem(){
        availableCopies++;
    }
    public abstract String getCategory();
    
    // to enforce each element to display its information
    public abstract void displayDetails();
    
    
}
