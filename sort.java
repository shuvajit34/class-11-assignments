import java.util.Scanner;

class Sort {
    int[] m = new int[10];
    int i, j, temp;
    

    void input_data() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            m[i] = scanner.nextInt();
        }
    }

    void arrange() {
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (m[j] > m[j + 1]) {
                    temp = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = temp;
                }
            }
        }
    }

    void output_data() {
        System.out.println("\nArray elements in ascending order:");
        for (i = 0; i < 10; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Sort sort1 = new Sort();
        sort1.input_data();
        sort1.arrange();
        sort1.output_data();
    }
}