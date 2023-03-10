package com.controlFlowSamples;

import java.util.Scanner;

public class LargestNumArraySample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size = input.nextInt();
		int array[] = new int[size];
		int max = array[0];
		System.out.println("Enter the elements of the array : ");
		for(int i=0; i<size; i++){
			array[i] = input.nextInt();
		}
		for(int i=0; i<size; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
        System.out.println("Largest element in the array is : " + max);
        input.close();
	}

}
