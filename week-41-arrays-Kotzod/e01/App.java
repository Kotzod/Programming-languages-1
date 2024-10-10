/*
    Exercise 1
    Directory: w41/e01
    Objective:
        - Write a program that will create an array 
        with the values 12, 99, 32. 
        - Display the first(12) and the last(32) 
        number.
        - Extend the program by also displaying 
        the length of the array.
    Expected Output:
                12
                32
                Length: 3
*/

public class App {
    public static void main(final String[] args) {
        int[] array = {12, 99, 32};
        System.out.println(array[0]);
        System.out.println(array[2]);
        int length = array.length;
        System.out.println("Length: " + length);
    }
}