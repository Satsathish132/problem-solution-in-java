import java.util.*;
class grand{ 
    String g;
    void display(){
        System.out.println("grand parents property : "+g);
    }
}

class parent extends grand{
    String h;
    
    void parentdis(){
		display();
        System.out.println("parents property : "+h);
    }
}

class child extends parent{
	String k;
	void chi(){
		parentdis();
		System.out.println("child property :"+k);
	}
}
public class Oops5mLinheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        child j=new child();
        j.g=sc.next();
        j.h=sc.next();
        j.k=sc.next();
        j.chi();
    }
}
