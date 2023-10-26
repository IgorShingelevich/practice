package oop.designPatterns;

public class LSPvsCOI {
//     Liskov Substitution Principle (LSP) vs Composition Over Inheritance (COI)

    //LSP: Objects in a program should be replaceable
    // with instances of their subtypes without altering the correctness of that program.

    public class BirdLSP {
        public void fly() {
            // flying logic
        }
    }

    public class SparrowLSP extends BirdLSP {
        // Sparrow can replace BirdLSP everywhere if only BirdLSP methods are used
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

LSP: A Sparrow can always replace a BirdLSP.
Composition: A BirdLSP has a FlyableCOI behavior instead of inheriting it.
Contradiction: LSP encourages using inheritance while Composition Over Inheritance advises against it.*/



}
