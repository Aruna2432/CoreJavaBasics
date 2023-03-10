package com.trg.basicSamples;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int a=10, b=11;
		System.out.println("a is " + a + " and b is " + b);    
		
		//Comparing values 
	    System.out.println(a == b);  
	    System.out.println(a != b); 
	    System.out.println(a > b);  
	    System.out.println(a < b);  
	    System.out.println(a >= b); 
	    System.out.println(a <= b); 
	    
	    //And operator
	    System.out.println((15 > 3) && (2 > 5)); 
	    System.out.println((5 > 3) && (8 < 5)); 
	    System.out.println((5 < 3) & (8 < 5)); 
	    
	    //Or operator
	    System.out.println((5 < 3) || (8 > 5));  
	    System.out.println((5 < 3) || (8 < 5));  
	    System.out.println((5 > 3) | (8 < 5));
	    
	    //Not Operator
	    System.out.println(!(5 == 3));  
	    System.out.println(!(5 > 3));
	}

}
