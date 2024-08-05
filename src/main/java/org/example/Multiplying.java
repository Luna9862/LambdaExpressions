package org.example;

public class Multiplying {
    @FunctionalInterface
    public interface SimpleOperation {
        int performOperation(int a, int b);
    }

    public static void main(String[] args) {
        // Lambda expression for multiplication
        SimpleOperation multiply = (a, b) -> a * b;

        // Test the lambda expression
        int result = multiply.performOperation(6, 3);
        System.out.println("Multiplication Result: " + result);
    }
}
