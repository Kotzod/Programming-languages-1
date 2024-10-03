package week_40.e01;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        if( name.equals("Louis") ){
            System.out.println("Are you french?");
        }else{
            System.out.println("You have a great time");
        }
    }
}
