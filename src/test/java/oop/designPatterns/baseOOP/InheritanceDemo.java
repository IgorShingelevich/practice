package oop.designPatterns.baseOOP;

    // InheritanceDemo.java
    class Vehicle {  // Parent class
        String brand = "Ford";  // Attribute common to all vehicles

        // Method common to all vehicles
        void honk() {
            System.out.println("Honk! Honk!");
        }
    }

public class InheritanceDemo extends Vehicle {  // Child class extending Parent class
    String modelName = "Mustang";  // Additional attribute unique to InheritanceDemo

    // Main method to demonstrate inheritance
    public static void main(String[] args) {
        // Step 1: Create an object of the child class
        InheritanceDemo myCar = new InheritanceDemo();
        // Step 2: Call method from the parent class
        myCar.honk();
        // Step 3: Access attributes from both parent and child classes
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}


