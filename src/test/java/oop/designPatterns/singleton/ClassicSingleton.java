package oop.designPatterns.singleton;

// Declare a class named ClassicSingleton
// A separate class is created to ensure that the Singleton pattern is encapsulated in its own type.
public class ClassicSingleton {

    // Declare a static variable to hold the single instance of ClassicSingleton
    // A static variable ensures that the instance is tied to the class itself rather than any individual object.
    private static ClassicSingleton instance;

    // Instance variable
    // This is an example to show that the singleton can maintain state.
    private int value;

    // Private constructor prevents instantiation from other classes
    // By making the constructor private, we are ensuring that no other class can instantiate this class, maintaining its Singleton property.
    private ClassicSingleton() {
    }

    // Public method to get the single instance of ClassicSingleton
    // A public method provides a global point of access to the instance.
    public static synchronized ClassicSingleton getInstance() {

        // Check if instance is null
        // The first time getInstance() is called, the instance will be null.
        if (instance == null) {

            // Create a new instance if it is null
            // Only if the instance is null, a new instance is created.
            // This ensures that only one instance of the class exists.
            instance = new ClassicSingleton();
        }

        // Return the single instance
        // This returns the single instance of ClassicSingleton, ensuring that this instance is used across the application.
        return instance;
    }

    // Method to get value
    // This method allows us to get the state of the singleton, demonstrating again that the singleton can have state.
    public int getValue() {
        return value;
    }

    // Method to set value
    // This method allows us to set the state of the singleton.
    // Being able to set (and get) the state demonstrates that it's not just the structure of the singleton that's important, but also its behavior.
    public void setValue(int value) {
        this.value = value;
    }
}
/*The ClassicSingleton class offers various advantages:

Lazy Initialization: The instance is created only when the getInstance() method is called.
This saves memory and is an advantage over Enum-based Singleton if the instance is heavy to create.

State Management: As demonstrated by the value field, a class-based Singleton can manage state,
 which can be modified and accessed via methods.

Flexibility: You have more control over the initialization process.
 For example, you could add parameters to getInstance() to construct the Singleton with specific settings,
 although this would make it more complex and could break the Singleton contract if not done carefully.

Thread-Safety: By using synchronized for the getInstance() method, you make the method thread-safe,
ensuring that only one instance will be created even in a multi-threaded environment.
However, this comes at the cost of some performance overhead.

Each of these steps is designed to maintain the Singleton pattern's key properties:
a single, lazily-initialized instance with controlled, global access.*/