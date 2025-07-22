import java.util.Scanner;
public class Ex29
{
    public static void main(String args[])
    {
        
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        
        char [] array=a.toCharArray();
        for(char ch:array){
            System.out.println(ch+" ");
        }
        
    }
}