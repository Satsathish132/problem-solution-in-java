import java.util.*;
public class ex14
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int R1 = sc.nextInt();  
        int N = sc.nextInt();   
        int R2 = sc.nextInt();  
        int X = sc.nextInt();  
        int t_hours=  (int)Math.ceil(X/60.);
        if (t_hours<=N){
            System.out.println(N*R1);
        }else{
            int cost=N*R1+(t_hours-N)*R2;
            System.out.println(cost);
        }
		
	
	
	}
}
/*A customer is using a computer at an internet café that charges different rates:

₹R1 per hour for the first N hours.

₹R2 per hour after N hours.

You are given:

R1: Rate for the first N hours.

N: Number of hours at the standard rate.

R2: Rate for each additional hour beyond N.

X: Total time used in minutes.

Write a program to calculate and print the total cost for the customer's usage, rounded up to the next hour if minutes are not exactly a multiple of 60.

🧾 Input Format:
First line: An integer R1 (rate for first N hours)

Second line: An integer N (number of hours at rate R1)

Third line: An integer R2 (rate for additional hours)

Fourth line: An integer X (total usage time in minutes)

📤 Output Format:
A single integer: the total cost of usage*/