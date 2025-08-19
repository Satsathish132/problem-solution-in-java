import java.util.Scanner;
class prof{
    void p(){
         Scanner sc=new Scanner(System.in);
         float a=sc.nextFloat();
         float b=sc.nextFloat();
         b=b*12;
         if(a>b){

            System.out.printf("profit :%.1f",a-b);
         }
         else
         {
            System.out.printf("loss :%.1f",b-a);
         }
    }
}
public class Oops10 {
    public static void main(String []args){
       prof s=new prof();
       s.p();
    }
}
