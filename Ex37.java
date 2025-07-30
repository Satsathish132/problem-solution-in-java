import java.util.*;
public class Ex37{
    public static void main(String[]args){
        int n=new Scanner(System.in).nextInt();
        int res=(n*2)-1;
        for(int i=0;i<res;i++){
            for(int j=0;j<res;j++)
            {
            int minval=Math.min(Math.min(i,j),Math.min(res-1-i,res-1-j));
            System.out.print((n-minval)+" ");
        }System.out.println();
    }
}
}

