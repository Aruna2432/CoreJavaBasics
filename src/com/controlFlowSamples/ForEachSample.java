package com.controlFlowSamples;

public class ForEachSample {

	public static void main(String[] args) {
		int[] numbers = {3, 4, 5, 6, 7};
		int sum = 0;
		for(int number: numbers) {
			sum+=number;
		}
		System.out.println("Sum = " + sum);
	}
}
