package com.company;
import java.util.Vector;

public class Student extends Person{
    private String id;
    private String name;
    private Vector courses; // contains all courses the student is registered in


    //constructor
    public Student(String stdName, String stdId) {
        this.name=stdName;
        this.id=stdId;
        this.courses=new Vector<Course>();
    }


    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public void registerFor(Course course){
        this.courses.add(course);
    }

    public boolean isRegisteredInCourse(Course course){
        return this.courses.contains(course);
    }


    public String toString() {
        String str=getId()+" "+getName();
        return str;
    }
}
