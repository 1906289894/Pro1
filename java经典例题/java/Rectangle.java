package com.oo.test;
public class Rectangle extends Shape
{
	double w,h;//���εĿ�͸�
	double x,y;//���λ������
	//����Ĳ�������Ҫʵ�����Ĺ��췽����
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
	//���Ǹ������ط���
	//��ͼ�����
	public double getArea()
	{
		return w*h;
	}
	//��ͼ�ε��ܳ�
	public double getLength()
	{
		return 2*(w+h);
	}
	//��ӡͼ�ε�λ������
	public void printLocation()
	{
		System.out.println("���ε�λ����("+this.getLocation().getX()+","+this.getLocation().getY()+")");
		System.out.println("���εĿ�Ϊ��"+w+"����Ϊ��"+h);
	}
	 //������λ��
	 public void location() 
	 {
		 System.out.println("��p��λ����("+this.x+","+this.y+")");
	 }
	//�ж�������Ƿ���ͼ���в�����booleanֵ
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