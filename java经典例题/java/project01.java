package com.javaproject;
//数组求和
public class project01 {

	public static void main(String[] args) {
		int[][] arr= {{78,24,36},{76,23,46,98},{78,36,},{96}};
		sss(arr);
	}
  public static void sss(int[][] arr) {
	  int sun=0;
      for(int i=0;i<=3;i++) {
     	 for(int j=0;j<arr[i].length;j++) {
     		 sun+=arr[i][j];
     		System.out.print(arr[i][j]);
     	 }
     	System.out.println(" ");
      }
      System.out.println(sun);
  }
}
