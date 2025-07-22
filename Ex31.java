import java.util.Scanner;
public class Ex31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int series = 2;
        for(int i = 0;i <= n;i++ ){
            series = series + (i * 13);
            System.out.println(series);
        }

    }
}
