package oop.designPatterns;

import lombok.Data;

public class LSPvsCOI {
//     Liskov Substitution Principle (LSP) vs Composition Over Inheritance (COI)

    //LSP: Objects in a program should be replaceable
//    Concept: Subtypes should be substitutable for their base types without altering the correctness of the program.
    // with instances of their subtypes without altering the correctness of that program.
    @Data
    public class Rectangle {
        private double width, height;

        public double area() {
            return width * height;
        }

        // Getters and setters for width and height
    }

    public class Square extends Rectangle {
        public void setSide(double side) {
            super.setWidth(side);
            super.setHeight(side);
        }
    }


    //COI: Composition over inheritance (or composite reuse principle) in object-oriented programming
    public class BirdCOI {
        private FlyableCOI flyingType;

        public void fly() {
            flyingType.fly();
        }
    }

    class FlyableCOI {
        public void fly() {
            // flying logic
        }
    }
    /*Comments

LSP: Rectangle and Square classes demonstrate that a Square is substitutable for a Rectangle
by inheriting from it and maintaining the square properties.
Contradiction: LSP encourages using inheritance while Composition Over Inheritance advises against it.*/


}
