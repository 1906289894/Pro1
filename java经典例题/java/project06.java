//������Ϸ
package com.javaproject;
import java.util.Scanner;
public class project06 {

	  public static void main(String[] args) {
	          // �����������һ����(���µ�)
           int number=(int)(Math.random()*100)+1;
              //��������ĳ�ʼ��ֵΪ��0   
           int s=0;
              //������βµĻ��ᣬ���оͽ���
           while (true) {   
        					//	��������
        	                s++;
        	                //����¼�����ݣ�(��µ�)
        	              Scanner ch=new Scanner(System.in);
        	              System.out.println("������һ��1-100֮�������");
        	              int number2=ch.nextInt();
        	              //����µĺͱ��µĽ��бȽ�
        	              if(number2>number) {
        					System.out.println("��µ���"+number2+"����");
        	              }
        	              else if(number2<number) {
        					System.out.println("��µ�����"+number2+"С��");
        	              }
        	              else {
        						
        						System.out.println("��¶���");
        						break;
        	              }
		
	                 }
                             System.out.println("������"+s+"��");
	}

}
