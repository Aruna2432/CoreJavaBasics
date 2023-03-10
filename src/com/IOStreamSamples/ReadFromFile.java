package com.IOStreamSamples;

import java.io.FileReader;

public class ReadFromFile {

	public static void main(String[] args) {

		char[] arr =new char[100];
		try {
			FileReader input=new FileReader("C:\\Users\\TEN\\Desktop\\input.txt");
			input.read(arr);
			System.out.println("Data in the file : ");
			System.out.println(arr);
			input.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
			System.out.println(e.toString());
		}
	}

}



