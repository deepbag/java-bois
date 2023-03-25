package Age; // parent folder 
import java.util.Scanner; // scanner import

public class AgeMain {

    public static void main(String[] args) {
        // scanner object
        Scanner scanner = new Scanner(System.in);
        // print method
        System.out.print("Enter your birth year: ");
        // get int value from terminal
        int birthYear = scanner.nextInt();
        // use age calulator class
        AgeCalculator calculator = new AgeCalculator(birthYear);
        // use getage object via class
        int age = calculator.getAge();
        // printing age
        System.out.println("Your age is: " + age);
    }
}
