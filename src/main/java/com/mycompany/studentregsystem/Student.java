package com.mycompany.studentregsystem;

import org.joda.time.LocalDate;

public class Student {
    private String name;
    private int age;
    private int id;
    private String username;
    private LocalDate dob;
    
    public Student(String name, int id, int age, String tempDob){
        this.name = name;
        this.id = id;
        this.age = age;
        dob = new LocalDate(tempDob);
        

        username = getUsername(name, age);
        
        
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getUsername(String name, int age){
        username = name + age;
        return username;
    }
    
    public String retrunUsername(){
        return username;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public LocalDate getDob(){
        return dob;
    }
    public void printInfo(){
        System.out.println("Name: " + getName() + "\nUsername: " + retrunUsername() 
                            + "\nID: " + getId() + "\nAge: " + getAge() + "\nDOB: " + getDob()  );
    }
    }
    


