package com.CollectionsSample;
import java.util.ArrayList;
import com.oopsSample.*;


public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList<Student> Students = new ArrayList<>();
		Student s1 = new AuditStudent("Peter","Auditorium");
		Student s2 = new CompanyStudent("John","Zuci");
		Student s3 = new AuditStudent("Jessy","Auditorium");
		Student s4 = new CompanyStudent("Vicky","Zuci");
		Student s5 = new AuditStudent("Wicky","Auditorium");
		Student s6 = new CompanyStudent("Peter","Zuci");
        Students.add(s1);
        Students.add(s2);
        Students.add(s3);
        Students.add(s4);
        Students.add(s5);
        Students.add(s6);
        Students.remove(s2);
        System.out.println("ArrayList of Stuents is : " + Students);	
	}

}
