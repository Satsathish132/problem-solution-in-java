import java.util.Scanner;
public class Ex32 {
    public static void main(String[] args){
        int n = new Scanner(System.in).nextInt();
        for(int i =0;i<=5;i++){
            n = n + (13 * i);
            System.out.println(n);
        }
    }
    
}
