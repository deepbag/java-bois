package PasswordGenerator;

import java.util.Scanner;

public class GeneratorMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter length of password:  ");
            int length = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            Generator generatepass = new Generator(length);
            String randomItem = generatepass.passwordGenerate();
            System.out.print("Random Password: " + randomItem);
        }

    }
}
