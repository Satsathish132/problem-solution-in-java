import java.util.*;
public class EX63Annamark {
    public static void main(String []args){
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<String> ar=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("marks");
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            arr.add(c);
            System.out.println("Marks :"+arr);
            if(c>=90 && c<=100){
                ar.add("o");
        }else if(c>=80 && c<=89){
           ar.add("A+");
        }else if(c>=70 && c<=79){
           ar.add("A");
        }else if(c>=60 && c<=69){
            ar.add("B+");
        }
        else if(c>=50 && c<=59){
            ar.add("C");
        }else if(c>=0 && c<=49){
            ar.add("R/A");
        }else{
            ar.add("invalid");
        }System.out.println("grade :"+ar);   
        
        }
    }
}
