import java.util.*;
class car{  //class creation
    String brand;
    int model;
    void display(){
        System.out.println("brand "+brand);
        System.out.println("model "+model);
    }
}

public class Oops2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        car c=new car(); //object creation
        System.out.println("car name");
        c.brand=sc.next();
        System.out.println("model");
        c.model=sc.nextInt();
        System.out.println("car:"+c.brand+" "+c.model);
        c.display();
    }
}
