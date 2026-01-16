import java.util.Scanner;

public class productmatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] C = new int[4][4];

        System.out.println("Enter elements of first 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Product matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
