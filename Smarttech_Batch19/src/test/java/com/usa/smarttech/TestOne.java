package com.usa.smarttech;

public class TestOne {


	// Company requirement is "Find agents"
	
	// You test it now Actual result = "Find agents"
	// In the web-site expected result = "Find agent"
	
	
	// boolean return true or false
	// DL = 1243654374
	// SSN = 123-23-2345
	// address = 6225 69th st
	// Dollar = $5000
	// Dollar = $5000.99

	// Main method we cannot change anything in main method fixed, because
	// JVM understands only main method

	// This is a main method ?
	public static void main(String[] args) {	
		TestOne sadiya = new TestOne();
		sadiya.imployeeInformationsTwo();
		sadiya.getSalaryOne();
		
		//TestOne.getSalary();
		TestOne.imployeeInformations();

		// public is access modifier
		// public is access for all
		// Ans: If before method we have a public access modifier
		// then i can call this method within project anywhere
		// If i have any variable before public access modifier we can call
		// this variable within project anywhere

		// what is the static -> Static is a key word when ever we declare method or
		// variable
		// we have access within project anywhere

		// What is void ? Void is return nothing

		// What is the main - Main method name

// char is a primitive data type
// Char return the values within single '' Any characters
		char chf = '&';
		System.out.println(chf);

		// boolean is a primitive data type
// boolean return true or false 
		boolean returns = false;
		System.out.println(returns);
		//

		// int is a primitive data type
		int wholeNum = 10000000;
		System.out.println(wholeNum);

		// double is a primitive data type
		double desimalNumber = 10000000.99;
		System.out.println(desimalNumber);

		// long is a primitive data type
		long bDollar = 100000000000000L;
		System.out.println(bDollar);

		// Float is a primitive data type
		float dNumbers = 16742374474243788578F;
		System.out.println(dNumbers);

		// String is a non primitive data type as well as it is a class & string can
		// handle anything within double code "@#$%%^^^&^&&&&&*ds43"
		String myName = "Mohammed Alam, $ 1243654374, 123-23-2345,6225 69th st, $5000.99 ";
		System.out.println(myName);

		// Array is non-primitive data type as well as it is an object

		// What is the method -> Method contain block of code where
		// we can write automation logic or business logic

		// How you can create the method

		// Ans: we need minimum require for method creation
		// 1. name of the method 
		// 2. parenthesis (), curly bracket open & curly bracket closed { }
		// 3, method return type based on requirements

	}

	
	// Void return noting 
	// Access modifier, return type, method name, () & { }
	public static void getSalary() {	
		double salary = 100000.98;
		int bonus = 2000;
		int signinbonus = 6000;
		double total;
		total = salary + bonus - signinbonus;
		System.out.println("This my yearly salary : " + total);
	}	
    // Non Void return something  
	// How you call the static method inside the main method 
	// I can call the static method by class in side the main method 
	public static String imployeeInformations() {
		String name = "Maksuma";
		String salary = "$ 8000";
		String SSN = "123-12-1234";
		String address = "123 69th st, NY, 11378";
		String employeeDetails;
		System.out.println(employeeDetails = "This is employee name : "+name+ " Employee salary is : "+ salary +" Employee SSN num is : "+ SSN +"Employee address is : "+ address);
		return employeeDetails;		
	
	}

	
	// Void return noting 
	// Access modifier, return type, method name, () & { }
	public void getSalaryOne() {	
		int salary = 100000;
		int bonus = 2000;
		int signinbonus = 6000;
		int total;
		total = salary + bonus - signinbonus;
		System.out.println("This my yearly salary : " + total);
	}	
    // Non Void return something  
	// How you call the static method inside the main method 
	// I can call the static method by class in side the main method 
	public String imployeeInformationsTwo() {
		String name = "Maksuma";
		String salary = "$ 8000";
		String SSN = "123-12-1234";
		String address = "123 69th st, NY, 11378";
		String employeeDetails;
		System.out.println(employeeDetails = "This is employee name : "+name+ " Employee salary is : "+ salary +" Employee SSN num is : "+ SSN +"Employee address is : "+ address);
		return employeeDetails;		
		
	}
	
	// How you can call static method ?
	// Static method by class name
	
	// How you can call non static method?
	// I have to create the an object then object name . method name
	
	// How to create the object?
	// Ans: className objectName = new classNmae();
	
	
	
	
	
	
}







