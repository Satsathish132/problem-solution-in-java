import java.util.Scanner;
public class Ex25 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);    
    int n = sc.nextInt();
    n = Math.abs(n);
    System.out.println(n);
    int count = 0;
    while(n != 0){
        n = n/10;
        count++;

    }
    System.out.println(count);

    
}}
// count the numbers and convert the symbols(+,-).