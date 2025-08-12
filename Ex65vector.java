import java.util.*;
public class Ex65vector {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    Vector<Integer>num=new Vector<>();
    System.out.println("enter the number of elements");
    int n=sc.nextInt();
    System.out.println("enter elemrnts");
    for(int i=0;i<n;i++){
        num.add(sc.nextInt());
    }System.out.println("vector elements"+num);
}
}

