import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=x*a;
        int q=(x*b)-100;
        int r=(p-q);
        System.out.println(r);
}
}

//Each Sunday, a newspaper agency sells x copies of a certain newspaper for Rs.a per copy.

//The cost to the agency of each newspaper is Rs.b. The agency pays a fixed cost for storage,

//delivery and so on of Rs.100 per Sunday. The newspaper agency wants to calculate the profit obtained on Sundays.

 //Can you please help them out by writing a program to compute the profit given x, a and b.


//Input Format:
//Input consists of 3 integers --- x, a and b.
//X is the number of copies sold, a is the cost per copy and b is the cost the agency spends per copy.

//Output Format:
//Refer Sample Input and Output for exact formatting specifications.

