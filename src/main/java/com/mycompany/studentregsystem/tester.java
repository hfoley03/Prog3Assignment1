/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregsystem;

/**
 *
 * @author hfole
 */
import org.junit.Assert;
import org.junit.Test;
public class tester {
    public tester(){}
    @Test
        public static void main(String[] args){
            //Testing that .getUsername returns a string concating the student's name and age 
            Student st1 = new Student("Harry", 12345, 22,"2002-01-01");
            Assert.assertEquals("Harry22", st1.getUsername(st1.getName(),st1.getAge()));
            

           
    }
}
