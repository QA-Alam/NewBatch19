package com.inheritance;

public class Parents extends GrantParents{
	
	
	public void getCar() {
		System.out.println("I have nissan murano suv vihicle ");
	}
	
	public static void getHouse() {
		System.out.println("I have a house in USA ");
	}

	
	public static void main(String[] args) {
		Parents obj = new Parents();
		obj.getCar();
		Parents.getHouse();
		obj.getPropery();
	}
}
