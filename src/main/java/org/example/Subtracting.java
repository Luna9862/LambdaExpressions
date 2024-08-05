package org.example;

public class Subtracting {
    @FunctionalInterface
    public interface SimpleOperation {
        int performOperation(int a, int b);
    }

    public static void main(String[] args) {
        // Lambda expression for subtraction
        SimpleOperation subtract = (a, b) -> a - b;

        // Test the lambda expression
        int result = subtract.performOperation(6, 3);
        System.out.println("Subtraction Result: " + result);
    }
}
