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

/*import java.util.Scanner;
public class Ex35{
    public static void main(String[]args)
    {
        int n=new Scanner(System.in).nextInt();
        int a=1;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
            System.out.printf("%02d ",a++);
            }
            System.out.println();
        }
    }
}*/

/*import java.util.Scanner;
public class Ex35{
    public static void main(String[]args){
        int n=new Scanner(System.in).nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i<=j) {
                System.out.printf("%02d ",a++);
               }else{
                System.out.printf("   ");
               }
            }System.out.println();
        }
    }
}*/


/*import java.util.Scanner;
public class Ex35{
    public static void main(String[]args){
        int n=new Scanner(System.in).nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i+j>=n+1) {
                System.out.printf("%02d ",a++);
               }else{
                System.out.printf("   ");
               }
            }System.out.println();
        }
    }
}*/

import java.util.Scanner;
public class Ex35{
    public static void main(String[]args){
        int n=new Scanner(System.in).nextInt();
        int a=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
               if(i==3||j==3||i + j ==4 ||j - i ==2) {
                System.out.printf("%02d ",a++);
               }else{
                System.out.printf("   ");
               }
            }System.out.println();
        }
    }
}
