
import java.util.Scanner;
class inp{
    void i(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        double e=((a+c)/2.0);
        double f=((b+d)/2.0);
        System.out.println("binoy's house is located at ("+e+","+f+")");
    }
}
public class Oops9 {
    public static void main(String []args){
        inp x=new inp();
        x.i();
    }
}
