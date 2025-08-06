//function
// import java.util.*;
// public class Ex53 {
//     public static int add(int a,int b,int c){
//         return a+b+c;
//     }
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of elements: ");
//         int a = sc.nextInt(); 
//         int b = sc.nextInt(); 
//         int c = sc.nextInt(); 
//         int res=add(a,b,c);
//         System.out.println("addition elements: "+res); 
        
// }
// }


import java.util.*;
public class Ex53{

public static int fact(int n){
//       int facti=1;
//       if(n<0){
//             return -1;
//         }else{
//             for(int i=1;i<=n;i++){
//                 facti=facti*i;
//             }
//             return facti;
// }
if(n<0){
    return -1;
}else{
    return n*(fact(n-1));
}
}
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt(); 
        int result=fact(n);
        if(result==-1){
            System.out.println("invalid");
        }else{
            System.out.println(result);
        }   
        }
    }
