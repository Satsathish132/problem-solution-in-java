import java.util.Scanner;

public class ex22 {
    
    
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int itemId = sc.nextInt(); 

        int originalId = itemId;
        int sum = 0;

        while (itemId > 0) {
            int digit = itemId % 10;
            sum += factorial(digit);
            itemId /= 10;
        }

        if (sum == originalId) {
            System.out.println("Rare Item");
        } else {
            System.out.println("Common Item");
        }

        sc.close();
    }
}