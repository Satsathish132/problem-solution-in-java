import java.util.Scanner;
public class ex11{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a <=0){
            System.out.println("Not Safe to go out is "+a+" deg");
        }else{
            System.out.println("Safe for outdoor activities is "+a+" deg");
        }
    }
}

/* write a program to restrition ti go out if the weather is -deg*/