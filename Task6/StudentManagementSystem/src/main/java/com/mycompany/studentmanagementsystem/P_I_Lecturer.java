package com.mycompany.studentmanagementsystem;

/**
 *
 * @author mostafa ahmed
 *
 */

// ================= Enum ===================

enum Qualification {
    Master,
    PhD
}

// ================= Main Class ===================

public class P_I_Lecturer extends P_Instructor {

    private int teachingHours;
    private int coursesTaught;
    private Qualification qualification;  // master od phd

    // ===================== Constructors ==================================

    public P_I_Lecturer(int id, String name, String email, String phone,
                        int hireYear, enum_Department department,String specialization,
                        int teachingHours, int coursesTaught,Qualification qualification) {

        // Validate inherited attributes
        super(id, name, email, phone,
              hireYear, department, specialization);

        // Validate Lecturer-specific attributes
        setTeachingHours(teachingHours);
        setCoursesTaught(coursesTaught);
        setQualification(qualification);
    }

    // ======================= Getters ======================================

    public int getTeachingHours() {
        return teachingHours;
    }

    public int getCoursesTaught() {
        return coursesTaught;
    }

    public Qualification getQualification() {
        return qualification;
    }

    // ======================= Setters ======================================

    public void setTeachingHours(int teachingHours) {

        // Teaching hours cannot be negative
        if (teachingHours < 0) {
            throw new IllegalArgumentException("Teaching hours cannot be negative.");
        }

        this.teachingHours = teachingHours;
    }

    public void setCoursesTaught(int coursesTaught) {

        // Number of courses cannot be negative
        if (coursesTaught < 0) {
            throw new IllegalArgumentException("Number of courses cannot be negative.");
        }

        this.coursesTaught = coursesTaught;
    }

    public void setQualification(Qualification qualification) {

        // Qualification cannot be null
        if (qualification == null) {
            throw new IllegalArgumentException("Qualification cannot be null." );
        }

        this.qualification = qualification;
    }

    // ======================= Methods ======================================

    @Override
    public String getInstructorType() {
        return "Lecturer";
    }

    @Override
    public void displayInfo() {

        System.out.println("========== Instructor Information ==========");
        System.out.println("Instructor Type: " + getInstructorType());
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Hire Year: " + getHireYear());
        System.out.println("Department: " + getDepartment());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("Teaching Hours: " + getTeachingHours());
        System.out.println("Courses Taught: " + getCoursesTaught());
        System.out.println("Qualification: " + getQualification());
        System.out.println("============================================");
    }
}