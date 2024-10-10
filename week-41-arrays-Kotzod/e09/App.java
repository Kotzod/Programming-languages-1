/*
    Exercise 6 
    Directory: w41/e06
    Objective:
        - Write a Java program to read a file (temperatures.txt) containing daily temperature data (in Celsius) into an array.
        - Calculate the average temperature, find the maximum and minimum temperatures-
        - Write the results to an output file (result.txt).
    Expected Output:
                Average Temperature: [average]
                Maximum Temperature: [max]
                Minimum Temperature: [min]
*/
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.List;
public class App {
    public static void main(final String[] args) {
        try {

            List<String> lines = Files.readAllLines(Paths.get("temperatures.txt"));

            double[] numbers = new double[lines.size()];
            double sum = 0;
            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;

            for (int i = 0; i < lines.size(); i++) {
                numbers[i] = Double.parseDouble(lines.get(i).trim());
                sum += numbers[i]; 
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            double average = sum/numbers.length;
            System.out.println("Average: " + average);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);

            String[] stringResults = new String[numbers.length + 3];
            for (int i = 0; i < numbers.length; i++) {
                stringResults[i] = String.valueOf(numbers[i]); 
            }

            stringResults[numbers.length] = "Average: " + average;
            stringResults[numbers.length + 1] = "Min: " + min;
            stringResults[numbers.length + 2] = "Max: " + max;

            Files.write(Paths.get("results.txt"),List.of(stringResults),StandardCharsets.UTF_8,StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}