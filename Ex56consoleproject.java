import java.util.*;
public class Ex56consoleproject {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    } 
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        if(b!=0){
            return a/b;
        }else{
            return 0;
        }
        
    }
    public static int ex(int a,int b){
        return a^b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first variable ");
        int a=sc.nextInt();
        System.out.println("enter second variable ");
        int b=sc.nextInt();
        System.out.println("choose operation +,-,*,/,^ :");
        char c=sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.println("addition :"+add(a,b));
                break;
            case '-':
                System.out.println("subtraction :"+sub(a,b));
                break;
            case '*':
                System.out.println("multiplication :"+mul(a,b));
                break;
            case '/':
                System.out.println("division :"+div(a,b));
                break;
            case '^':
                System.out.println("ex-or :"+ex(a,b));
                break;
            default:
                System.out.println("Invalid");
        }sc.close();
    }
}
