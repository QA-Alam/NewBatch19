package com.usa.smarttech;

public class TestThree { // This is a class
	static int bonus = 2000;
	// If i declare the variable before the method & after the class with the static keyword
	// That is call class level or global variable
	// static variable is access to my whole project any package & any classes 
	// Static method or variable we can call by class name

	int salary;
	// If i declare the variable before the method & after the class
	// That is call instance variable    
	// instance variable we have access within the class any methods	
	
	public static void main(String[] args) { // This is a method
	// If i declare the variable inside the methods
    // That is call local variable
		int salaryNum = 9000;
	// whenever we create the local variable we cannot use outside the methods 		
	}
	
	
	public String imployeeInformationsTwo() {			
		salary = 1000;
		return null;		
	}	
	public String imployeeInformationsthree() {
		salary = 2000;
		return null;
		
	}
}
