//猜数游戏
package com.javaproject;
import java.util.Scanner;
public class project06 {

	  public static void main(String[] args) {
	          // 程序随机产生一个数(被猜的)
           int number=(int)(Math.random()*100)+1;
              //定义次数的初始化值为：0   
           int s=0;
              //给出多次猜的机会，猜中就结束
           while (true) {   
        					//	次数自增
        	                s++;
        	                //键盘录入数据，(你猜的)
        	              Scanner ch=new Scanner(System.in);
        	              System.out.println("请输入一个1-100之间的数：");
        	              int number2=ch.nextInt();
        	              //把你猜的和被猜的进行比较
        	              if(number2>number) {
        					System.out.println("你猜的数"+number2+"大了");
        	              }
        	              else if(number2<number) {
        					System.out.println("你猜的数据"+number2+"小了");
        	              }
        	              else {
        						
        						System.out.println("你猜对了");
        						break;
        	              }
		
	                 }
                             System.out.println("共猜了"+s+"次");
	}

}
