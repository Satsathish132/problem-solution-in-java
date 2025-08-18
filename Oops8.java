import java.util.*;
class game{
    void ga(){
        System.out.println("Game :");
        String g=new Scanner(System.in).next();
        System.out.println("Game started");
    }
}
class map{
    void cl(){
        int s=new Scanner(System.in).nextInt();
        int v=new Scanner(System.in).nextInt();
        int a=new Scanner(System.in).nextInt();
        System.out.println("exploring "+s+" adventurous maps!");
        System.out.println("collected "+ v+ " cues");
        if(v>a){
            System.out.println("Treasure unlocked! you win");
        }else{
            System.out.println("not enough clues! try again");
        }
    }
}

public class Oops8 {
    public static void main(String[]args){
        game g=new game();
        map m=new map();
        g.ga();
        m.cl();

    }
}
