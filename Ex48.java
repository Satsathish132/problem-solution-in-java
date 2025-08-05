// find the given number in the condition in the square sides of 1 and last 
// import java.util.Scanner;
// public class Ex48 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         int mat[][]=new int[a][b];
//         System.out.println("enter the values");
//         for (int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 mat[i][j]=sc.nextInt();
//             }
//         } for (int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 if(i==0||j==0||i==a-1||j==b-1){
//                     if(mat[i][j]==c){
//                         System.out.println("Yes");
//                         break;
//                     }
//                     }
//                 }
//             }System.out.println("no");
//         }
//     }

// import java.util.Scanner;
// public class Ex48 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         int mat[][]=new int[a][b];
//         int k=1;
//         int l=0;
//          for (int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 mat[i][j]=k++;
//                 if(i==0||j==0||i==a-1||j==b-1){
//                     if(mat[i][j]==c){
//                         System.out.println("Yes");
//                         l=1;
//                         break;
//                     }
//                     }
//                 }
//             }if(l==0){
//                 System.out.println("no");
//             }
//         }
//    }

// import java.util.Scanner;

// public class Ex48
// {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
		
// 		int row =sc.nextInt();
// 		int column =sc.nextInt();
// 		int tree=sc.nextInt();
// 		int [][] matrix2=new int [row][column];
		
// 		if(tree>=1 && tree<=column || tree%column==1 || tree%column==0 ){
// 		    System.out.println("Yes");
// 		}else{
// 		    System.out.println("No");
// 		}
// 	}
// }

import java.util.Scanner;

public class Ex48
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int row =sc.nextInt();
		int column =sc.nextInt();
		int tree=sc.nextInt();
		int [][] matrix2=new int [row][column];
		
		if(((tree%row==1||tree>=1 && tree<=row||tree<=(row*column) && tree<=(column*row-1)+1)) && (tree<=column*row)){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
	}
}
