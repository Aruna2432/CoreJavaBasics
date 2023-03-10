package com.oopsSample;

public abstract class PayingStudent extends Student implements PrintStudent{
	
	boolean madePayment;
	public PayingStudent(String name,float gpa)
	{
		super();
		this.name = name;
		this.gpa = gpa;
	}
	 
	public void gotoClass() {
		System.out.println("Paying Student go to next class... " + this.name);
	}
	
	public abstract void PrintMarksheet();
	
	public String toString() {
		String strobj = "PayingStudent : " + this.name;
		return strobj;
	}

}
