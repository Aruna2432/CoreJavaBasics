package com.oopsSample;

import java.util.ArrayList;

public class StudentDriver {

	public static void main(String[] args) {
		
//		Student s1 = new Student("Peter");
		
//		Student s1 = new PayingStudent("Peter", 8.7f);
//		s1.gotoClass();
//		Student s2 = new CompanyStudent("John", "Zuci");
//		s2.gotoClass();
		
//		Student s1 = new PayingStudent("Peter", 8.7f);
//		Student s3 = new PayingStudent("Vicky", 9.5f);
		Student s2 = new CompanyStudent("Pinky", "Zuci");
		Student s5 = new CompanyStudent("Wicky", "Zuci");
		Student s4 = new AuditStudent("John", "Auditorium1");
		Student s6 = new AuditStudent("Jessy", "Auditorium1");
		StudentList students = new StudentList();
//		students.addStudent(s1);
		students.addStudent(s2);
//		students.addStudent(s3);
		students.addStudent(s4);
		students.addStudent(s5);
		students.addStudent(s6);
		
		//System.out.println("Object of s5...." + s5.toString());
		
		ArrayList<Student> studs = students.getStudents();
		for(Student stud: studs) {
			//stud.calculateGPA();
			stud.gotoClass();
		}	
	}
}
