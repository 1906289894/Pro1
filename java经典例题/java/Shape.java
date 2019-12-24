package com.oo.test;
public class Shape
{
	private Point location; //图形的位置坐标
	public Shape(Point location)
	{
		this.location = location;
	}
	public Shape(double x,double y)
	{
		this(new Point(x,y));
	}
	public Point getLocation()
	{
		return location;
	}
	public void setLocation(Point location)
	{
		this.location = location;
	}
	//求图形面积
	public double getArea()
	{
		return 0;//模拟返回值
	}
	//求图形的周长
	public double getLength()
	{
		return 0;//模拟返回值
	}
	//打印图形的位置坐标
	public void printLocation()
	{
		System.out.println("当前图形的位置在("+location.getX()+","+location.getY()+")");
	}
}