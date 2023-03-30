package LearnPath.OOP.Class;

/*
 * In Java, a method is a set of instructions that perform a specific task. 
 * Methods are defined within a class and are used to encapsulate behavior that can be 
 * reused across different parts of the program.
 * Methods can be declared with a return type or void. If a method has a return type, 
 * it must return a value of that type. If a method is declared as void, it does not return a value. 
 * Methods can also take zero or more parameters, which are passed in when the method is called.
 */

public class Methods {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Methods calc = new Methods();
        int sum = calc.add(3, 4);
        System.out.print(sum);
    }
}
