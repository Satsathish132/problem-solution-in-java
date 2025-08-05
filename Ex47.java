import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[a][c];
        System.out.println("enter the value");
        int sum=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
                sum=sum+(mat[i][j]);
            }
        }System.out.println("array");
        for(int i=0;i<a;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }System.out.println();
        }System.out.println("transpose");//transpose 
    for(int i=0;i<a;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[j][i]+" ");
            }System.out.println();
}System.out.println("Sum "+sum);
int r=0;
int b=0;
for(int i=0;i<a;i++){
            for(int j=0;j<c;j++){
                r=r+(mat[i][j]);
                b=b+(mat[j][i]);
            }System.out.println("row sum "+i+" is "+r);
            System.out.println("col sum "+i+" is "+b);
            r=0;
            b=0;
        }int min=1;
        int max=1;
            for(int i=0;i<a;i++){
            for(int j=0;j<c;j++){
                 max=Math.max(max,mat[i][j]);
                 min=Math.min(min,mat[i][j]);
            }
        }System.out.println("min and max is "+min+" "+max);
}
}
