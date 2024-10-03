package week_39.e05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tests = 0;
        double average = 0;
        int i = 0;
        while (true){
            System.out.println("Give me a test score(-1 to quit)");
            int test = scanner.nextInt();

            if (test == -1){
                scanner.close();
                System.out.println("Summary");
                System.out.println("_ _ _ _");
                break;
            }
            tests = tests + test;
            i++;
            average = tests/i;
            System.out.println("Average" + average);

        }
        System.out.println("Tests: " + i);
        System.out.println("Average: " + average);
    }
}
