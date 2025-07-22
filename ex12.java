import java.util.Scanner;
public class ex12
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		a=a.toLowerCase();
		
		if(a.equals("scissor")){
		    System.out.println("Rock");
		}
		else if(a.equals("paper")){
		    System.out.println("Scissor");
		}
		else if(a.equals("rock")){
		    System.out.println("Paper");
		}
		else{
		    System.out.println("Invalid Input");
		}
	
	}
}
/* write program to play a rock paper sciisor*/