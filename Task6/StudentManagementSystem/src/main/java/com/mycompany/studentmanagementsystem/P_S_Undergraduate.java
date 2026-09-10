package com.mycompany.studentmanagementsystem;

/**
 *
 * @author mostafa ahmed
 *
 */

// ====================== Enum ================================

enum Year {
    first, second, third, fourth, fifth
}

// ====================== MAIN CLASS ===========================

public class P_S_Undergraduate extends P_Student {

    private Year academicYear;
    private String major;
    private int creditHours;

    // ===================== Constructors =====================

    public P_S_Undergraduate(int id, String name, String email, String phone,
                             int enrollmentYear, double GPA, enum_Department department,
                             Year academicYear, String major, int creditHours) {

        // Validate inherited attributes
        super(id, name, email, phone, enrollmentYear, GPA, department);

        // Validate undergraduate attributes
        setAcademicYear(academicYear);
        setMajor(major);
        setCreditHours(creditHours);
    }

    // ======================= Getters =========================

    public Year getAcademicYear() {
        return academicYear;
    }

    public String getMajor() {
        return major;
    }

    public int getCreditHours() {
        return creditHours;
    }

    // ======================= Setters =========================

    public void setAcademicYear(Year academicYear) {

        // Academic year cannot be null
        if (academicYear == null) {
            throw new IllegalArgumentException("Academic year cannot be null.");
        }

        this.academicYear = academicYear;
    }

    public void setMajor(String major) {

        // Major cannot be null or empty
        if (major == null || major.trim().isEmpty()) {
            throw new IllegalArgumentException("Major cannot be empty.");
        }

        this.major = major;
    }

    public void setCreditHours(int creditHours) {

        // Credit hours cannot be negative
        if (creditHours < 0 ) {
            throw new IllegalArgumentException("Credit hours cannot be negative.");
        }

        this.creditHours = creditHours;
    }

    // ======================= Methods ==========================

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public void displayInfo() {

        System.out.println("========== Student Information ==========");
        System.out.println("Student Type: " + getStudentType());
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Department: " + getDepartment());
        System.out.println("Enrollment Year: " + getEnrollmentYear());
        System.out.println("GPA: " + getGpa());
        System.out.println("Academic Year: " + getAcademicYear());
        System.out.println("Major: " + getMajor());
        System.out.println("Credit Hours: " + getCreditHours());
        System.out.println("=========================================");
    }
}