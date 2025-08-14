import java.util.Scanner;

public class binarysrch {

    public static void searchNumber(int m[], int n) 
    {
         for (int i = 0; i < m.length - 1; i++)
        {
            for (int j = 0; j < m.length - i - 1; j++)
             {
                if (m[j] > m[j + 1]) 
                {
                    int temp = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = temp;
                }
            }
        }

        int low = 0;
        int high = m.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (m[mid] == n) {
                found = true;
                break;
            } else if (m[mid] < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Search Successful: The number is present in the array.");
        } else {
            System.out.println("Search Unsuccessful: The number is not present in the array.");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner1.nextInt();
        }
        System.out.print("Enter the number you want to search: ");
        int searchNumber = scanner1.nextInt();
        binarysrch obj = new binarysrch();
        obj.searchNumber(numbers, searchNumber);
    }
}
