package com.javaproject;
class animal{
	public void eat() {
		System.out.println("�Է�");
	}
	
}
class Dog extends animal{
	public void eat() {
		
		System.out.println("����Է�");
	}
	public void kanmeng() {
		System.out.println("���ῴ��");
	}
}
class Cat extends animal{
	public void eat() {
		
		System.out.println("è��Է�");
	}
	public void kanmeng() {
		System.out.println("è��׽����");
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
