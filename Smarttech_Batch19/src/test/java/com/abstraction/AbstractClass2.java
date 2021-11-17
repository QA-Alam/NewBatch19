package com.abstraction;

public class AbstractClass2 extends AbstractClass {

	
	public void getSalary() {
		System.out.println("I am abstract class method");
		
	}

	
	public void getHouse() {
		System.out.println("I am also abstract class method");
		
	}
	
	public static void main(String[] args) {
		AbstractClass2 obj = new AbstractClass2();
		obj.getSalary();
		obj.getHouse();
		obj.getCar();
		obj.getTower();
		
	}
	
	

}
