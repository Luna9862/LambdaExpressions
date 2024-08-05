package org.example;

public class Dividing {
    @FunctionalInterface
    public interface SimpleOperation {
        int performOperation(int a, int b);
    }
        public static void main(String[] args) {
            // Lambda expression for division
            SimpleOperation divide = (a, b) -> {
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return a / b;
            };

            try {
                int result = divide.performOperation(6, 3);
                System.out.println("Division Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
