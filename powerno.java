public class powerno {
    int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        powerno p = new powerno();
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        int result = p.power(base, exponent);
        System.out.println("Result of " + base + " raised to the power of " + exponent + " is: " + result);
    }
}