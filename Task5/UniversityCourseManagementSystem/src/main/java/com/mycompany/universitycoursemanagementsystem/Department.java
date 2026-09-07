package com.mycompany.universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mostafa ahmed 
 * 
 */
public class Department {
    private String name;
    private String head;
    private List<Student> students;
    private List<Course> courses;
    
    //================== Constructor ================================
    
   public Department(String name, String head) {
        this.name = name;
        this.head = head;

         students = new ArrayList<>();
         courses = new ArrayList<>();

        }
 
   //==================== getter ==============================
    
    public String getName() {
        return name;
    }

    public String getHead() {
        return head;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }
    
    //==================== setter ================================
    public void setName(String name) {
        this.name = name;
    }

    public void setHead(String head) {
        this.head = head;
    }
    
    //==================== methods ===========================
    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    
    public void displayCourses() {
     System.out.println("\nCourses in " + name + " Department:");
     
     for (Course course : courses) {
         System.out.println(course);
         }
    }
    public void displayStudents() {

    System.out.println("\nStudents in " + name + " Department:");

    for (Student student : students) {
        System.out.println(student);
    }
    }
    
    @Override
public String toString() {
    return "Department{" +  "name='" + name + '\'' +
            ", head='" + head + '\'' + '}';}
    
}    

