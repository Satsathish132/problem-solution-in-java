import java.util.*;
public class Ex45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int s=n.length();
        char l=sc.next().charAt(0);
        int nu=sc.nextInt();
        int arr[]=new int[s];
        for (int i=0;i<s;i++){
            arr[i]=n.charAt(i);
        }
        int mr[]=new int[s];
            if(l=='l') {
                int c=0;
                for (int i=0;i<s;i++){
                    if(i>=nu){
                        mr[c]=arr[i];
                    }else{
                        mr[nu]=arr[i];
                    }
                    c++;
            }
    }
    for (int i = 0; i < s; i++) {
        System.out.print(mr[i]);
    }
    }
}
