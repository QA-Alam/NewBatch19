package com.abstraction;

public class AbstractSubClass extends AbstractionClass {

	
	// This method from abstract class we have to complete this method by using 
	// extending the parent class the it will be complete method & we can 
	// write the logic 
	
	@Override
	public void getEmployee() {
		// wee can write the coding or logic 
		System.out.println("I am abstract class meethod ");

	}
	public static void main(String[] args) {
		AbstractSubClass obj = new AbstractSubClass();
		obj.getEmployee();
		obj.getCar();
		obj.getHouse();
		
		
	}

}
