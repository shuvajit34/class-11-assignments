import java.util.Scanner;

public class reverse {
    public static int reverseNumber(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverseNumber(n / 10, rev * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = reverseNumber(n, 0);
        System.out.println("Reverse of " + n + " is: " + result);
    }
}
