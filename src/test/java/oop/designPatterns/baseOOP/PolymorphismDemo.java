package oop.designPatterns.baseOOP;

    // PolymorphismDemo.java
    class Animal {  // Base class
        // Generic method for making a sound
        void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

class Dog extends Animal {  // Derived class
    // Override the method to provide specific behavior for Dog class
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class PolymorphismDemo {
    // Main method to demonstrate polymorphism
    public static void main(String[] args) {
        // Step 1: Declare a reference of type Animal but object of type Dog
        Animal myAnimal = new Dog();
        // Step 2: Call the method, polymorphic behavior ensures Dog's makeSound is called
        myAnimal.makeSound();  // Output: Bark
    }
}

