import java.util.*;
public class Ex62 {
    public static void main(String[]args){
        HashSet<String> b=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("no of players");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("batsman name");
        for(int i=0;i<a;i++){
            String c=sc.nextLine();
            if(b.add(c)){
                System.out.println("player"+b);
            }else{
                System.out.println("repeated player"+b);
            }
        }System.out.println("count "+b.size());
    }
}
