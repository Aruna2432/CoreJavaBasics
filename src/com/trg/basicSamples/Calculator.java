package com.trg.basicSamples;

public class Calculator {
	
	//instance variable
	int number;
	
	//class variable
	static int c;
	
	//Example for final keyword usage
	final double pi = 3.14;
	public void area(int radius)
    {
		double area = pi*radius*radius;
		System.out.println("Area is..." + area);
	}
	
	//a and b are parameters
	public void add(int a, int b) 
	{
		//local variable
		int sum;
		sum = a+b;
		System.out.println("Sum is..." + sum);
	}
	
    //Driver class
	public static void main(String[] args) {
		Calculator calObj = new Calculator();
		calObj.add(10, 25);
		calObj.area(2);
		c = 15;
		System.out.println(c);
	}

}
