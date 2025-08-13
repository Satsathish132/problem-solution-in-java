import java.util.*;
class Car{
    String brand;
    int year;
    void details(){
        System.out.println("Brand : "+brand);
        System.out.println("Year : "+year);
    }
}
class Person{
    private String name;
    public void setName(String name){
        this.name=name;
    }public String getName(){
        return name;
    }
}

public class Oops1class {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Car c1=new Car();
        c1.brand=sc.next();
        c1.year=sc.nextInt();
        c1.details();

        Person p=new Person();
        System.out.println("enter");
        String s=sc.next();
        p.setName(s);
        System.out.println("vannakam "+p.getName());
    }
    
}