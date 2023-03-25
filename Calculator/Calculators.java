package Calculator;

public class Calculators {
    // initializing int variable
    private int number1;
    private int number2;

    // object to get and set values 
    public Calculators(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // calculate numbers +
    public int add() {
        int total = number1 + number2;
        return total;
    }
    // calculate numbers -
    public int subtract() {
        int total = number1 - number2;
        return total;
    }
    // calculate numbers *
    public int multiply() {
        int total = number1 * number2;
        return total;
    }
    // calculate numbers /
    public int divide() {
        int total = number1 / number2;
        return total;
    }
}
