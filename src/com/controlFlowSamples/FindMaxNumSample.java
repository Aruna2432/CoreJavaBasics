package com.controlFlowSamples;

import java.util.Scanner;

public class FindMaxNumSample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = input.nextInt();
		System.out.println("Enter second number : ");
		int b = input.nextInt();
		System.out.println("Enter third number : ");
		int c = input.nextInt();
		if((a>b)&& (a>c))
				System.out.println("Max number is : " + a);
		else if((b>a)&&(b>c))
				System.out.println("Max number is : "+ b);
		else
			System.out.println("Max number is : "+ c);
		input.close();
		

	}

}
