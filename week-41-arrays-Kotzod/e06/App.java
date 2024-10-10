/*
    Exercise 6 
    Directory: w41/e06
    Objective:
        - Write a program that will display a random integer between 0 and 2. 
        - Expand the program to randomly display rock, paper or scissors. 
    Expected Output:
*/
import java.util.Random;
public class App {
    public static void main(final String[] args) {
         Random random = new Random();
        int random_number = random.nextInt(3);
        String[] choices = {"Rock", "Paper", "Scissors"};
        String result = choices[random_number];
        System.out.println(result);
    }
}