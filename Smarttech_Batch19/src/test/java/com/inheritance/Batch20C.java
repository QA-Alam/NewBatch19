package com.inheritance;

public class Batch20C implements Batch20A, Batch20B {

	public void getName() {
		String name = "Mohammed Alam";
		System.out.println("My name is : "+name);
	}

	public void getSalary() {
		int age = 100;
		System.out.println("My Age is : "+age);
	}

	public static void main(String[] args) {
		Batch20C obj = new Batch20C();
		obj.getSalary();
		obj.getName();
	}


}
