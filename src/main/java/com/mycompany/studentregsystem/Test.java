package com.mycompany.studentregsystem;
/**
 *
 * @author hfole
 */
public class Test {

	public Test() {}
	
	public static void main(String[] args) {	

				
	Student s1 = new Student("Harry", 12345, 22,"2002-01-01");
        Student s2 = new Student("Barry", 45678, 44, "1991-08-08");
        Student s3 = new Student("Larry", 99966, 21, "2002-01-01");
        s1.printInfo();
        Module m1 = new Module("Programming 111","ct101");
        m1.addStudent(s1);
        m1.addStudent(s2);
        Module m2 = new Module("Applied Synthesis","ct202");
        m2.addStudent(s3);
        m2.addStudent(s2);
        Module m3 = new Module("Introduction to Big Beat Manifesto","AB212");
        m3.addStudent(s1);
        m3.addStudent(s2);
        m3.addStudent(s3);
        Course c1 = new Course("ece", "2020-06-09", "2020-08-09");
        c1.getStart();
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addModule(m1);
        c1.addModule(m2);
        c1.addModule(m3);
        c1.courseInfo(c1);
        
        
        

		
	}

}


