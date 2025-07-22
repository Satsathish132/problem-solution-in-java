import java.util.Scanner;
public class ex7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        System.out.println(len*bre+"sqm");
        System.out.println(2*(len+bre)+"m");
    }
}

/*Write a Java program that reads the length and breadth of a rectangle from the user and then:

Calculates the area of the rectangle.

Calculates the perimeter of the rectangle.

Prints the area followed by sqm (square meters).

Prints the perimeter followed by m (meters).

🧾 Input Format:
Two integers:

First line: length of the rectangle

Second line: breadth of the rectangle

📤 Output Format:
First line: area of the rectangle followed by sqm

Second line: perimeter of the rectangle followed by m */