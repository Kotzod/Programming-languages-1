package week_40.e04;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.nextLine();
        System.out.println("You entered: " + name);
        for(int i =1; i < name.length(); i+=2){
            System.out.println(name.charAt(i));
        }
    }
}

