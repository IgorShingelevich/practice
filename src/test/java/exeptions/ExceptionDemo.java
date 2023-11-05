package exeptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {
        // 1. Unchecked Exception
        try {
            int result = divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        }

        // 2. Checked Exception
        try {
            FileReader fileReader = new FileReader("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught a file not found exception: " + e.getMessage());
        }

        // 3. Multiple Exceptions
        try {
            // Some code that may throw multiple exceptions
            throwMultipleExceptions();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Caught an arithmetic or null pointer exception: " + e.getMessage());
        }

        // 4. Using Finally
        try {
            // Some code that may throw an exception
        } finally {
            System.out.println("This will always be executed.");
        }

        // 5. Custom Exception
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void throwMultipleExceptions() throws ArithmeticException, NullPointerException {
        // Code that may throw multiple exceptions
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be greater than or equal to 18");
        }
    }
    /*public static void validateAge2(int age) throws InvalidAgeException {
        switch (age){
            case (age < 18):
                throw new InvalidAgeException("Age must be greater than or equal to 18");
            case (age >200):
                throw new InvalidAgeException("Impossible  people not live more than 200 years");
            case (age<=0):
                throw new InvalidAgeException("Impossible  people not live less than 0 years");
        }
    }*/
}

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
