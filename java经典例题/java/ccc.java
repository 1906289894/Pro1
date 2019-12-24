import java.util.Scanner;
public class ccc{
    public static void main(String[] args){
      Scanner s=new Scanner(System.in);
        int n=s.nextInt();
           int sun=fin(n);
        System.out.println(sun);
    }
    public static int fin(int n){
       
         if(n<=2){
            return 1;
        }else{
            return fin(n-1)+fin(n-2);
        }
            
    }
}