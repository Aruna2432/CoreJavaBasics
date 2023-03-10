package com.classesAndObjects;

public class ArraySample {

	public static void main(String[] args) {
		
		//Declare and initialize array and variables
		String[] array = new String[7];
		array[0] = "AB";
		array[1] = "CD";
		array[2] = "EF";
		array[3] = "GH";
		array[4] = "IJ";
		array[5] = "KL";
		array[6] = "MN";
		
		int[] marks = {56, 78, 99, 100};
		int sum=0;
		
		//Finding sum
		for(int number: marks) {
			sum+= number;
		}
		
	    //Finding length of the array
		int Length = marks.length;
		System.out.println("Length of the array : " + Length);
		
		//Calculating Average
		double average = ((double)sum / (double)Length);
		System.out.println("Sum of elements in the array : " + sum);
		System.out.println("Average of the elements in the array : " + average);
		
	}

}
