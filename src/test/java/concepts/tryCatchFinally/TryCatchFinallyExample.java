package concepts.tryCatchFinally;

import java.io.IOException;

public class TryCatchFinallyExample {
    public static void main(String[] args) throws IOException {
        try {
            // Risky code that might throw an exception
            throw new IOException("IO Exception occurred");
        } catch (IOException e) {
            // Handling exception
            System.out.println(e.getMessage());
        }
        //regardless of whether an exception is thrown or not, the finally block will always execute
        finally {
            // This block will always execute
            System.out.println("Finally block executed");
        }
    }
}
