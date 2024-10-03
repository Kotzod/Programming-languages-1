package week_39.e04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please give me a number(0 to quit): ");
            int number = scanner.nextInt();
            if (number == 0){
                scanner.close();
                break;
            }
            if (number % 2 == 0){
                System.out.println("Even number");
            }else {
                System.out.println("odd number");
            }
        }
    }
}

