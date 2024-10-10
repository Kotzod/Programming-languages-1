/*
    Exercise 7
    Directory: w41/e07
    Objective:
    Expected Output: 
*/

public class App {
    public static void main(String [] args) {
        //System.out.println(args[0]);
        //System.out.println(args[1]);

        int num1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int num2 = Integer.parseInt(args[2]);

        int result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":  
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("invalid");
                break;
        }
        System.out.println(result);
    }
}