package com.mycompany.onlinestore;

/**
 *
 * @author mostafa ahmed
 */
public class I_C_Shirt extends I_Clothing {
  
    private String material ;
    
    
    //================Constructor=====================
    
    public I_C_Shirt(String name , double price ,int availableCopies,
                      String size , String color,
                      String material){
        super(name , price , availableCopies,size,color);
        this.material = material;
    
    }
    
    //===================getter===============================
   public String getMaterial(){
       return material;
   }
   
    
   //======================= setter =================================
   public void setMaterial(String material){
       this.material = material;
   }
   
   
   //======================== Method ========================

    @Override
    public String getCategory() {
        return "Clothing - Shirt";
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available: " + getAvailableCopies());
        System.out.println("Category: " + getCategory());
        
        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColor());
        System.out.println("Material: " + getMaterial());
}
    
}
