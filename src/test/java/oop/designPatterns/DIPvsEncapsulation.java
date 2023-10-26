package oop.designPatterns;

public class DIPvsEncapsulation {

    public static void main(String[] args) {
        DIPvsEncapsulation example = new DIPvsEncapsulation();

        // Using DIP
        IWriter fileWriter = example.new FileWriter();
        LoggerDIP loggerDIP = example.new LoggerDIP(fileWriter);
        loggerDIP.log("This is a DIP log message");

        // Using Encapsulation
        LoggerEncapsulation loggerEncapsulation = example.new LoggerEncapsulation();
        loggerEncapsulation.log("This is an Encapsulation log message");
    }

    // Dependency Inversion Principle (DIP) Approach
    interface IWriter {
        void write(String content);
    }

    class FileWriter implements IWriter {
        @Override
        public void write(String content) {
            System.out.println("Writing to file: " + content);
        }
    }

    class LoggerDIP {
        private final IWriter writer;

        public LoggerDIP(IWriter writer) {
            this.writer = writer;
        }

        public void log(String message) {
            writer.write(message);
        }
    }

    // Encapsulation Approach
    class LoggerEncapsulation {
        public void log(String message) {
            writeToFile(message);
        }

        private void writeToFile(String message) {
            System.out.println("Writing to file: " + message);
        }
    }

    /* Comments

    DIP Approach:
    We define an interface IWriter which declares a write method.
    Then we implement this interface in a FileWriter class.
    LoggerDIP class depends on IWriter, not the concrete FileWriter class, adhering to DIP.
    This allows for easy substitution of the writer component without changing the LoggerDIP class.

    Encapsulation Approach:
    LoggerEncapsulation directly contains the writeToFile method and no interfaces are used.
    The method writeToFile is private, encapsulating the details of how logging is implemented.
    Client code just uses the public log method without knowing how logging is done internally.

    Code Breakdown
Dependency Inversion Principle (DIP) Approach
Interface IWriter: We define an interface with a write method. This serves as a contract for writing content, making our LoggerDIP class dependent on abstractions, not concrete implementations.

FileWriter Class: We implement the IWriter interface in a class called FileWriter.

LoggerDIP Class: This class depends on the IWriter interface. It doesn't know how the writing is done; it just knows that it can call write.

Encapsulation Approach
LoggerEncapsulation Class: This class doesn't depend on any interface. It directly contains the logic for writing to a file, encapsulating this detail within it.

Private Method: The writeToFile method is private, meaning it's not exposed to the outside world. The log method serves as the public API, hiding the details of how logging is actually implemented.

Base4OOP Method
Using DIP: We instantiate a FileWriter and a LoggerDIP, then log a message using DIP. If we want to change how the writing is done, we can do so without modifying the LoggerDIP class.

Using Encapsulation: We instantiate a LoggerEncapsulation and log a message. The client doesn't know how the logging is done, demonstrating encapsulation.

So, in summary, DIP is about inverting the dependency on concrete classes to depend on abstractions, which makes the system easier to extend and modify. On the other hand, encapsulation is about hiding the internal workings of a class, making it easier to use. Both are important principles in object-oriented design but address different concerns.

    */
}
