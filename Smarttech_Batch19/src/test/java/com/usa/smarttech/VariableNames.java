package com.usa.smarttech;

public class VariableNames {
	
	//Where do you have access to instance variable?
	//Ans: Access within class and any method
	String name; //Instance variable
	
	//Where do you have access to static variable?
	//When we declare the class variable and call anywhere within project, any class, any package, any method 
	//by class name. We don't need to create the object
	static int age; //global or class level variable
	
	
	public void getStudent() {
		//Where do you have access to local variable?
		//Access only within the method.
		int salary = 100000; //local variable
		name = "Mohammed";
		
	}
	
	public void method1() {	

		name = "Mir";
		
		
	}

	public void method2() {
	
		name = "Alam";
	
	}

}
