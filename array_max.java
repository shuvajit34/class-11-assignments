import java.util.Scanner;

class Array_max {
    int[] m = new int[10];
    int max;
    int i;
    void input_data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for ( i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            m[i] = scanner.nextInt();
        }
    }

    void find_max() {
        max = m[0];
        for ( i = 1; i < 10; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
    }

    void output_data() {
        System.out.println("\nList of elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println("\n\nMaximum among the elements: " + max);
    }


    public static void main(String[] args) {
        Array_max arrayMax = new Array_max();
        arrayMax.input_data();
        arrayMax.find_max();
        arrayMax.output_data();
    }
}
