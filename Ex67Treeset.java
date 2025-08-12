import java.util.*;
public class Ex67Treeset {
	public static void main(String[] args) 
	{
	    TreeSet<Integer> ts=new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to add:");
		int n=sc.nextInt();
		
		System.out.println("Enter elements ");
		for(int i=0;i<n;i++){
		    ts.add(sc.nextInt());
		}
		System.out.println("Treeset :"+ts);
		
		System.out.println("Enter element to remove ");
		
		int R=sc.nextInt();
		ts.remove(R);
		System.out.println("Treeset :"+ts);
		
		//search
        if(ts.contains(R)){
            System.out.println("founded");
        }

		
		System.out.println("First element :"+ts.first());
		System.out.println("Last element :"+ts.last());
		
		int find=sc.nextInt();
		System.out.println("lower element :"+ts.lower(find));
		System.out.println("higher element :"+ts.higher(find));
		
	}
	
}
