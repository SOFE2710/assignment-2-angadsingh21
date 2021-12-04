package com.company;
import java.util.Vector;

public class Course {
    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private  Vector <Student>classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title) {
        this.code=code;
        this.number=number;
        this.dept=dept;
        this.title=title;
        this.classList=new Vector<Student>();
    }

    public void addStudentToCourse(Student student) {
        this.classList.add(student);
    }

    //to return students registered in a course
    public Vector<Student> getClassList() {
        return this.classList;
    }

    //to return course number
    public int getNumber(){
        return this.number;
    }

    public Course() {
        // TODO Auto-generated constructor stub
    }

    public String toString() {
        String str = this.code + " " + this.number + " " + this.title + ", Enrollment = " + this.classList.size();
        return str;
    }
}
