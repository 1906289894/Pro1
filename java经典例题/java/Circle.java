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
			System.out.println("长为："+this.i+"   宽为："+this.j+"   ==>这是正方形");
		}
		else  
			System.out.println("长为："+this.i+"   宽为："+this.j+"   ==>这不是正方形");
	}
	public void Diagonal()
	{
		if(k*k==i*i+j*j)
		{
			System.out.println("斜线k是此图形的对角线");
		}
		else
			 System.out.println("斜线k不是图形的对角线");
	}
     
}
