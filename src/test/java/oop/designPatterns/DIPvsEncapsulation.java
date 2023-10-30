package oop.designPatterns;

public class DIPvsEncapsulation {
    // DIP
    // Dependency Inversion Principle (DIP) Approach
    // Concept: High-level modules should not depend on low-level modules. Both should depend on abstractions.
    public interface Storage {
        void saveData(String data);
    }

    public class DatabaseStorage implements Storage {
        @Override
        public void saveData(String data) {
            // ...
        }
    }

    public class Application {
        private Storage storage;

        public Application(Storage storage) {
            this.storage = storage;
        }

        public void save(String data) {
            storage.saveData(data);
        }
    }

    // Encapsulation Approach
    // Concept: Bundling the data and the methods that operate on the data into a single unit or class,
    // and restricting the direct access to some of the object's components,
    // which is a means of preventing unintended interference and misuse of the methods.

    public class EncapsulatedApplication {
        private String databaseUrl;

        public EncapsulatedApplication(String databaseUrl) {
            this.databaseUrl = databaseUrl;
        }

        public void save(String data) {
            connectToDatabaseAndSave(data);
        }

        private void connectToDatabaseAndSave(String data) {
            // ... connect to database using databaseUrl
            // ... save data
        }
    }

    /* Comments

    DIP Approach:
    In this example, the Application class depends on the Storage interface,
    not on a specific storage implementation, adhering to the Dependency Inversion Principle.
    Storage interface provides an abstraction for saving data.
    DatabaseStorage implements Storage, providing a specific implementation.
    Application class depends on the Storage interface, allowing for different Storage implementations to be used,
    demonstrating inversion of dependency.

    Encapsulation Approach:
    The EncapsulatedApplication class demonstrates the encapsulation approach
     by bundling the data saving behavior within the class itself.
      It has a private method connectToDatabaseAndSave that encapsulates the logic of connecting to a database and saving data.
       The public method save calls this private method, thus restricting direct access to the database connection and save operation,
        and demonstrating encapsulation. This design prevents unintended interference and misuse of the data saving behavior.
    In the encapsulation approach, the EncapsulatedApplication class encapsulates the data saving behavior within itself.
    It has a method connectToDatabaseAndSave which is private and is responsible for connecting to the database and saving the data.
    The save method is a public method which calls the private connectToDatabaseAndSave method,
     demonstrating encapsulation of the data saving behavior.
    This way, the data saving behavior is bundled within the EncapsulatedApplication class,
    and the details of data saving are hidden from outside the class.

    */
}
