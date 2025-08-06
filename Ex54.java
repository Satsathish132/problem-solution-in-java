import java.util.*;
public class Ex54{
    public static int sum(int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            c=c+arr[i];
        }
        return c;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt(); 

        int[] arr = new int[n]; 

        System.out.println("Enter elements: "); 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result=sum(arr);
        System.out.println("sum "+result);
}
}