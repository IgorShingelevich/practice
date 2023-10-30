package accesNonAccessModifires;

class Car {
    // Non-static variable to differentiate from the static inner class
    private String name;

    // Constructor to initialize non-static variable
    public Car(String name) {
        this.name = name;
    }

    // Declaring a static inner class to demonstrate that it can be instantiated independently of the outer class.
    public static class Engine {
        // Method within static inner class
        public void start() {
            System.out.println("Engine started."); // Output: Engine started.
        }
    }

    public static void main(String[] args) {
        // Instantiating the static inner class independently of the outer class
        Car.Engine engine = new Car.Engine();
        engine.start();
    }
}
