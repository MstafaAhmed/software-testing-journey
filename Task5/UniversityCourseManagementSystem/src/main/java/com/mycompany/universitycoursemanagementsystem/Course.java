package com.mycompany.universitycoursemanagementsystem;

/**
 *
 * @author mostafa ahmed
 * 
 */
public abstract class Course {
    private int courseCode;
    private String name;
    
    //================== Constructor ================================
    
    public Course(int courseCode , String name){
        this.courseCode = courseCode;
        this.name = name;
    }
    
    //==================== getter ==============================
    
    public int getCourseCode(){
        return courseCode;
    }
    
    public String getName(){
        return name;
    }
    
    
    //==================== setter ================================
    
    public void setCourseCode(int courseCode){
        this.courseCode = courseCode;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    //==================== methods ===========================
    
    //Each course type must implement a method that returns its type (“Theory” or “Lab”).
     public abstract String getType();
     
     
     // public abstract void displayInfo();
    
}
