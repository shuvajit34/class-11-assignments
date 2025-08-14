import java.util.Scanner;

public class checkchar {

    public static void checkCharacterType(char ch) {
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an Uppercase Character.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a Lowercase Character.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is another character.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        checkchar obj = new checkchar();
        obj.checkCharacterType(inputChar);
    }
}