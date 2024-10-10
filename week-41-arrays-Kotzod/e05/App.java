/*
    Exercise 5
    Directory: w41/e05
    Objective:
        - Write a program that asks the user how many names to enter
        - Next ask the user to enter the names 
        - Store the names in an array
        - Sort through the array and display the longest name entered to the user.
    Expected Output:
                How many names to enter: 3
                Enter name: John
                Enter name: Sam
                Enter name: Elizabeth
                Longest name entered was Elizabeth 
*/
import java.util.Scanner;
public class App {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names to enter: ");
        int num_of_names = scanner.nextInt();
        scanner.nextLine();
        
        
        String[] names = new String[num_of_names];
        
        for (int i = 0; i < num_of_names; i++) {
            System.out.print("Enter a name: ");
            names[i] = scanner.nextLine();
        }

        String longest = names[0];

        for (int i = 0; i < num_of_names;i++){
            if(names[i].length() > longest.length()){
                longest = names[i];
            }
        }
        System.out.println("Longest name entered was: " + longest);
    }
}