package com.controlFlowSamples;

public class IfElseSample {

	public static void main(String[] args) {
		
		int testscore = 100;
		char grade;
		if(testscore>=90) {
			grade = 'A';
		}else if(testscore>=80) {
			grade = 'B';
		}else if(testscore>=70) {
			grade = 'C';
		}else if(testscore>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
	}
}
