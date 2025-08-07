import java.util.*;

public class Ex60ARRlist {
	public static int max(List <Integer> list){

		int c=0;
		for(int i:list){
			c=Math.max(c,i);
	}return c;
}
    	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		List <Integer> list=new ArrayList<>();
		int a=sc.nextInt();
		sc.nextLine();
        
		// list.add("sat");
		// list.add("peru");
		// list.add("Vishnu");
		// list.add("Sanjay");
        // list.add(sc.next());
		for(int i=0;i<a;i++){
			int b=sc.nextInt();
			list.add(b);
		}
		System.out.println(max(list));
	}
}
