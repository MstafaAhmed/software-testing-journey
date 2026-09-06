package com.mycompany.onlinestore;

/**
 *
 * @author mostafa ahmed
 */
public class I_D_Laptop extends I_Devices {
    private int ramGB;
    
    
     
            
    //================Constructor=====================
    
    public I_D_Laptop(String name , double price ,int availableCopies,
                      String brand , int warrantyMonths,
                      int ramGB){
        super(name , price , availableCopies,brand,warrantyMonths);
        this.ramGB = ramGB;
    
    }
    
    //===================getter===============================
   public int getRamGB(){
       return ramGB;
   }
   
    
   //======================= setter =================================
   public void setRamGB(int ramGB){
       this.ramGB = ramGB;
   }
   
   
   //======================== Method ========================

    @Override
    public String getCategory() {
        return "Device - Laptop";
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available: " + getAvailableCopies());
        System.out.println("Category: " + getCategory());

        System.out.println("Brand: " + getBrand());
        System.out.println("Warranty: " + getWarrantyMonths() + " months");
        System.out.println("RAM: " + getRamGB() + " GB");
}
    
}
