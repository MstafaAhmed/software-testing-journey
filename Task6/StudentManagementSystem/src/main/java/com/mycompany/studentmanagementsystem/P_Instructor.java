package com.mycompany.studentmanagementsystem;

/**
 *
 * @author mostafa ahmed
 *
 */

// ===================== MAIN CLASS ==============================

public abstract class P_Instructor extends Person {

    private int hireYear;
    private enum_Department department;
    private String specialization;

    // ===================== Constructors =========================

    public P_Instructor(int id, String name, String email, String phone,
                        int hireYear, enum_Department department, String specialization) {

        // Validate inherited attributes using Person setters
        super(id, name, email, phone);

        // Validate Instructor attributes using setters
        setHireYear(hireYear);
        setDepartment(department);
        setSpecialization(specialization);
    }

    // ======================= Getters =============================

    public int getHireYear() {
        return hireYear;
    }

    public enum_Department getDepartment() {
        return department;
    }

    public String getSpecialization() {
        return specialization;
    }

    // ======================= Setters =============================

    public void setHireYear(int hireYear) {

        // Hire year must valid ,within valid acceptance year range
        if ( hireYear <= 1996 || hireYear > 2026) {
            throw new IllegalArgumentException("Hire year must be between 1996 and 2026.");}

        this.hireYear = hireYear;
    }

    public void setDepartment(enum_Department department) {

        // Department cannot be null
        if (department == null) {
            throw new IllegalArgumentException("Department cannot be null.");
        }

        this.department = department;
    }

    public void setSpecialization(String specialization) {

        // Specialization cannot be null or empty
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be empty.");
        }

        this.specialization = specialization;
    }

    // ======================= Methods ==============================

    public abstract String getInstructorType();

    @Override
    public abstract void displayInfo();
}