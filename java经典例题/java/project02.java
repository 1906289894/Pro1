//打印杨辉三角
package com.javaproject;
import java.util.Scanner;
public class project02 {

	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		System.out.println("请输入一个数，打印该数对应的杨辉三角");
		int n=ch.nextInt();
		int[][] arr=new int[n][n];
		sss(arr);
		
	}
     public static void sss(int[][] arr) {
    	 for(int i=0;i<arr.length;i++) {
    		 arr[i][0]=1;
    		 arr[i][i]=1;
    	 }
    	 for(int i=2;i<arr.length;i++) {
    		 for(int j=1;j<=i-1;j++) {
    			 arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
    		 }
    	 }
    	 for(int i=0;i<arr.length;i++) {
    		 for(int j=0;j<=i;j++) {
    			 System.out.print(arr[i][j]+"\t");
    		 }
    		 System.out.println();
    	 }
     }
}
