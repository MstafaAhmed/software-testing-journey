package com.mycompany.studentmanagementsystem;

import java.util.ArrayList;

/**
 * 
 * @author mostafa ahmed
 * 
 */

public class StudentManager {

    private final ArrayList<P_Student> students;
    private final ArrayList<Course> courses;
    private final ArrayList<P_Instructor> instructors;
    private final ArrayList<Grade> grades;
    private final ArrayList<Attendance> attendanceRecords;

    // ===================== Constructor =====================

    public StudentManager() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        instructors = new ArrayList<>();
        grades = new ArrayList<>();
        attendanceRecords = new ArrayList<>();
    }

    // =====================================================================
    // STUDENT MANAGEMENT (Add / Edit / Delete / Find / Display)
    // =====================================================================

    public void addStudent(P_Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }
        if (findStudentById(student.getId()) != null) {
            throw new IllegalArgumentException("A student with ID " + student.getId() + " already exists.");
        }
        students.add(student);
        System.out.println("[OK] Student added: " + student.getName());
    }

    public P_Student findStudentById(int id) {
        for (P_Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    /**
     * Edits the basic (Person-level) fields of an existing student record.
     * Pass null or an empty string for any field you don't want to change.
     * Subclass-specific fields (major, GPA, degree, etc.) can be changed
     * directly on the object returned by findStudentById().
     */
    public void editStudent(int id, String name, String email, String phone) {
        P_Student student = findStudentById(id);
        if (student == null) {
            throw new IllegalArgumentException("No student found with ID " + id + ".");
        }
        if (name != null && !name.trim().isEmpty()) {
            student.setName(name);
        }
        if (email != null && !email.trim().isEmpty()) {
            student.setEmail(email);
        }
        if (phone != null && !phone.trim().isEmpty()) {
            student.setPhone(phone);
        }
        System.out.println("[OK] Student updated: " + student.getName());
    }

    /** Deletes a student and un-enrolls them from every course they were in. */
    public boolean deleteStudent(int id) {
        P_Student student = findStudentById(id);
        if (student == null) {
            throw new IllegalArgumentException("No student found with ID " + id + ".");
        }
        for (Course c : courses) {
            if (c.getStudents().contains(student)) {
                c.removeStudent(student);
            }
        }
        students.remove(student);
        System.out.println("[OK] Student deleted: " + student.getName());
        return true;
    }

    public ArrayList<P_Student> getAllStudents() {
        return students;
    }

    public void displayAllStudents() {
        System.out.println("\n=========== ALL STUDENTS (" + students.size() + ") ===========");
        for (P_Student s : students) {
            s.displayInfo();
        }
    }

    // =====================================================================
    // COURSE MANAGEMENT (Add / Edit / Delete / Find / Display)
    // =====================================================================

    public void addCourse(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null.");
        }
        if (findCourseById(course.getCourseId()) != null) {
            throw new IllegalArgumentException("A course with ID " + course.getCourseId() + " already exists.");
        }
        courses.add(course);
        System.out.println("[OK] Course added: " + course.getCourseName());
    }

    public Course findCourseById(int courseId) {
        for (Course c : courses) {
            if (c.getCourseId() == courseId) {
                return c;
            }
        }
        return null;
    }

    public void editCourse(int courseId, String courseName, Integer creditHours) {
        Course course = findCourseById(courseId);
        if (course == null) {
            throw new IllegalArgumentException("No course found with ID " + courseId + ".");
        }
        if (courseName != null && !courseName.trim().isEmpty()) {
            course.setCourseName(courseName);
        }
        if (creditHours != null) {
            course.setCreditHours(creditHours);
        }
        System.out.println("[OK] Course updated: " + course.getCourseName());
    }

    public boolean deleteCourse(int courseId) {
        Course course = findCourseById(courseId);
        if (course == null) {
            throw new IllegalArgumentException("No course found with ID " + courseId + ".");
        }
        courses.remove(course);
        System.out.println("[OK] Course deleted: " + course.getCourseName());
        return true;
    }

    public ArrayList<Course> getAllCourses() {
        return courses;
    }

    public void displayAllCourses() {
        System.out.println("\n=========== ALL COURSES (" + courses.size() + ") ===========");
        for (Course c : courses) {
            c.displayCourseInfo();
        }
    }

    // =====================================================================
    // INSTRUCTOR MANAGEMENT (Add / Delete / Find)
    // =====================================================================

    public void addInstructor(P_Instructor instructor) {
        if (instructor == null) {
            throw new IllegalArgumentException("Instructor cannot be null.");
        }
        if (findInstructorById(instructor.getId()) != null) {
            throw new IllegalArgumentException("An instructor with ID " + instructor.getId() + " already exists.");
        }
        instructors.add(instructor);
        System.out.println("[OK] Instructor added: " + instructor.getName());
    }

    public P_Instructor findInstructorById(int id) {
        for (P_Instructor i : instructors) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public boolean deleteInstructor(int id) {
        P_Instructor instructor = findInstructorById(id);
        if (instructor == null) {
            throw new IllegalArgumentException("No instructor found with ID " + id + ".");
        }
        instructors.remove(instructor);
        System.out.println("[OK] Instructor deleted: " + instructor.getName());
        return true;
    }

    public ArrayList<P_Instructor> getAllInstructors() {
        return instructors;
    }

    // =====================================================================
    // GRADE MANAGEMENT (Record / Calculate)
    // =====================================================================

    public void recordGrade(Grade grade) {
        if (grade == null) {
            throw new IllegalArgumentException("Grade cannot be null.");
        }
        grades.add(grade);
        System.out.println("[OK] Grade recorded for: " + grade.getStudent().getName()
                + " in " + grade.getCourse().getCourseName());
    }

    public ArrayList<Grade> getGradesForStudent(int studentId) {
        ArrayList<Grade> result = new ArrayList<>();
        for (Grade g : grades) {
            if (g.getStudent().getId() == studentId) {
                result.add(g);
            }
        }
        return result;
    }

    /** Calculates an overall GPA (0-4 scale) for a student across all recorded grades. */
    public double calculateOverallGPA(int studentId) {
        ArrayList<Grade> studentGrades = getGradesForStudent(studentId);
        if (studentGrades.isEmpty()) {
            return 0.0;
        }
        double totalPercentage = 0;
        for (Grade g : studentGrades) {
            totalPercentage += g.calculatePercentage();
        }
        double averagePercentage = totalPercentage / studentGrades.size();
        return (averagePercentage / 100) * 4.0;
    }

    // =====================================================================
    // ATTENDANCE MANAGEMENT (Record / Retrieve)
    // =====================================================================

    public void recordAttendance(Attendance attendance) {
        if (attendance == null) {
            throw new IllegalArgumentException("Attendance record cannot be null.");
        }
        attendanceRecords.add(attendance);
    }

    public ArrayList<Attendance> getAttendanceForStudent(int studentId) {
        ArrayList<Attendance> result = new ArrayList<>();
        for (Attendance a : attendanceRecords) {
            if (a.getStudent().getId() == studentId) {
                result.add(a);
            }
        }
        return result;
    }
}