package com.trg.basicSamples;

import java.util.Scanner;

public class ConsoleIn {

	public static void main(String[] args) {
		
		//Using Scanner class to get input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int a = input.nextInt();
		System.out.println("you entered: " + a);
		
		System.out.println("Enter a float: ");
		float b = input.nextFloat();
		System.out.println("you entered: " + b);
		
		System.out.println("Enter a double: ");
		double c = input.nextDouble();
		System.out.println("you entered: " + c);
		
		System.out.println("Enter a string: ");
		String d = input.next();
		System.out.println("you entered: " + d);
		
		input.close();
	}
}
