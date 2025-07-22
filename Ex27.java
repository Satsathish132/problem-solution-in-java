import java.util.Scanner;
public class Ex27 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int total = 0;
        int turn =0; 


        while(total <=target){
             int score = sc.nextInt();
             total+=score;
             turn++;
        }System.out.println(turn);


}
}
