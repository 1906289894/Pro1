package com.javaproject;
class people{
  private String name;
  private int age;
  public void people(String name,int age){
	           this.name=name;
	           this.age=age; 
	  }
  
  public String getName() {
		       return name;
	  }
  
  public void setName(String name) {
		       this.name=name;
	  }
  
  public int getAge() {
               return age;
      }
  
  public void setAge(int age) {
              this.age=age;
      }
}
/*class student extends people{
	 
      }*/
class teacher extends people{

	public teacher(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public teacher() {
		// TODO Auto-generated constructor stub
	}
	 
      }

public class project07 {

	public static void main(String[] args) {
		teacher s2=new teacher();
		s2.setName("¡÷«‡œº");
	    s2.setAge(17);
		System.out.println(s2.getName()+"------"+s2.getAge());
		System.out.println("------------------------------");
        teacher s1=new teacher("¡Ù“‚",20);
        System.out.println(s2.getName()+s2.getAge());
	}

}
