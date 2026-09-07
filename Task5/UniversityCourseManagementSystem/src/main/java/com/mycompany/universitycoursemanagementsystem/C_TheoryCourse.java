package com.mycompany.universitycoursemanagementsystem;

/**
 *
 * @author mostafa ahmed
 * 
 */
public class C_TheoryCourse extends Course {

    private int lectureHours;
    
    //================== Constructor ================================
    
    public C_TheoryCourse(int courseCode, String name, int lectureHours) {
        super(courseCode, name);
        this.lectureHours = lectureHours;
    }
   
    //==================== getter ==============================
    
    public int getLectureHours() {
        return lectureHours;
    }

    //==================== setter ================================
    
    public void setLectureHours(int lectureHours) {
        this.lectureHours = lectureHours;
    }
    
    //==================== methods ===========================
    
    @Override
    public String getType() {
        return "Theory";
    }
    
    @Override
    public String toString() {
        return "Theory Course { " + "courseCode = " + getCourseCode() +
                ", name='" + getName() + '\'' + '}';
    }
    
}