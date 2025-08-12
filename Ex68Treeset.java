import java.util.*;
public class Ex68Treeset {
	public static void main(String[] args) 
	{
	    TreeSet<Integer> ts=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=sc.nextInt();
		
		System.out.println("Enter elements ");
		for(int i=0;i<n;i++){
		    ts.add(sc.nextInt());
		}System.out.println("initial list :"+ts);
		System.out.println("remove element :");
		int v=sc.nextInt();
		ts.remove(v);
		System.out.println("after remove :"+ts);
		System.out.println("search");
		int z=sc.nextInt();
		if(ts.contains(z)){
			System.out.println("FOUND");
		}else{
			System.out.println("NOT FONUND");
		}
		System.out.println("lowest number :"+ ts.first());
		System.out.println("highest number :"+ ts.last());
		System.out.println("score below and above");
		int s=sc.nextInt();
		System.out.println("score below:"+ts.lower(s));
		System.out.println("score above:"+ts.higher(s));
		System.out.println("scores in range from");
		int x=sc.nextInt();
		int y=sc.nextInt();
		ts.subSet(x, y);
		System.out.println(ts);
		ts.clear();
		System.out.println(ts);
	}
}