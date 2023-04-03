package LearnPath.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12090", 3445.5);
        String numString = bankAccount.getAccountNumber();
        double amount = bankAccount.getBalance();
        System.out.println("Account Number " + numString);
        System.out.println("Balance " + amount);
    }
}
