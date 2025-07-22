import java.util.Scanner;
public class ex5{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    a = a + b;  //5,4 9 5 4
    b= a - b;
    a= a-b;
    System.out.printf("%d %d ",a,b);
    }
}

// This code reads two integers from the input, swaps their values, and prints them
