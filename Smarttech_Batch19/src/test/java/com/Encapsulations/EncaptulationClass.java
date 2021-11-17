package com.Encapsulations;

public class EncaptulationClass {
	
	private String name = "Automation Engineer";
	private int salary = 100000;
	

	
	private String getName() {
		return name;
	}
	
	private int getSalary() {
		return salary;
	}
	
	
	
	public static void main(String[] args) {
		EncaptulationClass obj = new EncaptulationClass();
		System.out.println("Employee name is : "+obj.getName());
		System.out.println("Employees salary is :"+obj.getSalary());
	}
	


	
		

}
