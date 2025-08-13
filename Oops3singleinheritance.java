import java.util.*;
class Car{ //class defination  //parent (base class)
    String brand;
    int year;
    void display(){
        System.out.println("Car Brand : "+brand);
        System.out.println("Car year : "+year);
    }
}

class ElectricCar extends Car{ //child class (derived )
    int battercapacity;
    
    void electricdisplay(){
        display();//calling parent class method 
        System.out.println("Battery Capacity : "+battercapacity+ " Kwh");
        
    }
}
public class Oops3singleinheritance
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ElectricCar e1=new ElectricCar();
		
		//user input
		System.out.println("Enter Car Brand :");
		e1.brand=sc.nextLine();
		
		System.out.println("Enter Car year :");
		e1.year=sc.nextInt();
		
		System.out.println("Enter Car Battery Capacity :");
		e1.battercapacity=sc.nextInt();
		
		//car details
		
		e1.electricdisplay();
	
	}
}