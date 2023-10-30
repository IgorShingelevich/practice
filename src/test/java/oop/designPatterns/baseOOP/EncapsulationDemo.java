package oop.designPatterns.baseOOP;

// EncapsulationDemo.java
// EncapsulationDemo.java
public class EncapsulationDemo {

    // Step 1: Declare private attributes
    private String name;  // Private attribute to hold the name
    private int age;  // Private attribute to hold the age

    // Step 2: Constructor to initialize the attributes
    public EncapsulationDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Step 3: Provide public methods to access and modify the private attributes
    // Public method to get the name
    public String getName() {
        return name;
    }

    // Public method to increment the age
    public void haveBirthday() {
        age += 1;  // Increment age by 1
    }

    // Public method to get the age
    public int getAge() {
        return age;
    }

    // Main method to demonstrate encapsulation
    public static void main(String[] args) {
        // Create an object of EncapsulationDemo
        EncapsulationDemo person = new EncapsulationDemo("John", 25);
        person.haveBirthday();  // Call method to modify age
        // Print out the name and age
        System.out.println(person.getName() + " is now " + person.getAge() + " years old.");
    }
}
