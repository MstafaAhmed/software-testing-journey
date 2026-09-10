package com.mycompany.studentmanagementsystem;

import java.time.LocalDate;

/**
 *
 * @author mostafa ahmed
 * 
 */
public class StudentManagementSystem {

    public static void main(String[] args) {
       
        //                    CREATE MANAGER
        // =========================================================

        StudentManager manager = new StudentManager();

        // =========================================================
        //                    CREATE STUDENTS
        // =========================================================

        System.out.println("\n==================== CREATE STUDENTS ====================");

        P_S_Undergraduate student1 = new P_S_Undergraduate(
                1,
                "Ahmed Ali",
                "ahmed@gmail.com",
                "01012345678",
                2024,
                3.50,
                enum_Department.Electrical,
                Year.third,
                "Electrical Power",
                90
        );

        P_S_Undergraduate student2 = new P_S_Undergraduate(
                2,
                "Mohamed Hassan",
                "mohamed@gmail.com",
                "01098765432",
                2023,
                3.20,
                enum_Department.Mechanical,
                Year.fourth,
                "Mechanical Design",
                110
        );

        P_S_Postgraduate student3 = new P_S_Postgraduate(
                3,
                "Omar Ahmed",
                "omar@gmail.com",
                "01155555555",
                2022,
                3.80,
                enum_Department.Electronics,
                Degree.Master,
                "Dr. Ahmed Khalil"
        );


        // =========================================================
        //                    ADD STUDENTS
        // =========================================================

        System.out.println("\n==================== ADD STUDENTS ====================");

        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);


        // =========================================================
        //                    DISPLAY STUDENTS
        // =========================================================

        manager.displayAllStudents();


        // =========================================================
        //                    FIND STUDENT
        // =========================================================

        System.out.println("\n==================== FIND STUDENT ====================");

        P_Student foundStudent = manager.findStudentById(1);

        if (foundStudent != null) {
            System.out.println("Student Found:");
            foundStudent.displayInfo();
        } else {
            System.out.println("Student not found.");
        }


        // =========================================================
        //                    EDIT STUDENT
        // =========================================================

        System.out.println("\n==================== EDIT STUDENT ====================");

        manager.editStudent(
                1,
                "Ahmed Ali Updated",
                "ahmed.updated@gmail.com",
                "01099999999"
        );

        manager.findStudentById(1).displayInfo();


        // =========================================================
        //                    CREATE INSTRUCTORS
        // =========================================================

        System.out.println("\n==================== CREATE INSTRUCTORS ====================");

        P_I_Lecturer lecturer = new P_I_Lecturer(
                101,
                "Dr. Ali Mohamed",
                "ali@university.com",
                "01111111111",
                2015,
                enum_Department.Electrical,
                "Power Electronics",
                12,
                3,
                Qualification.PhD
        );

        P_I_Professor professor = new P_I_Professor(
                102,
                "Prof. Hassan Ahmed",
                "hassan@university.com",
                "01222222222",
                2005,
                enum_Department.Electronics,
                "Semiconductor Devices",
                20,
                "Nanoelectronics",
                15,
                true
        );


        // =========================================================
        //                    ADD INSTRUCTORS
        // =========================================================

        System.out.println("\n==================== ADD INSTRUCTORS ====================");

        manager.addInstructor(lecturer);
        manager.addInstructor(professor);


        // =========================================================
        //                    DISPLAY INSTRUCTORS
        // =========================================================

        System.out.println("\n==================== DISPLAY INSTRUCTORS ====================");

        for (P_Instructor instructor : manager.getAllInstructors()) {
            instructor.displayInfo();
            System.out.println();
        }


        // =========================================================
        //                    FIND INSTRUCTOR
        // =========================================================

        System.out.println("\n==================== FIND INSTRUCTOR ====================");

        P_Instructor foundInstructor = manager.findInstructorById(101);

        if (foundInstructor != null) {
            System.out.println("Instructor Found:");
            foundInstructor.displayInfo();
        }


        // =========================================================
        //                    CREATE COURSES
        // =========================================================

        System.out.println("\n==================== CREATE COURSES ====================");

        Course course1 = new Course(
                1001,
                "Electronic Devices",
                3
        );

        Course course2 = new Course(
                1002,
                "Power Electronics",
                4
        );


        // =========================================================
        //                    ASSIGN INSTRUCTORS
        // =========================================================

        course1.assignInstructor(professor);
        course2.assignInstructor(lecturer);


        // =========================================================
        //                    ADD COURSES
        // =========================================================

        System.out.println("\n==================== ADD COURSES ====================");

        manager.addCourse(course1);
        manager.addCourse(course2);


        // =========================================================
        //                    ENROLL STUDENTS
        // =========================================================

