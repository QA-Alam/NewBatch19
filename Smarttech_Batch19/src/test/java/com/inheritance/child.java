package com.inheritance;

public class child extends Parents{
	
	
	public void getBusiness() {
		System.out.println("I have more $ ");
		
	}
	public static void main(String[] args) {
		child obj = new child();
		obj.getBusiness();
		obj.getPropery();
		Parents.getHouse();
		
		
		
		
}
}