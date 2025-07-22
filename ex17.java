import java.util.Scanner;
public class ex17{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int birthyear = sc.nextInt();
        int currentyear = sc.nextInt();
        if(currentyear>birthyear){
            System.out.println(currentyear-birthyear);
        }else{
            System.out.println((100-birthyear)+currentyear);
        }
    }
}
/*Write a Java program to calculate a person's age based on their birth year and the current year. The twist is that the years are given as last two digits only (i.e., in YY format, not YYYY).

If the current year is numerically less than the birth year, assume the years are from different centuries (e.g., birth year is 99 and current year is 04 → age is 5).

🧾 Input Format:
First line: Two-digit integer representing birth year

Second line: Two-digit integer representing current year

📤 Output Format:
An integer: the calculated age*/