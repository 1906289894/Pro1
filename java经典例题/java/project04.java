package com.javaproject;

public class project04 {
	
	public static void main(String[] args) {
		
	new set().sss(new student()); 
      studento1 s=new studento1();
      s.set("��ɫ");
      System.out.println(s.get());
	}


}
class student{
	public void get(){
		System.out.println("����һ��ѧ��");
	}
}	
class set{
	public void sss(student s) {
		s.get();
	}
}
class studento1{
	private String color;
	public String get() {
		return color;
	}
	public void set(String color) {
		this.color=color;
	}
}
