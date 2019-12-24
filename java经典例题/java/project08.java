package com.javaproject;
class animal{
	public void eat() {
		System.out.println("≥‘∑π");
	}
	
}
class Dog extends animal{
	public void eat() {
		
		System.out.println("π∑ª·≥‘∑π");
	}
	public void kanmeng() {
		System.out.println("π∑ª·ø¥√≈");
	}
}
class Cat extends animal{
	public void eat() {
		
		System.out.println("√®ª·≥‘∑π");
	}
	public void kanmeng() {
		System.out.println("√®ª·◊Ω¿œ Û");
	}
}
public class project08 {
	public static void main(String[] args) {
		 animal f=new Dog();
		 
		 Dog s=(Dog)f;
		 s.eat();
		 s.kanmeng();
		 f=new Cat();
		 Cat c=(Cat)f;
		 c.eat();
		 c.kanmeng();
	}
  
	
}
