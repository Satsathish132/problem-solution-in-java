import java.util.*;
public class Ex66vector{
    public static void main(String []args){
        Vector<String>n=new Vector<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of initial flower");
        int a=sc.nextInt();
        System.out.println("flower names seperated by space");
        for(int i=0;i<a;i++){
            n.add(sc.next());
        }System.out.println("number of operation");
        int b=sc.nextInt();
        System.out.println("operations in captial letter \n 1)ADD \n 2)INSERT\n 3)UPDATE \n 4)REMOVE \n 5)SEARCH \n 6)DISPLAY \n 7)COUNT \n 8)RETRIVE");
        for(int i=0;i<b;i++){
            String c=sc.next().toUpperCase();
            switch(c) {
                case "ADD":
                    System.out.println("enter");
                    n.add(sc.next());
                    break;
                case "INSERT":
                    System.out.println("elemen name and postion");
                    n.insertElementAt(sc.next(),sc.nextInt());
                    break;
                case "UPDATE":
                    System.out.println("element postion and name");
                    n.set(sc.nextInt(),sc.next());
                    break;
                case "REMOVE":
                    System.out.println("enter");
                    n.remove(sc.nextInt());
                    break;
                case "SEARCH":
                    System.out.println("enter");
                    if(n.contains(sc.next())){
                        System.out.println("found");
                    }else{
                        System.out.println("not found");
                    }
                    break;
                case "DISPLAY":
                    System.out.println(n);
                    break;
                case "COUNT":
                    n.size();
                    break;
                case "RETRIVE":
                    n.get(sc.nextInt());
                    break;   
            }
        }
        
    }
}
