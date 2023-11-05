package oop.designPatterns.baseOOP;

public class PolymorphismDemo {

    // Compile-time polymorphism (Method Overloading)

    // This method takes an int parameter
    public void display(int number) {
        System.out.println("Displaying an integer: " + number);
    }

    // This method takes a String parameter
    // Same method name "display" but different parameter type
    public void display(String message) {
        System.out.println("Displaying a string: " + message);
    }

    // Runtime polymorphism (Method Overriding)

    // Parent class with a method to override
    static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class 1: Dog
    static class Dog extends Animal {
        // Overriding the makeSound method
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // Child class 2: Cat
    static class Cat extends Animal {
        // Overriding the makeSound method
        void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        // Create an object of the PolymorphismDemo class
        PolymorphismDemo demo = new PolymorphismDemo();

        // Demonstrate compile-time polymorphism
        demo.display(100);  // Calls the method that takes an int parameter
        demo.display("Hello");  // Calls the method that takes a String parameter

        // Demonstrate runtime polymorphism

        // Create an Animal reference but Dog object
        Animal myAnimal = new Dog();
        myAnimal.makeSound();  // Outputs "Dog barks"

        // Create an Animal reference but Cat object
        myAnimal = new Cat();
        myAnimal.makeSound();  // Outputs "Cat meows"
    }
}


