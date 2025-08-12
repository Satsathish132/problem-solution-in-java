import java.util.*;
public class Ex69hashset
{
	public static void main(String[] args) 
	{
	    HashSet<Integer> hs =new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to add:");
		int n=sc.nextInt();
		
		System.out.println("Enter elements "+hs);
		for(int i=0;i<n;i++){
		    hs.add(sc.nextInt());
		}
		System.out.println("HashSet :"+hs);
		
		System.out.println("Enter element to remove ");
		
		int R=sc.nextInt();
		hs.remove(R);
		System.out.println("HashSet :"+hs);


		System.out.println("IS Empty "+hs.isEmpty());

		System.out.println("ALL Elements with Iterator");
		Iterator<Integer> i=hs.iterator();
		while(i.hasNext()){
		    System.out.println(i.next());
		}
	
	}
	
}

