package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student("Chris", 90201, 1, 4.0);
        Course newCourse = new Course("Mrs Crabapple", "Scicene", 5);

        System.out.println("Name: " + newStudent.getName());
        System.out.println("Student ID: " + newStudent.getStudentId());
        System.out.println("Number of Credits: " + newStudent.getNumberOfCredits());
        System.out.println("GPA: " + newStudent.getGpa());
        System.out.println("Instrctor: " + newCourse.getInstructor());
    }
}

