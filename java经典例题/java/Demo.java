package com.oo.test;
public class Demo
{
	public static void main(String[] arg)
	{
		//����������ʾλ�õĵ����
		Point p1 = new Point(2,2);
		//Point p2 = new Point(2,1);
		//����p1��p2�ľ���
		//System.out.println("p1��p2�ľ���Ϊ��"+p1.getDistance(p2));
		//������������
		Rectangle r1 = new Rectangle(p1,10,5,2.5,4.7);
		System.out.println("r1�����Ϊ��"+r1.getArea());
		System.out.println("r1���ܳ�Ϊ��"+r1.getLength());
		r1.printLocation();
		r1.location();		     		     
		if(r1.contains()==true)
		{
			
			System.out.println("��p��ͼ����");
		}
		else 
		{
			System.out.println("��p����ͼ����");
		}
		System.out.println("---------------------------------");
		Circle s=new Circle(p1,3,4,5);
		s.Square();
		s.Diagonal();
	}
}
/*˼���⣺
 *1������Rectangle����һ��Circle�࣬���޸Ķ�Ӧ������
 *2������Rectangle������һ������:
 *   public boolean contains(Point p)
 *   �����Ĺ����ǣ��жϲ�����p�ڲ���ͼ���У�
 */
