//frequecy in array
import java.util.*;
public class Ex44{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int freq[]=new int[n];
        System.out.println("enter the array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int visited=-1;
        for(int i=0;i<n;i++){
            int count=1;

            for (int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
                freq[j]=visited;
            }
            }if(freq[i]!=visited){
                freq[i]=count;
            }
        }System.out.println("element and frequency");
        for(int i=0;i<n;i++){
            if(freq[i]!=visited){
                System.out.println(arr[i]+" count: "+freq[i]);
            }
        }
            
    }
    }
