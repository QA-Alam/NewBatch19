package com.inheritance;

public class GrantParents {

	public void getPropery() {
		int cash = 100000;
		String property = "Land";
		System.out.println("Parante Properties : "+cash +" Land "+ property );
	}
	
	// How you call one method inside anther method 
	
	
	// If void method i have to create object then i can call by object dot method name 
	// Id static method i can call by class name 
	public static void main(String[] args) {
		GrantParents obj = new GrantParents();
		obj.getPropery();
	}
	
}
