/*某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
	在传递过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
		然后，把加密后的结果在控制台打印出来。
 */
package com.javaproject;
import java.util.Scanner;
public class project03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ch=new Scanner(System.in);
		System.out.println("请输入(1-8)位数字:");
		int number=ch.nextInt();//键盘获取数据
		String s=Jiami(number);
		System.out.print(s);
		
	}
		public static String Jiami(int number) {
			    int[] arr=new int[8];
			    String s="";
			    int inder=0;
			  //把number中的数据想办法放到数组中
			    while(number>0) {
			    	arr[inder]=number%10;
			    	inder++;
			    	number/=10;
			    }
			  //把每个数据加5，然后对10取得余数
			    for(int i=0;i<inder;i++) {
			    	arr[i]+=5;
			    	arr[i]%=10;
			    }
			  //把第一位和最后一位交换
			    int temp=arr[0];
			    arr[0]=arr[inder-1];
			    arr[inder-1]=temp;
			    
			    for(int j=0;j<inder;j++) {
			   //把数组的元素拼接成一个字符串返回
			    	s+=arr[j];
			    }
			    System.out.println();
			    return s;
		}
}
