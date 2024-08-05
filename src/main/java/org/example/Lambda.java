package org.example;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Lambda {

    // Task 2: Define custom functional interfaces

    @FunctionalInterface
    interface MyFunctionalInterface1 {
        void performAction(String message);
    }

    @FunctionalInterface
    interface MyFunctionalInterface2 {
        int calculate(int x, int y);
    }

    @FunctionalInterface
    interface MyFunctionalInterface3 {
        boolean isEven(int number);
    }

    // Task 3: Use built-in functional interfaces

    public static void main(String[] args) {
        // Task 2: Use custom functional interfaces with lambda expressions

        // MyFunctionalInterface1: Print a message
        MyFunctionalInterface1 printMessage = (message) -> System.out.println("Message: " + message);
        printMessage.performAction("Hello, This is part 2 and 3!");

        // MyFunctionalInterface2: Add two integers
        MyFunctionalInterface2 add = (x, y) -> x + y;
        System.out.println("Sum of 5 and 10: " + add.calculate(5, 10));

        // MyFunctionalInterface3: Check if a number is even
        MyFunctionalInterface3 checkEven = (number) -> number % 2 == 0;
        System.out.println("Is 4 even? " + checkEven.isEven(4));
        System.out.println("Is 7 even? " + checkEven.isEven(7));

        // Task 3: Use built-in functional interfaces with lambda expressions

        // Predicate: Check if a number is positive
        Predicate<Integer> isPositive = (number) -> number > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5));
        System.out.println("Is -3 positive? " + isPositive.test(-3));

        // Function: Convert a string to uppercase
        Function<String, String> toUpperCase = (str) -> str.toUpperCase();
        System.out.println("Uppercase 'hello': " + toUpperCase.apply("hello"));

        // Consumer: Print an integer
        Consumer<Integer> printInteger = (num) -> System.out.println("Number: " + num);
        printInteger.accept(42);

        // Supplier: Provide a default greeting message
        Supplier<String> getGreeting = () -> "Hello, world!";
        System.out.println("Greeting message: " + getGreeting.get());
    }
}