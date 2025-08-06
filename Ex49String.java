import java.util.*;
public class Ex49String{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        String a=sc.next();
        for(int i=0;i<a.length();i++){
            char s=a.charAt(i);     //converting small in capital letter without libary function
            int m=(int)s;
            if(m>95 && m<123){
                System.out.print((char)(m-32));
            }else if (m>64 && m<91) {
                System.out.print((char)(m));
            }else{
                System.out.println(s);
                break;
            
            }
        

    }System.out.println("");
}
}

