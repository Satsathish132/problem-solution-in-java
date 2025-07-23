import java.util.Scanner;
public class Ex33 {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
          int h=i%10;
          int f=i/10;
         int c=(h+f)+(h*f);
         System.out.print(c);
        }
    }
}
