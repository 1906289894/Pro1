package com.oo.test;
public class Shape
{
	private Point location; //ͼ�ε�λ������
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
	//��ͼ�����
	public double getArea()
	{
		return 0;//ģ�ⷵ��ֵ
	}
	//��ͼ�ε��ܳ�
	public double getLength()
	{
		return 0;//ģ�ⷵ��ֵ
	}
	//��ӡͼ�ε�λ������
	public void printLocation()
	{
		System.out.println("��ǰͼ�ε�λ����("+location.getX()+","+location.getY()+")");
	}
}