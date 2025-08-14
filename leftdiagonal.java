import java.util.Scanner;

class LeftDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][4];

        System.out.println("Enter the elements of the 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix with left diagonal elements replaced by zero:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(0 + "\t");
                } else {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}