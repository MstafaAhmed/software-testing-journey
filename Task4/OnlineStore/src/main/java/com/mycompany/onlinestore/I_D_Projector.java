package com.mycompany.onlinestore;

/**
 *
 * @author compu magic
 */
public class I_D_Projector extends I_Devices {
    private int lumens;
    
    
     
            
    //================Constructor=====================
    
    public I_D_Projector(String name , double price ,int availableCopies,
                      String brand , int warrantyMonths,
                      int lumens){
        super(name , price , availableCopies,brand,warrantyMonths);
        this.lumens = lumens;
    
    }
    
    //===================getter===============================
   public int getLumens(){
       return lumens;
   }
   
    
   //======================= setter =================================
   public void setLumens(int lumens){
       this.lumens = lumens;
   }
   
   
   //======================== Method ========================

    @Override
    public String getCategory() {
        return "Device - Projector";
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available: " + getAvailableCopies());
        System.out.println("Category: " + getCategory());

        System.out.println("Brand: " + getBrand());
        System.out.println("Warranty: " + getWarrantyMonths() + " months");
        System.out.println("Lumens: " + getLumens());
}
}
