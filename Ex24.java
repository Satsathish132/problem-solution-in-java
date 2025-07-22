import java.util.*;
public class Ex24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String len = Integer.toString(a);
        System.out.println(len.charAt(b));
        sc.close();
    }
}