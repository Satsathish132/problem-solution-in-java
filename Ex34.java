/*public class Ex34{
    public static void main(String[]args){
        int n=1;
        for(int i=5;i>=n;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}*/
/*public class Ex34{
    public static void main(String[]args){
        int n=1;
        for(int i=5;i>=n;i--){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }System.out.println();
        }
    }
}*/
/*public class Ex34{
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}*/
// public class Ex34{
//     public static void main(String[]args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                if(i==j||i==n||j==1) {
//                 System.out.print("* ");
//                }else{
//                 System.out.print(" 23 ");
//                }
//             }System.out.println();
//         }
//     }
// }

/*import java.util.Scanner;
public class Ex34{
    public static void main(String[]args){
        int n=new Scanner(System.in).nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(j==5||i==n||i+j==6) {
                System.out.print("* ");
               }else{
                System.out.print("  ");
               }
            }System.out.println();
        }
    }
}*/

/*import java.util.Scanner;
public class Ex34
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++)//rows
	    {
	       
	       for(int j=1;j<=n;j++)//collums
	        {
	        if(i+j>=n+1)
	        {
	            System.out.print("* ");
	        }
	        else
	        {
	            System.out.print(" ");
	        }
	        }
	        System.out.println();
	        
	    }
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++)//collums
	        {
	        if(i<j)
	        {
	            System.out.print("* ");
	        }
	        else
	        {
	            System.out.print(" ");
	        }
	        }
	        System.out.println();
	    }
	}	
	
} */

import java.util.Scanner;
public class Ex34
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++)//rows
	    {
	       
	       for(int j=1;j<=n;j++)//collums
	        {
	        if(i+j==5||i+j==n+2)
	        {
	            System.out.print("* ");
	        }
	        else
	        {
	            System.out.print("  ");
	        }
	        }
	        System.out.println();
	        
	    }
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++)//collums
	        {
	        if(i+j==11||i+j==n+2)
	        {
	            System.out.print("* ");
	        }
	        else
	        {
	            System.out.print("  ");
	        }
	        }
	        System.out.println();
	    }
	}	
	
}