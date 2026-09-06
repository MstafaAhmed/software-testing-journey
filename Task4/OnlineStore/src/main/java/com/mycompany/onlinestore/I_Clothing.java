package com.mycompany.onlinestore;

/**
 *
 * @author mostafa ahmed
 */
public abstract class I_Clothing extends Item{
   private String size;
   private String color;
   
   //================Constructor=====================
   
   public I_Clothing(String name , double price ,int availableCopies,
                      String size , String color ){
   
       super(name , price , availableCopies);
       this.size = size;
       this.color = color;
   
   }
   
   //===================getter===============================
   public String getSize(){
       return size;
   }
   
   public String getColor(){
       return color;
   }
   
    
   //======================= setter =================================
   public void setSize(String size){
       this.size = size;
   }
   
   public void setColor(String color){
       this.color = color;
   }
   
   //======================== Method ========================

   
}
