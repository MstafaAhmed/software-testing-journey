
package com.mycompany.universitycoursemanagementsystem;

/**
 *
 * @author mostafa ahmed
 * 
 */

public class C_LabCourse  extends Course{
     private int labRoom;
    
    //================== Constructor ================================
    
    public C_LabCourse(int courseCode, String name, int labRoom) {
        super(courseCode, name);
        this.labRoom = labRoom;
    }
   
    //==================== getter ==============================
    
    public int getLabRoom() {
        return labRoom;
    }

    //==================== setter ================================
    
    public void setLabRoom(int labRoom) {
        this.labRoom = labRoom;
    }
    
    //==================== methods ===========================
    
    @Override
    public String getType() {
        return "Lab";
    }
    
    @Override
    public String toString() {
        return "Lab Course { " + "courseCode = " + getCourseCode() +
                ", name='" + getName() + '\'' + '}';
    }
    
}
