package com.polymorphism;

public class Overriding1 {
	
	public void getProperties() {
	System.out.println("Parents have lot of properties");	
	}

	public void getCash() {
		System.out.println("Parents have lot of cash");
		
	}
	
	public void getGold() {
		System.out.println("Parents have some gold");
	}
	
	public void getWife() {
		System.out.println("Parents choice for me wife name is Pooja");
		
	}
	
	public static void main(String[] args) {
		Overriding1 obj = new Overriding1();
		obj.getProperties();
		obj.getCash();
		obj.getGold();
		obj.getWife();
		
	}
	
}
