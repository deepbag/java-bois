package Calculator; // parent name
import java.util.Scanner; // scanner import

public class CalculatorMain {
    public static void main(String[] args) {
        // get object
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter First Number:  ");
            int num1 = scanner.nextInt();
            System.out.print("Enter Second Number:  ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the operator (+,-,*,/): ");
            char operator = scanner.next().charAt(0);

            Calculators calci = new Calculators(num1, num2);

            double total = 0;

            switch (operator) {
                case '+':
                    total = calci.add();
                    break;
                case '-':
                    total = calci.subtract();
                    break;
                case '*':
                    total = calci.multiply();
                    break;
                case '/':
                    total = calci.divide();
                    break;
                default:
                    System.out.println("You enter wrong operator! " + operator);
                    break;

            }

            System.out.println("The final result: " + total);
        }
    }
}
