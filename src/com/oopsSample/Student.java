package com.oopsSample;

public abstract class Student {
	
	String name;
	String address;
	float gpa;
	
	public Student() {
		
	}
	
//	public Student(String name) {
//		this.name = name;
//	}
	
//	public Student(String name, float gpa) {
//		this.name = name;
//		this.gpa = gpa;
//	}
	
//	public final void calculateGPA() {
//		System.out.println("Calculate GPA");
//	}
	
	public abstract void gotoClass();
}


