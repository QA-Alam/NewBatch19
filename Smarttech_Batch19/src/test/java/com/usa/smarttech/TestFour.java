package com.usa.smarttech;

public class TestFour {

	
	public void getEmployees() {
		System.out.println(TestClass.name = "Sadiya");
	}
	
	public void getEmployees2() {
		System.out.println(TestClass.name = "Belal");
		
	}
	
	public static void getEmployees3() {
		System.out.println(TestClass.name = "Alam");
	}
	
	
	public static void main(String[] args) {
		// How you can can call non-static method inside other method 
		// Ans: I have to create an object 
		
		
		// How you create the object? 
		// By Class name like ClassName objectName = new ClassName();
		
		
		// How you can can call static method inside other method 
		// By class name
		TestFour.getEmployees3();
		
		
		// How java knows you create an object?
		// By New key word 
		
		TestFour obj = new TestFour();
		obj.getEmployees();
		obj.getEmployees2();
			

		
		
	}
}
