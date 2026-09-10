package com.mycompany.studentmanagementsystem;

/**
 *
 * @author mostafa ahmed
 *
 */

// ====================== Enum ================================

// Represents the type of postgraduate degree.
enum Degree {
    Master,
    PhD
}

// ========================= MAIN CLASS ================================

public class P_S_Postgraduate extends P_Student {

    private Degree degreeType;
    private String supervisorName;

    // ===================== Constructors ==================================

    public P_S_Postgraduate(int id, String name, String email, String phone,
                            int enrollmentYear, double GPA, enum_Department department,
                            Degree degreeType, String supervisorName) {

        // Validate inherited attributes
        super(id, name, email, phone, enrollmentYear, GPA, department);

        // Validate postgraduate attributes
        setDegreeType(degreeType);
        setSupervisorName(supervisorName);
    }

    // ======================= Getters ======================================

    public Degree getDegreeType() {
        return degreeType;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    // ======================= Setters ======================================

    public void setDegreeType(Degree degreeType) {

        // Degree type cannot be null
        if (degreeType == null) {
            throw new IllegalArgumentException("Degree type cannot be null.");
        }

        this.degreeType = degreeType;
    }

    public void setSupervisorName(String supervisorName) {

        // Supervisor name cannot be null or empty
        if (supervisorName == null || supervisorName.trim().isEmpty()) {
            throw new IllegalArgumentException("Supervisor name cannot be empty.");
        }

        this.supervisorName = supervisorName;
    }

    // ======================= Methods ======================================

    @Override
    public String getStudentType() {
        return "Postgraduate Student";
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
        System.out.println("Degree Type: " + getDegreeType());
        System.out.println("Supervisor: " + getSupervisorName());
        System.out.println("=========================================");
    }
}

/*
// =========== enum ============== 
// supervisorName
enum SupervisorName{
    Ahmed , Ibrahiem , Walid , Mina 
}

*/