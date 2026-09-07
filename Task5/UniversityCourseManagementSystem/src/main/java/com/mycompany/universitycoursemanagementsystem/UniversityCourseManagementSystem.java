
package com.mycompany.universitycoursemanagementsystem;

/**
 *
 * @author mostafa ahmed 
 * 
 */
public class UniversityCourseManagementSystem {

    public static void main(String[] args) {
    
         // ================== Create Department ==================

    Department department = new Department("Computer Science","Dr. Ahmed Youseef");
  //  Department department2 = new Department("Electrical Engineering ","Dr. Walaa Gabr");

    // ================== Create Courses ==================

    Course theoryCourse = new C_TheoryCourse(101,"Java Programming",3);

    Course labCourse = new C_LabCourse(102,"Java Programming Lab",24);

    // ================== Add Courses to Department ==================

    department.addCourse(theoryCourse);
    department.addCourse(labCourse);

    // ================== Create Students ==================
    //=================== More than two to see more cases  ================

    Student student1 = new Student("Ahmed", 1 );
    Student student2 = new Student("Mohamed", 2);
    
    Student student3 = new Student("Ziad", 3 );
    Student student4 = new Student("Yara", 4);
    Student student5 = new Student("Alaa", 5 );
    Student student6 = new Student("Eman",6);

    // ================== Enroll Students ==================

    // Creates two students and enrolls them in different courses
    student1.enrollCourse(theoryCourse);
    student2.enrollCourse(labCourse);
    
    
    student3.enrollCourse(theoryCourse);
    student4.enrollCourse(labCourse);
    
    student5.enrollCourse(labCourse);
    student6.enrollCourse(labCourse);
    student5.enrollCourse(theoryCourse);
    student6.enrollCourse(theoryCourse);

    
    
    // ================== Add Students to Department ==================

    department.addStudent(student1);
    department.addStudent(student2);
    department.addStudent(student3);
    department.addStudent(student4);
    department.addStudent(student5);
    department.addStudent(student6);

    // ================== Display Department Courses ==================

    department.displayCourses();

    // ================== Display Students ==================

    System.out.println("\n================ Students ================");

    department.displayStudents();

    // ================== Display Student Courses ==================

    System.out.println("\n================ Enrollments ================");

    student1.displayCourses();
    System.out.println();

    student2.displayCourses();
    System.out.println();

    student3.displayCourses();
    System.out.println();

    student4.displayCourses();
    System.out.println();

    student5.displayCourses();
    System.out.println();

    student5.displayCourses();
    
    }
}
