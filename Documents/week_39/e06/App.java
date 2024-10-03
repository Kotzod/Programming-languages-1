package week_39.e06;
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnum = random.nextInt(11);
        
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Guess a number: ");
            int guess = scanner.nextInt();
            if (guess == randomnum){
                scanner.close();
                System.out.println("SUCCESS");
                break;
                
            }
            if (guess > randomnum){
                System.out.println("Guess was too high");
            }
            if (guess < randomnum){
                System.out.println("Guess was too low");
            }
        }
    }
}
