import java.util.Scanner;
public class ex13{
    public static void main(String[] args) {
    int a=new Scanner(System.in).nextInt();
    if(a<=999 && a>=100){
        if(((a%100)/10)%3==0){
            System.out.println("it is trendy");
        }else{
            System.out.println("not trendy");
        }
    }else{
        System.out.println("normal three digit number");
    }
    } 
}

/* write a program to find trendy number*/