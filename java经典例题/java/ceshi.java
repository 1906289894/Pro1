package com.javaproject;

 class circle{
	
	public double pi=3.14;//����Բ���ʵĽ���ֵ
	private double  radius;
	public void setRadius(double radius){
          this.radius=radius;
	}
	public double getRadius(){
		 return radius;
	}
	public double  Area(){
         return (int) (pi*radius*radius);
	}
	public double Airth(){
  	  	return (int)(pi*2*radius);
	}
}
 class cir extends circle{

	
	
}
public class ceshi{
	 public static void main(String[] args) {
		cir ch=new cir();
		ch.setRadius(5.4);
		System.out.println("�����:"+ch.Area());
		System.out.println("�ܳ��ǣ�"+ch.Airth());

	}
}