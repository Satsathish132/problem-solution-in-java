//odd or even
import java.util.Scanner;
public class ex15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a & 1)==0){
        System.out.println("even");
        }else{
        System.out.println("odd");
       }
    }
}

//(n==(n/2)*2) 

//(n-(n/2*2))

//while(n>=0){
//n=n-2;
//}
//if(n==0)

//(((n>>1)<<1)==n)