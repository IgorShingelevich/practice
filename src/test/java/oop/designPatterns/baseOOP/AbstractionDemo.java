package oop.designPatterns.baseOOP;

// AbstractionDemo.java
abstract class AbstractShape {  // Abstract class
    // Abstract method with no body, to be implemented by subclasses
    abstract void draw();
}

class Circle extends AbstractShape {  // Derived class
    // Providing implementation for the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class AbstractionDemo {
    // Main method to demonstrate abstraction
    public static void main(String[] args) {
        // Step 1: Create an object of a subclass
        AbstractShape shape = new Circle();
        // Step 2: Call the implemented method
        shape.draw();  // Output: Drawing a circle
    }
}
