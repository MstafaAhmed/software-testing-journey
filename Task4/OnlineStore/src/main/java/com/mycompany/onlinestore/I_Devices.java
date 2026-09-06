package com.mycompany.onlinestore;

/**
 *
 * @author mostafa ahmed
 */
public abstract class I_Devices extends Item{
      private String brand;
      private int warrantyMonths;
   
   //================Constructor=====================
   
   public I_Devices(String name , double price ,int availableCopies,
                      String brand , int warrantyMonths ){
   
       super(name , price , availableCopies);
       this.brand = brand;
       this.warrantyMonths = warrantyMonths;
   
   }
   
   //===================getter===============================
   public String getBrand(){
       return brand;
   }
   
   public int getWarrantyMonths(){
       return warrantyMonths;
   }
   
    
   //======================= setter =================================
   public void setBrand(String brand){
       this.brand = brand;
   }
   
   public void setWarrantyMonths(int warrantyMonths){
       this.warrantyMonths = warrantyMonths;
   }
   
   //======================== Method ========================

 
}
