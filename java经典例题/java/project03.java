/*ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
	�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
		���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
		��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
		Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������
 */
package com.javaproject;
import java.util.Scanner;
public class project03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch=new Scanner(System.in);
		System.out.println("������(1-8)λ����:");
		int number=ch.nextInt();//���̻�ȡ����
		String s=Jiami(number);
		System.out.print(s);
		
	}
		public static String Jiami(int number) {
			    int[] arr=new int[8];
			    String s="";
			    int inder=0;
			  //��number�е�������취�ŵ�������
			    while(number>0) {
			    	arr[inder]=number%10;
			    	inder++;
			    	number/=10;
			    }
			  //��ÿ�����ݼ�5��Ȼ���10ȡ������
			    for(int i=0;i<inder;i++) {
			    	arr[i]+=5;
			    	arr[i]%=10;
			    }
			  //�ѵ�һλ�����һλ����
			    int temp=arr[0];
			    arr[0]=arr[inder-1];
			    arr[inder-1]=temp;
			    
			    for(int j=0;j<inder;j++) {
			   //�������Ԫ��ƴ�ӳ�һ���ַ�������
			    	s+=arr[j];
			    }
			    System.out.println();
			    return s;
		}
}
