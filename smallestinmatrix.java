import java.util.Scanner;

class SmallestInMatrix {
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

        int lowestNumber = matrix[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] < lowestNumber) {
                    lowestNumber = matrix[i][j];
                }
            }
        }

        System.out.println("\nStored matrix elements:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nThe lowest number in the matrix is: " + lowestNumber);
    }
}
