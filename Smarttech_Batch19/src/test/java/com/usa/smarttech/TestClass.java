package com.usa.smarttech;

public class TestClass {

  static String name;
   int salary;
  
	// If i declare the variable before the method & after the class
	// That is call instance variable    
	// instance variable we have access within the class any methods	
	

  
  // Non static method can handle static variable & non static variable
   
   
   
	public void getEmployees() {
		name = "Sadiya";
		salary = 6500;
	}
	
	public void getEmployees2() {
		name = "Belal";
		salary = 6500;
	}
	
	public void getEmployees3() {
		name = "Alam";
		salary = 6600;
	}
	
	// Static method can handle only static variable 
	public static void getEmployees4() {
		name = "Alam";
		 // salary = 6700; // This on instance variable
	}

}
