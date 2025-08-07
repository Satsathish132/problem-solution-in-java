import java.util.*;
public class Ex55 {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
      return a-b;
       
    }
    public static int mul(int a,int b){
      return a*b;
    }
    public static int squ(int a,int b){
      return (int)Math.pow(a,b);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        
        int res=add(a,b);
        int res1=sub(a,b);
        int res2=mul(a,b);
        int res3=squ(a,b);
        System.out.println("addition elements: "+res); 
        System.out.println("sub elements: "+res1); 
        System.out.println("mul elements: "+res2);
        System.out.println("squ elements: "+res3);          
}
}
