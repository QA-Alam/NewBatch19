package com.polymorphism;

public class overloading {

	// What is the ploymorephism?

	// ploymorephism means multistructure
	// ploy means many & phism means structure
	// Same person can change the behavior

	// We can approach two way
	// 1 is method overloading & another is method overriding
	// Static binding overloading Dynamic overriding
	// Compile time overloading Run time overriding

	// How you can implements method overloading?
	// Ans: overloading means we can use same method again & again
	// by changing parameters

	// How you change the parameters?
	// By data types & also we have to change the location of the parameters

	// However, method overloading we have to finish within the class

	public void getStudents(int a) {
		System.out.println(a);

	}

	public void getStudents(int a, int b) {
		System.out.println(a + b);
	}

	public void getStudents(int a, double b) {
		System.out.println(a * b);
	}

	public void getStudents(double b, int a) {

		System.out.println(a / b);
	}

	public static void main(String[] args) {
		overloading obj = new overloading();
		obj.getStudents(100);
		obj.getStudents(100, 50);
		obj.getStudents(100, 100);
		obj.getStudents(300, 100);

	}

}
