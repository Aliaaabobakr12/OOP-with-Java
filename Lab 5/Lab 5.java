/*
* Aliaa Abobakr Elshiekh
* 120210151
* CSE 3
* */

// This program shows private attributes, constructors, methods, and objects in Java. 

import java.util.ArrayList;

public class UniversityCourse {

    private String courseCode, courseName;
    private ArrayList<String> instructors, enrolledStudents, assessments;
    private int maxStudents;

    public UniversityCourse() {
        this.courseCode = "CSE000";
        this.courseName = "Course Name";
        this.maxStudents = 50;
        this.instructors = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
        this.assessments = new ArrayList<>();
    }

    public UniversityCourse(String courseCode, String courseName) {
        this();
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public UniversityCourse(String courseCode, String courseName, ArrayList<String> instructors, int maxStudents) {
        this(courseCode, courseName);
        this.instructors = instructors;
        this.maxStudents = maxStudents;
    }

    public UniversityCourse(String courseCode, String courseName, ArrayList<String> instructors,
                            int maxStudents, ArrayList<String> assessments) {
        this(courseCode, courseName, instructors, maxStudents);
        this.assessments = assessments;
    }

    public void enrollStudent(String studentName) {
        if (enrolledStudents.size() < maxStudents) {
            enrolledStudents.add(studentName);
            System.out.println(studentName + " has been enrolled in the course");
        } else {
            System.out.println("The course is full");
        }
    }

    public void displayCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructors: " + instructors);
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("Assessments: " + assessments);
        System.out.println("Maximum Students: " + maxStudents);
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students:");
        for (String student : enrolledStudents) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        UniversityCourse course1 = new UniversityCourse("CSE313", "Advanced Programming");
        ArrayList<String> instructors = new ArrayList<>();
        instructors.add("Dr. Mohamed Abbassy");
        UniversityCourse course2 = new UniversityCourse("CSE210", "Data Structure", instructors, 45);
        ArrayList<String> assessments = new ArrayList<>();
        assessments.add("Midterm Exam");
        UniversityCourse course3 = new UniversityCourse("CSE111", "Discrete Math", instructors, 32, assessments);

        course1.enrollStudent("Aliaa");
        course1.enrollStudent("Habiba");
        course1.displayEnrolledStudents();
        course1.displayCourseInfo();

        course2.enrollStudent("Shahd");
        course2.enrollStudent("Mohamed");
        course2.displayEnrolledStudents();
        course2.displayCourseInfo();

        course3.enrollStudent("Rezk");
        course3.enrollStudent("Nourseen");
        course3.displayEnrolledStudents();
        course3.displayCourseInfo();
    }
}