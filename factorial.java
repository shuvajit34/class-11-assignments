import java.util.Scanner;
public class factorial {
    int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    factorial f = new factorial();
    System.out.print("Enter a number to compute its factorial: ");
    int num = sc.nextInt();
    int result = f.fact(num);
    System.out.println("Factorial of " + num + " is: " + result);
}
}
