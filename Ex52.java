import java.util.Scanner;

public class Ex52 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim().toLowerCase();
        str = str.replaceAll(" ", "");
        
        
        //logic 1
        // int i=0, j=str.length()-1;
        // boolean flag = true;
        // while(i<j){
        //     if(str.charAt(i)!=str.charAt(j)) flag = false;
        //     i++;
        //     j--;
        // }
        
        //logic 2
        StringBuilder sb=new StringBuilder(str);
        String rev=sb.reverse().toString();
        System.out.println(str.equals(rev)?"Palindrome":"Not a palindrome");

    }
}
//palindrome
