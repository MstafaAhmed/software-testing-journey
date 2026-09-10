package com.mycompany.studentmanagementsystem;

import java.time.LocalDate;

/**
 *
 * @author mostafa ahmed
 *
 */

// ===================== Enum =====================

enum AttendanceStatus {
    PRESENT,
    ABSENT,
    LATE
}

//====================== MAIN CLASS ========================

public class Attendance {

    private P_Student student;
    private Course course;
    private LocalDate date;
    private AttendanceStatus status;

    // ===================== Constructor =====================

    public Attendance(P_Student student, Course course,
                      LocalDate date, AttendanceStatus status) {

        setStudent(student);
        setCourse(course);
        setDate(date);
        setStatus(status);
    }

    // ===================== Getters =========================

    public P_Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDate getDate() {
        return date;
    }

    public AttendanceStatus getStatus() {
        return status;
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

    public void setDate(LocalDate date) {

        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null.");
        }

        this.date = date;
    }

    public void setStatus(AttendanceStatus status) {

        if (status == null) {
            throw new IllegalArgumentException(
                    "Attendance status cannot be null.");
        }

        this.status = status;
    }

    // ===================== Display Method =====================

    public void displayAttendanceInfo() {

        System.out.println("\n*************** ATTENDANCE INFORMATION ***************");

        System.out.println("Student: " + getStudent().getName());
        System.out.println("Course: " + getCourse().getCourseName());
        System.out.println("Date: " + getDate());
        System.out.println("Status: " + getStatus());

        System.out.println("*******************************************************");
    }
}