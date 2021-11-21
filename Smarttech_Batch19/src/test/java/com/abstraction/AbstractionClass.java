package com.abstraction;


public abstract class AbstractionClass {

	
    // What is the abstraction in java?
	// Ans: -> abstraction is an in complete class where we can 
	// hiding the implementations & showing the out come
	// We can approach two way 
	// 1 is abstract class & another is interface 
	// Abstract class can contain 0 - 100% abstract method 
	// Interface can contain 100% abstract method 
	
	
	// What is the abstract class?
	// Ans: Abstract class can contain 0 - 100% abstract method
	// Abstract class can contain abstract method as well as concrete/complete method 
	
	
	// What is an interface class?
	// Ans: Interface can contain 100% abstract method 
	
	// How you can give the restrictions then no body can create an object?
	// Ans: Whenever i create at lest one abstract method inside the class then class
	// will be automatically abstract, that means it's a incomplete class,
	// then no body can create the object
	
	
	
	// This is a concrete/complete method 	
	public void getCar() {
		System.out.println("I have nissan murano suv vihicle ");
	}
	
	public void getHouse() {
		// method body
		System.out.println("I have a house in USA ");
	}
	
	// This is abstract method 
	public abstract void getEmployee();
	 	
}

