package com.mycompany.studentmanagementsystem;

/**
 *
 * @author mostafa ahmed
 *
 */

public class P_I_Professor extends P_Instructor {

    private int yearsOfExperience;
    private String researchArea;
    private int publications;
    private boolean departmentHead;

    // ===================== Constructors ==================================

    public P_I_Professor(int id, String name, String email, String phone,
                         int hireYear, enum_Department department,String specialization,
                         int yearsOfExperience, String researchArea,
                         int publications, boolean departmentHead) {

        // Validate inherited attributes
        super(id, name, email, phone,
              hireYear, department, specialization);

        // Validate Professor-specific attributes
        setYearsOfExperience(yearsOfExperience);
        setResearchArea(researchArea);
        setPublications(publications);
        setDepartmentHead(departmentHead);
    }

    // ======================= Getters ======================================

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public int getPublications() {
        return publications;
    }

    public boolean isDepartmentHead() {
        return departmentHead;
    }

    // ======================= Setters ======================================

    public void setYearsOfExperience(int yearsOfExperience) {

        // Years of experience cannot be negative
        if (yearsOfExperience < 0) {
            throw new IllegalArgumentException("Years of experience cannot be negative.");
        }

        this.yearsOfExperience = yearsOfExperience;
    }

    public void setResearchArea(String researchArea) {

        // Research area cannot be null or empty
        if (researchArea == null || researchArea.trim().isEmpty()) {
            throw new IllegalArgumentException("Research area cannot be empty.");
        }

        this.researchArea = researchArea;
    }

    public void setPublications(int publications) {

        // Number of publications cannot be negative
        if (publications < 0) {
            throw new IllegalArgumentException("Number of publications cannot be negative.");
        }

        this.publications = publications;
    }

    public void setDepartmentHead(boolean departmentHead) {
        this.departmentHead = departmentHead;
    }

    // ======================= Methods ======================================

    @Override
    public String getInstructorType() {
        return "Professor";
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
        System.out.println("Years of Experience: " + getYearsOfExperience());
        System.out.println("Research Area: " + getResearchArea());
        System.out.println("Publications: " + getPublications());
        System.out.println("Department Head: " + isDepartmentHead());
        System.out.println("============================================");
    }
}
