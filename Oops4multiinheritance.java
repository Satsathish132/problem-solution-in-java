import java.util.*;
class Car{ //class defination  //parent (base class)
    String brand;
    int year;
    void display(){
        System.out.println("Car Brand : "+brand);
        System.out.println("Car year : "+year);
    }
}

class ElectricCar extends Car{ // child (derived class)
    int battercapacity;
    
    void electricdisplay(){
		display();
        System.out.println("Battery Capacity : "+battercapacity+ " Kwh");
    }
}

class child extends ElectricCar{
	int version;
	void chi(){
		electricdisplay();
		System.out.println("version :"+version);
	}
}
public class Oops4multiinheritance
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		child e1=new child();
		
		System.out.println("Enter Car Brand :");
		e1.brand=sc.nextLine();
		
		System.out.println("Enter Car year :");
		e1.year=sc.nextInt();
		
		System.out.println("Enter Car Battery Capacity :");
		e1.battercapacity=sc.nextInt();
		
		System.out.println("version: ");
		e1.version=sc.nextInt();
		
		e1.chi();

	}
}

