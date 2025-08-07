import java.util.*;
public class Ex57 {
    public static int su(int arr[],int m){
        int c=0;
        for(int i=1;i<m-1;i++){
           c=c+arr[i];
        }
        return c;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }System.out.println(su(arr,a));
        }
    }

    
