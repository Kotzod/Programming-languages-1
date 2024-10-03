package week_40.e07;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Input: ");
            String password = scanner.nextLine();

            boolean uppercase = false;
            boolean lowercase = false;
            boolean digit = false;
            
            if (password.length() >= 8) {
                for (int i = 0; i < password.length(); i++) {
                    char currentcharacter = password.charAt(i);
                    if (Character.isUpperCase(currentcharacter)) {
                        uppercase = true;
                    } else if (Character.isLowerCase(currentcharacter)) {
                        lowercase = true;
                    } else if (Character.isDigit(currentcharacter)) {
                        digit = true;
                    }
                }
                if (uppercase && lowercase && digit) {
                    System.out.println("Password is valid.");
                    break; 
                } else {
                    System.out.println("Password is invalid. It must contain at least one uppercase letter, one lowercase letter, and one digit.");
                }
            } else {
                System.out.println("Password is invalid. It must be at least 8 characters long.");
            }
        }
    }
}
