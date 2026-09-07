package com.mycompany.universitycoursemanagementsystem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mostafa ahmed
 * 
 */
public class Student {
    private String name;
    private int ID;
    private List<Course> enrolledCourses;
    
    //================== Constructor ================================
    
   public Student(String name, int ID) {
    this.name = name;
    this.ID = ID;
    this.enrolledCourses = new ArrayList<>();
}
    //==================== getter ==============================
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }    
    
    
    //==================== setter ================================
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int ID) {
        this.ID = ID;
    }
    
    //==================== methods ===============================
    
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    /*
    public void displayInfo() {
        System.out.println("Student ID: " + ID);
      System.out.println("Student Name: " + name);
    }
    */
    
    
    public void displayCourses() {
        System.out.println("Courses for student: " + name + " With ID : " + ID );
        for (Course course : enrolledCourses) {
         System.out.println(course);
        }

    }
    @Override
public String toString() {
    return "Student{name='" + name + "', ID=" + ID + "}";
}

}
