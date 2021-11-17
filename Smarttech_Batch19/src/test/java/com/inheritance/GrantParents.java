package com.inheritance;

public class GrantParents {
	
	//Inheritence - bring properties from one class to another
	//Single level -> parent to child 
	//Multi level -> grand parent to parent to child
	//Multiple - Not possible with in heritence concept or class level because of diamond issue
	//Multiple is possible with Interface level with implements key word

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
