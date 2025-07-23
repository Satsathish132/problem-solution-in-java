/*import java.util.Scanner;
public class Ex35{
    public static void main(String[]args){
        int n=new Scanner(System.in).nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               System.out.printf("%02d ",a++);
        }System.out.println(" ");
    }
}
}*/

import java.util.Scanner;
public class Ex35{
    public static void main(String[]args)
    {
        int n=new Scanner(System.in).nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.printf("%3d",a++);
            }
            System.out.println();
        }
    }
}