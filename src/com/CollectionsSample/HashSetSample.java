package com.CollectionsSample;
import java.util.*;

public class HashSetSample {

	public static void main(String[] args) {
	
		HashSet<Integer> evenNumbers= new HashSet<>();
		evenNumbers.add(4);
		evenNumbers.add(2);
		evenNumbers.add(8);
		evenNumbers.add(6);
		evenNumbers.add(8);
		System.out.println("HashSet is : " + evenNumbers);
		
		Iterator<Integer> iterate=evenNumbers.iterator();
		System.out.println("Hashset using iterator : ");
		while(iterate.hasNext())
		{
			System.out.print(iterate.next());
			System.out.print(",");
			
		}
		System.out.println();
		TreeSet <String> emplist=new TreeSet<>();
		emplist.add("John");
		emplist.add("Andrew");
		emplist.add("Peter");
		System.out.println(emplist);
		

	}

}

