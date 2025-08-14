import java.util.Scanner;

class DiagonalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        System.out.println("Enter the elements of the 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    leftDiagonalSum += matrix[i][j];
                }
                if (i + j == 3) {
                    rightDiagonalSum += matrix[i][j];
                }
            }
        }

        System.out.println("\nSum of left diagonal elements: " + leftDiagonalSum);
        System.out.println("Sum of right diagonal elements: " + rightDiagonalSum);
        System.out.println("Difference between the sums: " + (leftDiagonalSum - rightDiagonalSum));
    }
}
