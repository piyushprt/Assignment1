package com.company.oops;


class Rabbit {
	String name;
	int numberOfLegs = 4;
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void walk() {
		System.out.println(name + " is walking");
	}
}

public class Animal {

	public static void main(String[] args) {
		Rabbit r1 = new Rabbit();
		
		r1.name = "Jack";
		System.out.println(r1.name);
		
		r1.eat();
		r1.walk();
	}

}
