package com.classesAndObjects;

public class StringSample {

	public static void main(String[] args) {
		
		//Declaring and initializing a string
		String strOne = "Java";
		String strTwo = new String("Functional");
		System.out.println("strOne is... " + strOne);
		System.out.println("strTwo is... " + strTwo);
		
		//Comparing two strings
		String strThree = "Functional";
		String strFour = new String("Java");
		boolean result1 = strOne.equals(strTwo);
		boolean result2 = strOne.equals(strFour);
		boolean result3 = strTwo.equals(strThree);
		System.out.println("Result of strOne equals strTwo is..." + result1);
		System.out.println("Result of strOne equals strFour is..." + result2);
		System.out.println("Result of strTwo equals strThree is..." + result3);
		
		//Reference values
		System.out.println("Value of strOne is..." + strOne.hashCode());
		System.out.println("Value of strTwo is..." + strTwo.hashCode());
		
		//Concatenation
		strOne = strOne+ " Programming";
		strTwo = strTwo.concat(" Programming");
		System.out.println("After concatination, strOne is..." + strOne);
		System.out.println("After concatination, strTwo is..." + strTwo);
		System.out.println("After modifying, Value of strOne is..." + strOne.hashCode());
		System.out.println("After modifying, Value of strTwo is..." + strTwo.hashCode());
		
		//Length of string
		System.out.println("Length of strOne is..."+strOne.length());	
		
		String str1 = "Java Language and Java Programming Language";
		String str2 = " Programming Language ";
		System.out.println("str1 is : " + str1);
		System.out.println("str2 is : " + str2);
		
		//Getting Index
		System.out.println("Index of L in str1 is : " + str1.indexOf("L"));
		
		//Compares given string
		String str3 = "Java Programming";
		String str4 = "Java Language";
		System.out.println(str3.compareTo(str4));
		
		//Converting to upper case
		System.out.println("Uppercase : " + str1.toUpperCase());
		
		//Converting to lower case
		System.out.println("Lowercase : " + str2.toLowerCase());
		
		//To replace a character
		System.out.println(str1.replace('J', 'L'));
		
		//Returns specified character at the given index
		System.out.println("Character at Index 7 is : " + str2.charAt(7));
		
		System.out.println(str1.substring(5));
		System.out.println(str2.trim());
		System.out.println(str1.replaceFirst("Java", "C"));
	}

}
