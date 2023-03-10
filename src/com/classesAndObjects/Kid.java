package com.classesAndObjects;

public class Kid {
	
		String name;
		int age;
		
		//Parameterized Constructor
		public Kid(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		//Declaring a method
		public void play() {
			System.out.println(this.name + " is playing...");	
	    }
		
		//Example for method overloading
		public void printKid(String name, int age) {
			System.out.println("Name of the kid is :" + this.name +" and age is :" + this.age);
		}
		public void printKid(int studying) {
			System.out.println("Kid is studying in: " + studying);	
		}

}
