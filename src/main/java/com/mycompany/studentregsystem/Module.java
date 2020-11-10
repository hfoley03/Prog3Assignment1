package com.mycompany.studentregsystem;

import java.util.ArrayList;

/**
 *
 * @author hfole
 */
public class Module {
    private String mName;
    private String id;
    static ArrayList<Course> courseList = new ArrayList<Course>(); //array list of course type
    static ArrayList<Student> mStudentList = new ArrayList<Student>(); //array list of course type

    public Module(String mName, String id){
        this.mName = mName;
        this.id = id;
    }
    public String getName(){
        return mName;
    } 
    public String getId(){
        return id;
    }
    public void addStudent(Student s){
       mStudentList.add(s);
   }
    public void addCourse(Course c){
        courseList.add(c);
    }
   public void printStudents(){
       System.out.println("Students in this Module: ");
       for(Student stud : mStudentList) {
            System.out.println(stud.getName());
        }
   }
      public void printCourse(){
       System.out.println("Courses this module is accosiated with: ");
       for(Course c : courseList) {
            System.out.println(c.getName());
        }
   }
}
