package com.obsqura.learningjava.inheritance;

public class Dog extends Animal {//subclass
	int age = 34;
	public void bark() {
		System.out.println("barking");
	}
	public void eat() {
		//method overriding means using same method name and same datatype for 2 diff class. 
		//using super keyword to reference the parent class object
		//super keyword is used to call instance method,instance variable,parent class and constructor of par
		System.out.println(super.age);
		super.eat();
		System.out.println("Eating");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.eat();
		d.bark();
		d.sleep();
		System.out.println(d.age);

	}

}
