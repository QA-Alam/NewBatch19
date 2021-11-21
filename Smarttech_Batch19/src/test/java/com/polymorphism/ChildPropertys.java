package com.polymorphism;

public class ChildPropertys extends MethodOverWrriding {

	public void getCar() {
		System.out.println("I have BMW car ");
	}

	public void getBusiness() {
		System.out.println("I have my won business ");
	}

	public void getWife() {
		System.out.println("I love karina kapor & she is my wife ");

		// I am accepting my father conditions
	} 

	public static void main(String[] args) {
		ChildPropertys obj = new ChildPropertys();

		// This is a parent class property
		obj.getProperty();
		obj.getGold();
		obj.getWife(); // This my parent class condition
		obj.getCash();

		// This a child class property

		obj.getBusiness();
		obj.getCar();

	}
}
