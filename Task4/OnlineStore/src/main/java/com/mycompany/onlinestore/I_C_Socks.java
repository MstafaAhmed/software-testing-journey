package com.mycompany.onlinestore;

/**
 *
 * @author mostafa ahmed
 */
public class I_C_Socks extends I_Clothing{
   private int pairsInPack;
   
    //================Constructor=====================
    
    public I_C_Socks(String name , double price ,int availableCopies,
                      String size , String color,
                      int pairsInPack){
        super(name , price , availableCopies,size,color);
        this.pairsInPack = pairsInPack;
    
    }
    
    //===================getter===============================
   public int getPairsInPack(){
       return pairsInPack;
   }
   
    
   //======================= setter =================================
   public void setPairsInPack(int pairsInPack){
       this.pairsInPack = pairsInPack;
   }
   
   
   //======================== Method ========================

    @Override
    public String getCategory() {
        return "Clothing - Socks";
    }
   @Override
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available: " + getAvailableCopies());
        System.out.println("Category: " + getCategory());

        System.out.println("Size: " + getSize());
        System.out.println("Color: " + getColor());
        System.out.println("Pairs in Pack: " + getPairsInPack());
}
   
   
}
