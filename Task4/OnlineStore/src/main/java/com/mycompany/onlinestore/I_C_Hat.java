package com.mycompany.onlinestore;

/**
 *
 * @author mostafa ahmed
 */
public class I_C_Hat extends I_Clothing {
    private String style ;
    
    
    //================Constructor=====================
    
    public I_C_Hat(String name , double price ,int availableCopies,
                      String size , String color,
                      String style){
        super(name , price , availableCopies,size,color);
        this.style = style;
    
    }
    
    //===================getter===============================
   public String getStyle(){
       return style;
   }
   
    
   //======================= setter =================================
   public void setStyle(String style){
       this.style = style;
   }
   
   
   //======================== Method ========================

    @Override
    public String getCategory() {
        return "Clothing - Hat";
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available: " + getAvailableCopies());
        System.out.println("Category: " + getCategory());

        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColor());
        System.out.println("Style: " + getStyle());
}
    
}
