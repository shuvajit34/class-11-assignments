import java.util.Scanner;

public class sum {
    public static int sumOdd(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n % 2 == 1) {
            return n + sumOdd(n - 2);
        } else {
            return sumOdd(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int result = sumOdd(n);
        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + result);
    }
}
