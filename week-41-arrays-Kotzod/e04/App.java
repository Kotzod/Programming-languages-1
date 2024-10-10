/*
    Exercise 4
    Directory: w41/e04
    Objective:
        - Write a program that asks the user to enter 10 
        integers and store it in an array. 
        - Calculate the sum of the values entered in a 
        separate loop and finally display the sum and 
        average of the values.
    Expected Output:
                Enter a number: 5
                Enter a number: 7
                Sum: 12
                Average: 6 
*/
import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Please enter 10 integers:");
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt(); 
            sum = sum +numbers[i];
        }
        double average = sum/10;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}