package com.codemind.b11;

public class AbstactClassExample {
void show() {
System.out.println("Imported in subpackages");
}
	public static void main(String[] args) {
		MyClass m = new MyClass();
		System.out.println(m.add());
		m.sub();
		AbstactClassExample a= new AbstactClassExample();
		a.show();
	}

}
abstract class Vehicle_1 {

	public Vehicle_1() {
		System.out.println("Parent class Default constructor");
	}

	int a = 10;

	public static final int b = 10;

	public abstract int add();

	public void sub() {
		System.out.println("non abstract method from Vehicle_1");
	}

}

class MyClass extends Vehicle_1 {

	public MyClass() {
		System.out.println("Child class default constructor");
	}

	public int add() {
		return 10;
	}

}
