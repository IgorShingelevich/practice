package oop.designPatterns.singleton;

// Declare an enum type with one constant named INSTANCE
// Enum types in Java are inherently Singleton by their design.
public enum EnumSingleton {

    // This is the single instance of EnumSingleton
    // Enum ensures that JVM creates an inherently thread-safe, single instance
    INSTANCE;

    // Instance variable
    // This is an example to show that the enum singleton can also have state
    private int value;

    // Method to set value
    // This method allows us to set the state of the enum singleton
    // It's a demonstration that not just the structure but also the behavior (methods) can be defined in a singleton
    public void setValue(int value) {
        this.value = value;
    }

    // Method to get value
    // This method allows us to retrieve the state of the enum singleton
    // It's a further demonstration that the singleton can maintain and provide state
    public int getValue() {
        return value;
    }
}

/*Enum-Based Singleton Explained:
public enum EnumSingleton: We declare the type as an enum to leverage Java's built-in enum features
for ensuring that only one instance is created. Enums are inherently singletons in Java.

INSTANCE;: This is the single instance of the EnumSingleton.
 The Java runtime ensures that this instance is created only once,
  automatically making it thread-safe and ensuring it is a Singleton.
  You cannot create another INSTANCE due to the inherent design of enums.

private int value;: An instance variable is declared to show that the singleton can have state.
Enums can have instance variables like any other Java class.

public void setValue(int value) and public int getValue():
These are methods that allow you to interact with the Singleton's state.
 They are declared as normal methods would be in a Java class.

Advantages of Enum-based Singleton:

Inherent Thread-Safety: Java ensures that enum values are instantiated only once,
 making them inherently thread-safe without requiring explicit synchronization.

Simplicity: The code is simpler to write and read.
You don't have to worry about double-checked locking or other complex singleton implementations.

Global Access: Just like the class-based approach,
you can access the Singleton from any point in your application.

State and Behavior: The enum Singleton can also have state (instance variables) and behavior (methods),
 just like a class-based Singleton.

By following this design, the Enum-based Singleton remains simple
while still achieving the Singleton pattern's requirements:
 a single, globally accessible instance with optional state and behavior.*/