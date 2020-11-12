package com.mycompany.studentregsystem;

/**
 *
 * @author hfole
 */

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
    private String cName;
    private ArrayList<Module> moduleList = new ArrayList<Module>();
    private ArrayList<Student> studentList = new ArrayList<Student>(); 
    private LocalDate startDate;
    private LocalDate endDate;
    
 
    public Course(String cName, String start, String end){
        this.cName = cName;
        startDate = new LocalDate(start);
        endDate = new LocalDate(end);
    }
    
    public void setName(String cName){
        this.cName = cName;
        

        
    }
    public String getName(){
        return cName;
    }
   public void addModule(Module m){
       moduleList.add(m);
   }
   public void printModules(){
       System.out.println("Modules in this Course: ");
       for(Module mod : moduleList) {
            System.out.println(mod.getName() +" "+ mod.getId() + "\n" + mod.getStudents());
        }
   }
   public LocalDate getStart(){
       return startDate;
   }
   public LocalDate getEnd(){
       return endDate;
   }
   public void addStudent(Student s){
       studentList.add(s);
   }
   
   public void printStudents(){
       System.out.println("Students in this Course: ");
       for(Student stud : studentList) {
            System.out.println("~" + stud.getName() +"  " + stud.retrunUsername());
        }
   }
   
   public void courseInfo(Course c){
   System.out.println("Course Name: " + c.getName());
   System.out.println("Start Date: " + getStart());
   System.out.println("End Date: " + getEnd());
   System.out.println("\n");
   c.printStudents();
   System.out.println("\n");
   c.printModules();
      
   }
   
    }
    

