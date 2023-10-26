package oop.designPatterns;

public class SRPvsOCP {
//  Single Responsibility Principle (SRP) vs Open/Closed Principle

//  SRP: A class should have only one reason to change.
// This class has one job: to calculate the area of a rectangle.
public class RectangleAreaCalculator {
    public double calculateArea(double width, double height) {
        return width * height;
    }
}

// OCP: Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
// This class is open for extension but closed for modification.
public abstract class Shape {
    public abstract double area();
}

    // A new shape can be added without changing the existing code.
    public class Rectangle extends Shape {
        private double width;
        private double height;

        // ...

        @Override
        public double area() {
            return width * height;
        }
    }

    /*Comments

SRP: RectangleAreaCalculator has one job: to calculate the area of a rectangle.
OCP: Shape can have more shapes like Circle, Triangle without needing to modify it.
Contradiction: If we need to add more features related to a rectangle in the SRP example,
 we may end up modifying RectangleAreaCalculator often, which contradicts the OCP principle of being closed for modification.*/


}
