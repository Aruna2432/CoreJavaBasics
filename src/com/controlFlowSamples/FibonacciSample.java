package com.controlFlowSamples;

import java.util.Scanner;

public class FibonacciSample {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = input.nextInt();
		System.out.println("Fibonacci series : ");
		for(int i=0; i<=n; i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
		input.close();
	}

}
