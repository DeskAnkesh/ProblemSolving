package com.practice;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
