//2d array
import java.util.Scanner;
public class Ex46 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[a][c];
        System.out.println("enter the values");
        for(int i=0;i<a;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }System.out.println("the 2d arrays is");
        for(int i=0;i<a;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
    }
System.out.println();}
int b=sc.nextInt();
int d=sc.nextInt();
char arr[][]=new char[b][d];
System.out.println("enter the values");
        for(int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                arr[i][j]=sc.next().charAt(0);
            }
        }System.out.println("the 2d arrays is");
        for(int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                System.out.print(arr[i][j]+" ");
}System.out.println();
}
}
}

