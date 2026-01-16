import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long square = (long) n * n;
        String numStr = Integer.valueOf(n).toString();
        String sqStr = Long.valueOf(square).toString();
        if (sqStr.endsWith(numStr)) {
            System.out.println(n + " is automorphic");
        } else {
            System.out.println(n + " is not automorphic");
        }
    }
}
