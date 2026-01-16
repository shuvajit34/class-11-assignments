import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());
        String sentence = sb.toString().toLowerCase();
        int count = 0;
        int index = sentence.indexOf("the");
        while (index != -1) {
            count++;
            index = sentence.indexOf("the", index + 1);
        }
        System.out.println("Frequency of 'the': " + count);
    }
}