package com.oo.test;
public class Circle extends Shape {
	double i,j,k;	
	public Circle(Point p,double i,double j,double k)
	{
		super(p);
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public void Square() 
	{
		if(i==j) 
		{
			System.out.println("��Ϊ��"+this.i+"   ��Ϊ��"+this.j+"   ==>����������");
		}
		else  
			System.out.println("��Ϊ��"+this.i+"   ��Ϊ��"+this.j+"   ==>�ⲻ��������");
	}
	public void Diagonal()
	{
		if(k*k==i*i+j*j)
		{
			System.out.println("б��k�Ǵ�ͼ�εĶԽ���");
		}
		else
			 System.out.println("б��k����ͼ�εĶԽ���");
	}
     
}
