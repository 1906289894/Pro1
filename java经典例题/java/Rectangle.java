package com.oo.test;
public class Rectangle extends Shape
{
	double w,h;//矩形的宽和高
	double x,y;//点的位置坐标
	//将点的参数加入要实例化的构造方法中
	public Rectangle(Point p,double w,double h,double x,double y)
	{
		super(p);
		this.h = h;
		this.w = w;
		this.x = x;
		this.y = y;
	}
	public Rectangle(double x,double y,double w,double h)
	{
		super(new Point(x,y));
		this.h = h;
		this.w = w;
	}
	//覆盖父类的相关方法
	//求图形面积
	public double getArea()
	{
		return w*h;
	}
	//求图形的周长
	public double getLength()
	{
		return 2*(w+h);
	}
	//打印图形的位置坐标
	public void printLocation()
	{
		System.out.println("矩形的位置在("+this.getLocation().getX()+","+this.getLocation().getY()+")");
		System.out.println("矩形的宽为："+w+"，高为："+h);
	}
	 //这个点的位置
	 public void location() 
	 {
		 System.out.println("点p的位置在("+this.x+","+this.y+")");
	 }
	//判断这个点是否在图形中并返回boolean值
	public boolean contains()
	{
	    if(this.x>=this.getLocation().getX()&&this.x<=(this.getLocation().getX()+w)
	    		&&this.y>=this.getLocation().getY()&&this.y<=(this.getLocation().getY()+h))
	    {
	    	return true;
	    }
	    else 
	    {
	    	return false;
	    }
     }    
	 
}