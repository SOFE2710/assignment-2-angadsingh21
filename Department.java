package com.company;
import java.util.Vector;

public class Department {
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.

    //constructor
    public Department(String name, String id) {
        this.name = name;
        this.id = id;
        this.courseList = new Vector<Course>();
        this.registerList = new Vector<Student>();
    }
    // to return courses
    public Vector<Course> getCourseList() {
        return this.courseList;
    }

    //to return students in course
    private Vector<Student> studentsRegisteredInCourse(int code){
        boolean x=false;
        Vector<Student>students=new Vector<Student>();
        for (int i=0;i<courseList.size();i++){
            if (code==(courseList.elementAt(i)).getNumber()){
                students=(courseList.elementAt(i)).getClassList();
                x=true;
                break;
            }
        }

        if (x){
        return students;
        }

        else {
            return null;
        }
    }

    //print students in course
    public void printStudentsRegisteredInCourse(int code){
        Vector<Student>students2=studentsRegisteredInCourse(code);
        for (int i=0;i<students2.size();i++){
            System.out.println(students2.elementAt(i));
        }
    }

    //find and return course with most students
    public Course largestCourse()
    {
        int x = -1, y = -1, max = -1;

        for(int i= 0; i < courseList.size(); i++)
        {
            x = (courseList.elementAt(i)).getClassList().size();
            if(x>max)
            {
                max = x;
                y = i;
            }
        }
        return courseList.elementAt(y);
    }

    //func to register course with department
    public void registerStudentCourseInDepartment(Student student, Course course) {
        this.courseList.add(course);
        this.registerList.add(student);
    }

    //func to display courses on offer
    public void printCoursesOffered(){
        System.out.println("These are the courses offered: ");
        for(int i = 0; i < courseList.size(); i++)
            System.out.println((i+1) + ") " + courseList.elementAt(i));
    }

    //for printing student names
    public void printStudentsByName(){
        System.out.println("Student registered in this department are: ");
        for(int i = 0; i < registerList.size(); i++)
            System.out.println((i+1) + ") " + registerList.elementAt(i));
    }

    //check if student registered
    public boolean isStudentRegistered(Student student) {
        return this.registerList.contains(student);
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }


    public String toString() {
        String str2=this.id+" "+this.courseList.size()+" "+"courses"+" ,"+this.registerList.size()+" "+"students";
        return str2;
    }
}
