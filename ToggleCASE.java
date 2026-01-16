import java.util.*;

class ToggleCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String s = sc.nextLine();
        
        String result = ""; 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            }
            else if (Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            }
            else {
                result = result + ch;
            }
        }
        
        System.out.println("Sentence in Toggle Case: " + result);
    }
}