import java.util.*;
public class Ex59bank {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Welcome to the rowdy bank");
        System.out.println("Enter the name: ");
        String a=sc.nextLine();
        System.out.println("Enter the account number: ");
        int b=sc.nextInt();
        if(a!=null){
            System.out.println("Account created");
        }else{
            System.out.println("not created");
        }

        System.out.println("===================MENU====================");
        int choice;
        int count=0;

        for(int i=0;i<5000;i++){
        System.out.println("Enter the choice");
        choice=sc.nextInt();
        
        if(choice==1){
                System.out.println("Deposit amount :");
                int d=sc.nextInt();
                count=count+d;
                System.out.println("Amount deposited successfully");
        }
        else if(choice==2){
                System.out.println("withdraw amount :");
                int s=sc.nextInt();
                count=count-s;
                System.out.println("Amount withdrawn successfully");
        }
        else if(choice==3){
                System.out.println("Check balance :"+count);
        }
        else if(choice==4){
                System.out.println("Exiting");
                break;
        }
        else{
                System.out.println("Invalid");
        }
    }
    }
}
