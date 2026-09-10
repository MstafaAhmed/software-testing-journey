package com.mycompany.studentmanagementsystem;

/**
 *
 * @author mostafa ahmed
 *
 */


// =================== MAIN CLASS ===============================

public abstract class P_Student extends Person {

    private int enrollmentYear;
    private double GPA;
    private enum_Department department;

    // ===================== Constructors ==================================

    public P_Student(int id, String name, String email, String phone,
                     int enrollmentYear, double GPA, enum_Department department) {

        // Validate inherited attributes using Person setters
        super(id, name, email, phone);

        // Validate P_Student attributes using setters
        setEnrollmentYear(enrollmentYear);
        setGpa(GPA);
        setDepartment(department);
    }

    // ======================= Getters ======================================

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public double getGpa() {
        return GPA;
    }

    public enum_Department getDepartment() {
        return department;
    }

    // ======================= Setters ======================================

    public void setEnrollmentYear(int enrollmentYear) {

        // Enrollment year must be a valid year
        if (enrollmentYear <= 0) {
            throw new IllegalArgumentException("Enrollment year must be greater than 0.");
        }

        this.enrollmentYear = enrollmentYear;
    }

    public void setGpa(double gpa) {

        // GPA must be between 0 and 4
        if (gpa < 0 || gpa > 4) {
            throw new IllegalArgumentException("GPA must be between 0 and 4.");
        }

        this.GPA = gpa;
    }

    public void setDepartment(enum_Department department) {

        // Department cannot be null
        if (department == null) {
            throw new IllegalArgumentException("Department cannot be null.");
        }

        this.department = department;
    }

    // ======================= Methods ======================================

    public abstract String getStudentType();
}


/*
// ===================== Enum ================================

enum Department {
    Electrical,
    Mechanical,
    Civil,
    Arch,
    Electronics
}


*/