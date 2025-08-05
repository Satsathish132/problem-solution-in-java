//Q1 Inserting at end 
// import java.util.Scanner;

// public class Ex43 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt(); //step-1

//         int[] arr = new int[n]; //step-2 orginal array

//         System.out.println("Enter elements: "); //step-2
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         //new array-step-3
//         int[] newArr = new int[n+1];
        
//         //copying old elements into new Array 
//         for(int i=0;i<n;i++){
//             newArr[i]=arr[i];
//         }
        
        
//         System.out.println("Enter new element");//step-4
//         int newElement=sc.nextInt();
//         ////insert at end 
        
//         newArr[n]=newElement;// step-5
        
//         for(int i=0;i<newArr.length;i++){//step-6   (i<=n or i<n+1 or i<newArr.length)
//             System.out.printf("%d ",newArr[i]);
//         }
// 	}
// }

//insertion at end

// import java.util.Scanner;

// public class Ex43 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt(); 

//         int[] arr = new int[n]; 

//         System.out.println("Enter elements: "); 
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
    
//         int[] newArr = new int[n+1];
        
//         for(int i=0;i<n;i++){
//             newArr[i+1]=arr[i];
//         }
        
        
//         System.out.println("Enter new element");
//         int newElement=sc.nextInt();
   
        
//         newArr[0]=newElement;
        
//         for(int i=0;i<n+1;i++){
//             System.out.printf("%d ",newArr[i]);
//         }
// 	}
// }

//inserting at any position

// import java.util.Scanner;

// public class Ex43{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt(); //step-1

//         int[] arr = new int[n]; //step-2 orginal array

//         System.out.println("Enter elements: "); //step-2
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         //new array-step-3
//         int[] newArr = new int[n+1];
        
//         System.out.println("Enter Index value");
//         int pos=sc.nextInt();
//         System.out.println("Enter element value");
//         int ele=sc.nextInt();
        
//         if(pos < 0 || pos > n){ 
//             System.out.println("Invalid Input");
//             return;
//         }
//         newArr[pos]=ele;
        
        
//         for(int i=0;i<pos;i++){  
//             newArr[i]=arr[i];
//         }
        
//         for(int i=pos;i<n;i++){ 
//             newArr[i+1]=arr[i];
//         }
        
//         for(int i=0;i<newArr.length;i++){
//             System.out.printf("%d ",newArr[i]);
//         }
// 	}
// }

//deletion at given index

// import java.util.Scanner;

// public class Ex43{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt(); 

//         int[] arr = new int[n]; 

//         System.out.println("Enter elements: "); 
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
        
//         int[] newarr = new int[n];
        
//         System.out.println("Enter Index value that needed to be delected");
//         int pos=sc.nextInt();
//         // System.out.println("Enter element value");
//         // int ele=sc.nextInt();
//         if(pos<0||pos>=n){
//             System.out.println("Invalid");
//             return;}
//         for(int i=0;i<n;i++){
//         if(i+1<n){
//             if(i>=pos){
//                 newarr[i]=arr[i+1];
//             }else{
//                 newarr[i]=arr[i];
//             }
//         }
// 	}System.out.println("final array");
//     for(int i=0;i<n-1;i++){
//         System.out.println(newarr[i]);
//     }
// }
// }

//Delete an element logic 2
// import java.util.Scanner;

// public class Ex43 {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Array size");
//         int n=sc.nextInt();//step-1 array size
        
//         int []arr=new int[n];
//         System.out.println("Enter elements");//step-2 (getting array elements from user)
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
            
//         }
        
//         System.out.println("Enter the position to delete");
//         int pos=sc.nextInt();//step-3  //position to delete
        
//         if(pos<0 || pos>=n){  //step-4  // checking post is -Ve or more than index value
//             System.out.println("Invalid Input");
//             return;
//         }
        
//         int [] newArr=new int[n-1];//step-5 //resize array
        
//         for(int i=0;i<pos;i++){  //step-6  //copying array to new array
//             newArr[i]=arr[i];
//         }
        
        
        
//         for(int i=pos+1;i<n;i++){ //step-7 second half
//             newArr[i-1]=arr[i];
//         }
        
        
//         for(int i=0;i<newArr.length;i++){ //step-8  display new array
//             System.out.print(newArr[i]+" ");
//         }
        
        
       
// 	}
	
	
//}

//replace

// import java.util.Scanner;

// public class Ex43{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt(); //step-1

//         int[] arr = new int[n]; //step-2 orginal array

//         System.out.println("Enter elements: "); //step-2
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         //new array-step-3
//         int[] newarr = new int[n];
        
//         System.out.println("Enter Index value that needed to be changed");
//         int pos=sc.nextInt();
//         // System.out.println("Enter element value");
//         // int ele=sc.nextInt();
//         if(pos<0||pos>=n){
//             System.out.println("Invalid");
//             return;}System.out.println("the value is want to change is");
//             int a=sc.nextInt();
//         for(int i=0;i<n;i++){
//             if(i==pos){
//                 newarr[i]=a;
//             }else{
//                 newarr[i]=arr[i];
//             }
// 	}System.out.println("final array");
//     for(int i=0;i<n;i++){
//         System.out.println(newarr[i]);
//     }
// }
// }