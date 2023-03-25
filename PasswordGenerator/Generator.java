package PasswordGenerator;

import java.util.Random;

public class Generator {
    private int length;

    public Generator(int length) {
        this.length = length;
    }

    public String passwordGenerate() {
        String element = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";

        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(element.length());
            password.append(element.charAt(index));
        }
        return password.toString();
    }

}
