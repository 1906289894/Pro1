package com.oo.test;

public class Point
{
	private double x,y;//�������
	public Point()
	{
		this.x = 0;
		this.y = 0;
	}
	public Point(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	public double getX()
	{
		return x;
	}
	public void setX(double x)
	{
		this.x = x;
	}
	public double getY()
	{
		return y;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	//��ԭ��ľ���
	public double getDistance()
	{
		return Math.sqrt(x*x+y*y);
	}
	//��������ľ���
	public double getDistance(Point p)
	{
		double s = 0;//����ֵ
		s = Math.sqrt((this.x-p.getX())*(this.x-p.getX())
		        +(this.y-p.getY())*(this.y-p.getY()));
		return s;
	}
}