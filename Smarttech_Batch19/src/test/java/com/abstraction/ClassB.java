package com.abstraction;

public interface ClassB {

	// Java after 1.8 version interface can handle concrete/complete method too 
	// Help with default keyword 
	
	
	public void getEmployee2();

	public void getEmployee3();
	
	default void getHouse() {
		// method body
		System.out.println("I have a house in USA ");
	}
	
}
