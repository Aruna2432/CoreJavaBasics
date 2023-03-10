package com.classesAndObjects;

public class KidDriver {

	public static void main(String[] args) {
		
		//Instantiating object in default constructor
		//Kid kidOne = new Kid();
		//kidOne.play();
		
		//Instantiating objects in the parameterized constructor
		//Kid kidOne = new Kid("Pinky", 6);
		//kidOne.play();
		//Kid kidTwo = new Kid("Wicky", 7);
		//System.out.println(kidTwo.name);
		//kidTwo.play();
		
		//Encapsulation - Driver class
		EncapsulatedKid kidOne = new EncapsulatedKid();
		kidOne.setName("Pinky");
		kidOne.play();
		
	}

}
