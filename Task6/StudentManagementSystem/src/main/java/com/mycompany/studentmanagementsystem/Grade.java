package com.mycompany.studentmanagementsystem;

/**
 *
 * @author mostafa ahmed
 * 
 */

public class Grade {

    private P_Student student;
    private Course course;

    private double assignment;
    private double midterm;
    private double finalExam;

    // ===================== Constructor =====================

    public Grade(P_Student student, Course course,
                 double assignment, double midterm,
                 double finalExam) {

        setStudent(student);
        setCourse(course);
        setAssignment(assignment);
        setMidterm(midterm);
        setFinalExam(finalExam);
    }

    // ===================== Getters =========================

    public P_Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public double getAssignment() {
        return assignment;
    }

    public double getMidterm() {
        return midterm;
    }

    public double getFinalExam() {
        return finalExam;
    }

    // ===================== Setters =========================

    public void setStudent(P_Student student) {

        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        this.student = student;
    }

    public void setCourse(Course course) {

        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null.");
        }

        this.course = course;
    }

    public void setAssignment(double assignment) {

        if (assignment < 0 || assignment > 10) {
            throw new IllegalArgumentException("Assignment grade must be between 0 and 10.");
        }

        this.assignment = assignment;
    }

    public void setMidterm(double midterm) {

        if (midterm < 0 || midterm > 30) {
            throw new IllegalArgumentException("Midterm grade must be between 0 and 30.");
        }

        this.midterm = midterm;
    }

    public void setFinalExam(double finalExam) {

        if (finalExam < 0 || finalExam > 60) {
            throw new IllegalArgumentException("Final exam grade must be between 0 and 60.");
        }

        this.finalExam = finalExam;
    }

    // ===================== Methods ==========================

    public double calculateTotal() {
        return assignment + midterm + finalExam;
    }

    public double calculatePercentage() {
        double total = calculateTotal();
        double maximumMark = 100;

        return (total / maximumMark) * 100;
    }

    public String getLetterGrade() {

        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    // ===================== Display Method =====================

    public void displayGradeInfo() {

        System.out.println("\n*************** GRADE INFORMATION ***************");

        System.out.println("Student: " + getStudent().getName());
        System.out.println("Course: " + getCourse().getCourseName());
        System.out.println("Assignment: " + getAssignment());
        System.out.println("Midterm: " + getMidterm());
        System.out.println("Final Exam: " + getFinalExam());
        System.out.println("Total: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Letter Grade: " + getLetterGrade());

        System.out.println("**************************************************");
}
}
