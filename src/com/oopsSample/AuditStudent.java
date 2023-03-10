package com.oopsSample;

public class AuditStudent extends Student{
	
	String classLoc;
	public AuditStudent(String name, String classLoc) {
		this.name = name;
		this.classLoc = classLoc;
	}
	
	public void gotoClass() {
		System.out.println("Audit students go to Auditorium1..." + this.name);
	}
	
	public String toString() {
		String strobj = "AuditStudent : " + this.name;
		return strobj;
	}

}
