//�����ε��ܳ������
package com.javaproject;

import java.util.Scanner;

class changfangxing{
	private int length;
	private int wouth;
	public void setLength(int length) {
		this.length=length;
	}
	public void setWouth(int wouth) {
		this.wouth=wouth;
	}
	public int getGirth() {
		return (length+wouth)*2;
	}
	public int getProportion() {
		return length*wouth;
	}
}
public class project05 {

	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
          System.out.println("�����볤���εĳ�");
          int length=ch.nextInt();
          System.out.println("�����볤���εĿ�");
          int wouth=ch.nextInt();
          changfangxing s=new changfangxing();
          s.setLength(length);
          s.setWouth(wouth);
          System.out.println("�ܳ�Ϊ��"+s.getGirth()+"���Ϊ��"+s.getProportion());
	}

}
