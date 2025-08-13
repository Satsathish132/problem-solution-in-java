import java.util.*;
public class Ex71hashprob {
    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();
        HashMap<String,Integer> maps=new HashMap<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("number of batsman:");
        int n=sc.nextInt();
        System.out.println("batsman and centuries:");
        for(int i=0;i<n;i++){
            map.put(sc.next(),sc.nextInt());
        }System.out.println(map);

        System.out.println("number of bowlers");
        int m=sc.nextInt();
        System.out.println("bowler and wickets:");
        for(int i=0;i<m;i++){
            maps.put(sc.next(),sc.nextInt());
        }System.out.println(maps);

        System.out.println("update centuries");
        String v=sc.next();
        int a=map.getOrDefault(v, 0)+1;
        map.put(v,a);
        
        System.out.println(map);
        System.out.println("remove bowlers");
        maps.remove(sc.next());
        System.out.println("After update and removal:");
        System.out.println("batsman"+map);
        System.out.println("bowler"+maps);
    
}
}
