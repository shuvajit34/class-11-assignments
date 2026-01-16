public class fibonocci {
    int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        fibonocci f = new fibonocci();
        System.out.print("Enter the position of Fibonacci series: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(f.fibonacci(i) + " ");
        }
        System.out.println();
        int result = f.fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
