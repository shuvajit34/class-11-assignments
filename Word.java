import java.util.Scanner;
public class Word {
    public void sortLetters(String w) {
        int len = w.length();
        char ch[] = new char[len];
        for (int i = 0; i < len; i++) {
            ch[i] = w.charAt(i);
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (ch[j] > ch[j + 1]) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted word: ");
        for (int i = 0; i < len; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = sc.next();

        Word obj = new Word();
        obj.sortLetters(word);
    }
}