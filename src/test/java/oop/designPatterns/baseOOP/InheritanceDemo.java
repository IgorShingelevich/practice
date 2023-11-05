package oop.designPatterns.baseOOP;

    // InheritanceDemo.java
// Single Inheritance
// Parent class
    class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

// Child class inheriting from Animal class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Hierarchical Inheritance
// Another Child class also inheriting from Animal class
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Multiple Inheritance using Interfaces

// First interface
interface Drawable {
    void draw();
}

// Second interface
interface Resizable {
    void resize();
}

// Class implementing multiple interfaces
class Circle implements Drawable, Resizable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public void resize() {
        System.out.println("Resizing the circle.");
    }
}

// Main class to demonstrate the different types of inheritance
 class InheritanceTypesDemo {
    public static void main(String[] args) {
        // Single Inheritance demonstration
        Dog myDog = new Dog();
        myDog.eat();  // Method from Animal class
        myDog.bark();  // Method from Dog class

        // Hierarchical Inheritance demonstration
        Cat myCat = new Cat();
        myCat.eat();  // Method from Animal class
        myCat.meow();  // Method from Cat class

        // Multiple Inheritance using Interfaces demonstration
        Circle myCircle = new Circle();
        myCircle.draw();  // Method from Drawable interface
        myCircle.resize();  // Method from Resizable interface
    }
}



