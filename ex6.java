import java.util.Scanner;
public class ex6{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int l=sc.nextInt();
    int b=sc.nextInt();
    float r=sc.nextFloat();
    int s=sc.nextInt();

    double e=(3.14*r*r);
    System.out.println(s*s);
    System.out.println(l*b);
    System.out.printf("%.02f",e);
    }
}