        System.out.println("\n==================== ENROLL STUDENTS ====================");

        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);

        course2.addStudent(student1);
        course2.addStudent(student2);


        // =========================================================
        //                    DISPLAY COURSES
        // =========================================================

        manager.displayAllCourses();


        // =========================================================
        //                    FIND COURSE
        // =========================================================

        System.out.println("\n==================== FIND COURSE ====================");

        Course foundCourse = manager.findCourseById(1001);

        if (foundCourse != null) {
            foundCourse.displayCourseInfo();
        }


        // =========================================================
        //                    EDIT COURSE
        // =========================================================

        System.out.println("\n==================== EDIT COURSE ====================");

        manager.editCourse(
                1001,
                "Advanced Electronic Devices",
                4
        );

        manager.findCourseById(1001).displayCourseInfo();


        // =========================================================
        //                    CREATE GRADES
        // =========================================================

        System.out.println("\n==================== CREATE GRADES ====================");

        Grade grade1 = new Grade(
                student1,
                course1,
                9,
                27,
                54
        );

        Grade grade2 = new Grade(
                student2,
                course1,
                8,
                24,
                48
        );

        Grade grade3 = new Grade(
                student3,
                course1,
                10,
                28,
                55
        );


        // =========================================================
        //                    RECORD GRADES
        // =========================================================

        System.out.println("\n==================== RECORD GRADES ====================");

        manager.recordGrade(grade1);
        manager.recordGrade(grade2);
        manager.recordGrade(grade3);


        // =========================================================
        //                    DISPLAY GRADES
        // =========================================================

        grade1.displayGradeInfo();

        grade2.displayGradeInfo();

        grade3.displayGradeInfo();


        // =========================================================
        //                    CALCULATE GPA
        // =========================================================

        System.out.println("\n==================== GPA CALCULATION ====================");

        System.out.println("Ahmed GPA: " + manager.calculateOverallGPA(student1.getId()));

        System.out.println("Mohamed GPA: "+ manager.calculateOverallGPA(student2.getId()));

        System.out.println("Omar GPA: "+ manager.calculateOverallGPA(student3.getId()));


        // =========================================================
        //                    ATTENDANCE
        // =========================================================

        System.out.println("\n==================== ATTENDANCE ====================");

        /*
         * Attendance constructor assumed:
         *
         * Attendance(
         *     P_Student student,
         *     Course course,
         *     LocalDate date,
         *     AttendanceStatus status
         * )
         */

        Attendance attendance1 = new Attendance(
                student1,
                course1,
                LocalDate.of(2026, 9, 1),
                AttendanceStatus.PRESENT
        );

        Attendance attendance2 = new Attendance(
                student1,
                course1,
                LocalDate.of(2026, 9, 2),
                AttendanceStatus.LATE
        );

        Attendance attendance3 = new Attendance(
                student2,
                course1,
                LocalDate.of(2026, 9, 1),
                AttendanceStatus.ABSENT
        );

        Attendance attendance4 = new Attendance(
                student3,
                course1,
                LocalDate.of(2026, 9, 1),
                AttendanceStatus.PRESENT
        );


        // =========================================================
        //                    RECORD ATTENDANCE
        // =========================================================

        manager.recordAttendance(attendance1);
        manager.recordAttendance(attendance2);
        manager.recordAttendance(attendance3);
        manager.recordAttendance(attendance4);


        // =========================================================
        //                    DISPLAY ATTENDANCE
        // =========================================================

        attendance1.displayAttendanceInfo();
        attendance2.displayAttendanceInfo();
        attendance3.displayAttendanceInfo();
        attendance4.displayAttendanceInfo();


        // =========================================================
        //              GET STUDENT ATTENDANCE
        // =========================================================

        System.out.println( "\nAttendance records for "+ student1.getName() + ": "
                + manager.getAttendanceForStudent(student1.getId()).size());


        // =========================================================
        //                    REMOVE STUDENT
        // =========================================================

        System.out.println("\n==================== DELETE STUDENT TEST ====================");

        System.out.println(
                "Students before deletion: "
                + manager.getAllStudents().size()
        );

        manager.deleteStudent(3);

        System.out.println(
                "Students after deletion: "
                + manager.getAllStudents().size()
        );


        // =========================================================
        //                    DELETE COURSE
        // =========================================================

        System.out.println("\n==================== DELETE COURSE TEST ====================");

        System.out.println(
                "Courses before deletion: "
                + manager.getAllCourses().size()
        );

        manager.deleteCourse(1002);

        System.out.println(
                "Courses after deletion: "
                + manager.getAllCourses().size()
        );


        // =========================================================
        //                    DELETE INSTRUCTOR
        // =========================================================

        System.out.println("\n==================== DELETE INSTRUCTOR TEST ====================");

        System.out.println(
                "Instructors before deletion: "
                + manager.getAllInstructors().size()
        );

        manager.deleteInstructor(101);

        System.out.println(
                "Instructors after deletion: "
                + manager.getAllInstructors().size()
        );


        // =========================================================
        //                    POLYMORPHISM TEST
        // =========================================================

        System.out.println("\n==================== POLYMORPHISM TEST ====================");

        P_Student studentReference = student1;
        P_Instructor instructorReference = professor;

        System.out.println(
                "Student Type: "
                + studentReference.getStudentType()
        );

        System.out.println(
                "Instructor Type: "
                + instructorReference.getInstructorType()
        );

        System.out.println("\nStudent through Person reference:");
        Person person1 = student1;
        person1.displayInfo();

        System.out.println("\nInstructor through Person reference:");
        Person person2 = professor;
        person2.displayInfo();


        // =========================================================
        //                    FINAL STATUS
        // =========================================================

        System.out.println("\n=================================================");
        System.out.println("       STUDENT MANAGEMENT SYSTEM TEST");
        System.out.println("              COMPLETED SUCCESSFULLY");
        System.out.println("=================================================");
    }

        
    }

        
    

    



