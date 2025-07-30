 //import java.util.*;
 //public class Ex36 {
  //   public static void main(String[]args){
 //    Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int c=65;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if(i==1){
//                 System.out.print((char)c+" ");
//                 c++;
//             }
//         }System.out.println(" ");
//     }
//     }
// }

// import java.util.*;
// public class Ex36 {
//     public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int c=65;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//                 System.out.print((char)c+" ");
//                 c++;
//         }System.out.println(" ");
//     }
//     }
// }

/*import java.util.*;
public class Ex36 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char c='p';
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
                System.out.print((char)c-- +" ");    
        }System.out.println(" ");
    }
    }
}*/

// public class Ex36 {
//     public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int c=65;
//     for(int i=1;i<=n;i++){                          //'A'+(4*j)+i
//        int m=c;
//         for(int j=1;j<=n;j++){
//                 System.out.print((char)m+" ");
//                m=m+4;
               
//         }System.out.println(" ");
//             c++;
         

//     }
//     }
// }
import java.util.Scanner;
public class Ex36 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){                          //'A'+(4*j)+i
        for(int j=1;j<=n;j++){
            char res=(char)('A'+ (n * j) + i);
            System.out.print(res+ " ");
            }System.out.println();
               
        }
         

    }
    }