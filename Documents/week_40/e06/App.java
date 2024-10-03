package week_40.e06;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome test, please enter some text:");
        String text = scanner.nextLine();
        String normaltext = text.toLowerCase();
        String reversedtext = "";
        for (int i = normaltext.length()-1; i >= 0; i--){
            reversedtext += normaltext.charAt(i);
        }
        System.err.println(reversedtext);
        if (normaltext.equals(reversedtext)){
            System.out.println(normaltext + " is a palindrome");
        } else {
            System.out.println(normaltext + " is not a palindrome");
        }

    }
}
