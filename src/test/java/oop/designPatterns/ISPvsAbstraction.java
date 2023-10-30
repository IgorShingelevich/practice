package oop.designPatterns;

public class ISPvsAbstraction {
    // Interface Segregation Principle (ISP) vs Abstraction

    // ISP Approach
    interface Flyable {
        void fly();
    }

    interface Eater {
        void eat();
    }

    interface NoiseMaker {
        void makeNoise();
    }

    // Abstraction Approach
    interface Animal {
        void move();

        void eat();

        void makeSound();
    }

    class SeagullISP implements Flyable, Eater, NoiseMaker {
        @Override
        public void fly() {
            System.out.println("Seagull flying");
        }

        @Override
        public void eat() {
            System.out.println("Seagull eating");
        }

        @Override
        public void makeNoise() {
            System.out.println("Seagull making noise");
        }
    }

    class SeagullAbstract implements Animal {
        @Override
        public void move() {
            System.out.println("Seagull moving");
        }

        @Override
        public void eat() {
            System.out.println("Seagull eating");
        }

        @Override
        public void makeSound() {
            System.out.println("Seagull making sound");
        }
    }


    /*Comments

ISP Approach: We define three small interfaces (Flyable, Eater, NoiseMaker),
 each responsible for a very specific behavior.
  The SeagullISP class then implements these interfaces.
  This way, if a client class is only interested in the flying aspect of a Seagull,
   it can just depend on the Flyable interface.
    interfaces are small and focused.  not having to implement unrelated methods.

Abstraction Approach: We define a single, more generalized Animal interface that encompasses all the methods related to animals.
The SeagullAbstract class implements this larger interface.
If a client class needs an object that can eat, it would have to depend on the broader Animal interface,
which may have methods it doesn't care about.
     */

}
