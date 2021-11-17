package com.usa.smarttech;

public class MethodNames {
	
	//signature- method name, parenthesis curly bracket open and close
	//void method- returns nothing
	public void getSalary() {
		System.out.println("This is a void method");
	}
	
	//static - one of the java keyword where we declare as method or variable level.
	//We don't need to create any object. We can call by class name. We can not over write this
	//method or variable
	public static void getName() {
		System.out.println("This is a Static method");
	}
	
	//return method or non-void method- returns something
	//String default value is null
	String getStudent() {
		System.out.println("This is a return method");
		return "SmartTech Student";
		
	}
	
	//Parameter method- declare inside paranthesis
	String getChampion(int num) {
		System.out.println("This is a parameter method");
		return "SmartTech Student";
	}
	

}
