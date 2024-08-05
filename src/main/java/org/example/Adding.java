package org.example;


public class Adding {
    @FunctionalInterface
    public interface SimpleOperation {
        int performOperation(int a, int b);
    }
    public static void main(String[] args) {
        // Lambda expression for addition
        SimpleOperation add = (a, b) -> a + b;

        // Test the lambda expression
        int result = add.performOperation(6, 3);
        System.out.println("Addition Result: " + result);
    }
}
