package week_39.e01;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();
        int mult = 0;
        for(int i = 0; i<11; i++){
            mult = number * i;
            System.out.println(i + " x " + number + " = " + mult);
        }
    }
}
