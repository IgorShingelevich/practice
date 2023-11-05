package concepts.tryCatchFinally;

import java.io.IOException;

public class TryFinallyExample {
    public static void main(String[] args) throws IOException {
        try {
            // Risky code that might throw an exception
            throw new IOException("IO Exception occurred");
        } finally {
            // This block will always execute
            System.out.println("Finally block executed");
        }
    }
}
