package com.mycompany.onlinestore;

/**
 *
 * @author mostafa ahmed
 */
public class I_D_Printer extends I_Devices {
    private boolean isColor;
    
    
     
            
    //================Constructor=====================
    
    public I_D_Printer(String name , double price ,int availableCopies,
                      String brand , int warrantyMonths,
                      boolean isColor){
        super(name , price , availableCopies,brand,warrantyMonths);
        this.isColor = isColor;
    
    }
    
    //===================getter===============================
   public boolean getIsColor(){
       return isColor;
   }
   
    
   //======================= setter =================================
   public void setIsColor(boolean isColor){
       this.isColor = isColor;
   }
   
   
   //======================== Method ========================

    @Override
    public String getCategory() {
        return "Device - Printer";
    }
 
    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available: " + getAvailableCopies());
        System.out.println("Category: " + getCategory());

        System.out.println("Brand: " + getBrand());
        System.out.println("Warranty: " + getWarrantyMonths() + " months");
        System.out.println("Color Printer: " + getIsColor());
}
}
