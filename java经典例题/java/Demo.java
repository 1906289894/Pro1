package com.oo.test;
public class Demo
{
	public static void main(String[] arg)
	{
		//创建两个表示位置的点对象
		Point p1 = new Point(2,2);
		//Point p2 = new Point(2,1);
		//计算p1到p2的距离
		//System.out.println("p1到p2的距离为："+p1.getDistance(p2));
		//创建两个矩形
		Rectangle r1 = new Rectangle(p1,10,5,2.5,4.7);
		System.out.println("r1的面积为："+r1.getArea());
		System.out.println("r1的周长为："+r1.getLength());
		r1.printLocation();
		r1.location();		     		     
		if(r1.contains()==true)
		{
			
			System.out.println("点p在图形中");
		}
		else 
		{
			System.out.println("点p不在图形中");
		}
		System.out.println("---------------------------------");
		Circle s=new Circle(p1,3,4,5);
		s.Square();
		s.Diagonal();
	}
}
/*思考题：
 *1、仿照Rectangle创建一个Circle类，并修改对应方法！
 *2、在类Rectangle中增加一个函数:
 *   public boolean contains(Point p)
 *   函数的功能是：判断参数点p在不在图形中？
 */
