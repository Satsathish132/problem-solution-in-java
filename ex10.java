import java.util.Scanner;
public class ex10{
    public static void main(String[] args) {
    int a=new Scanner(System.in).nextInt();
    if(a<=0){
        System.out.println("not valid for vote");
    }else if(a>=18){
        System.out.println("valid for voting");
    }else{
        System.out.println("not eligible for voting");
    }
    }
} 
/* write a java program for voting eligibilty */