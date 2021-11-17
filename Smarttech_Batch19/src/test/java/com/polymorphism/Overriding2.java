package com.polymorphism;

public class Overriding2 extends Overriding1 {
	
	public void getCar() {
		System.out.println("Car name is Tesla");
	}
	
	public void getTower() {
		System.out.println("My tower");
	}
	
	public void getWife() {
		System.out.println("My wife choice name is Akshra");
		
	}
	
	public static void main(String[] args) {
		Overriding2 obj = new Overriding2();
		obj.getProperties();
		obj.getCash();
		obj.getGold();
		obj.getWife();
		obj.getCar();
		obj.getTower();
		
	}

}
