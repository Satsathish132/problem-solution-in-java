//declaration of array
/* 
import java.util.*;
public class Ex40 {
        public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(); //3
        int arr[]=new int[n]; //arraysize
        for(int i=0;i<n;i++){
            arr[i]=new Scanner(System.in).nextInt();
        }for(int i=0;i<n;i++){
            System.out.printf(arr[i]+" "); 
        }
      }
    } */



/*1-write a java program to print array elements in normal order
contraints getting  array size and elements from user

2-in reverse order 

maximum element in the array(with and without sorting) 

minimum element in the array(with and without sorting) 

second largest element 

second smallest element 

sum of the elements in the array 

*sum without minimum and maximum 

sum of even index and odd index

 */

//  import java.util.*;
// public class Ex40 {
//         public static void main(String[] args) {
//         int n=new Scanner(System.in).nextInt(); //3
//         int arr[]=new int[n]; //arraysize
//         for(int i=0;i<n;i++){
//             arr[i]=new Scanner(System.in).nextInt();
//         }for(int i=n-1;i>=0;i--){
//             System.out.printf(arr[i]+" "); 
//         }
//       }
//     } 

// import java.util.*;
// public class Ex40 {
//         public static void main(String[] args) {
//         int n=new Scanner(System.in).nextInt(); //3
//         int arr[]=new int[n]; //arraysize
//         for(int i=0;i<n;i++){
//             arr[i]=new Scanner(System.in).nextInt();
//         }
//         Arrays.sort(arr);
//         System.out.println(arr[0]);
//          System.out.println(arr[n-1]);
//         }
//       }

// import java.util.*;
// public class Ex40 {
//         public static void main(String[] args) {
//         int n=new Scanner(System.in).nextInt(); //3
//         int arr[]=new int[n];
//         int sum=0;
//         for(int i=0;i<n;i++){
//             arr[i]=new Scanner(System.in).nextInt();
//           sum+=arr[i];
//           }
//         System.out.print(sum);
//         }
//       }

// import java.util.*;
// public class Ex40 {
//         public static void main(String[] args) {
//         int n=new Scanner(System.in).nextInt(); //3
//         int arr[]=new int[n];
//         int x=arr[0];
//         int y=arr[0];
//         for(int i=0;i<n;i++){
//             arr[i]=new Scanner(System.in).nextInt();
//           }for(int i=0;i<n;i++){
//             x=Math.min(x,arr[i]);
//             y=Math.max(y,arr[i]);
//           }System.out.print(x);
//           System.out.println(y);
        
//         }
//       }

// import java.util.*;
// public class Ex40 {
//         public static void main(String[] args) {
//         int n=new Scanner(System.in).nextInt(); //3
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=new Scanner(System.in).nextInt();
//           }Arrays.sort(arr);
//         for(int i=1;i<n-1;i++){
//         System.out.print(arr[i]);
//       }
//       }
//       }

import java.util.*;
public class Ex40 {
        public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(); //3
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=new Scanner(System.in).nextInt();
          }for (int i= 0;i<n;i++){
            if(i%2==0){
            sum+=arr[i];
          }
          } System.out.println(sum);
        }
      }