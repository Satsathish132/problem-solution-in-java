import java.util.Scanner;
public class Ex58 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        for(int i=1;i<a;i++){
            if((a/i)*(a/i)==a){
                System.out.println((i+1)*(i+1));
                b++;
                break;
            }
            }if(b==0){
                System.out.println("-1");
        }
    }
}
