
import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        a=a.replaceAll("the ","");
        System.out.println(a);
    }
} //remove a character

