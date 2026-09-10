package com.mycompany.studentmanagementsystem;
import java.util.ArrayList;


public class Course {

    private int courseId;
    private String courseName;
    private int creditHours;
    private P_Instructor instructor;
    private ArrayList<P_Student> students;

    // ===================== Constructor =====================

    public Course(int courseId, String courseName, int creditHours) {

        setCourseId(courseId);
        setCourseName(courseName);
        setCreditHours(creditHours);

        students = new ArrayList<>();
    }

    // ===================== Getters =========================

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public P_Instructor getInstructor() {
        return instructor;
    }

    public ArrayList<P_Student> getStudents() {
        return students;
    }

    // ===================== Setters =========================

    public void setCourseId(int courseId) {

        if (courseId <= 0) {
            throw new IllegalArgumentException("Course ID must be greater than 0.");
        }

        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {

        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be empty.");
        }

        this.courseName = courseName;
    }

    public void setCreditHours(int creditHours) {

        if (creditHours <= 0 || creditHours > 4) {
            throw new IllegalArgumentException("Credit hours must be greater than 0 and less than 4.");
        }

        this.creditHours = creditHours;
    }

    // ===================== Methods ==========================

    public void assignInstructor(P_Instructor instructor) {

        if (instructor == null) {
            throw new IllegalArgumentException("Instructor cannot be null.");
        }

        this.instructor = instructor;
    }

    public void addStudent(P_Student student) {

        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        if (students.contains(student)) {
            throw new IllegalArgumentException("Student is already enrolled in this course.");
        }

        students.add(student);
    }

    public void removeStudent(P_Student student) {

        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        if (!students.remove(student)) {
            throw new IllegalArgumentException("Student is not enrolled in this course.");
        }

    }

    public void displayCourseInfo() {

        System.out.println("========== Course Information ==========");
        System.out.println("Course ID: " + getCourseId());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Credit Hours: " + getCreditHours());

        if (instructor != null) {
            System.out.println("Instructor: " + instructor.getName());
        } else {
            System.out.println("Instructor: Not Assigned");
        }

        System.out.println("Number of Students: " + students.size());
        System.out.println("========================================");
    }
}