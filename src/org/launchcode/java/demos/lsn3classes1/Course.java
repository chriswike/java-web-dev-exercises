package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String instructor;
    private String courseName;
    private int offeredCredits;
//    private ArrayList<Student> studentList;

    public Course(String instructor, String courseName, int offeredCredits) {
        this.instructor = instructor;
        this.courseName = courseName;
        this.offeredCredits = offeredCredits;
//        this.studentList = studentList;
    }

    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String aSetInstructor) {
        instructor = aSetInstructor;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String aSetCourseName) {
        courseName = aSetCourseName;
    }
}
