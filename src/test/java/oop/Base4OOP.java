package oop;

import java.util.ArrayList;
import java.util.List;

// Principle 1: Encapsulation
class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// Principle 2: Inheritance
class Car extends Vehicle {
    private String carType;

    public Car(String make, String model, int year, String carType) {
        super(make, model, year);
        this.carType = carType;
    }
}

// Principle 3: Polymorphism
class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck(String make, String model, int year, int payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }
}

// Principle 4: Abstraction
interface VehicleActions {
    void start();
    void stop();
}

class CarActions implements VehicleActions {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class Base4OOP {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Tesla", "Model 3", 2020, "Electric"));
        vehicles.add(new Truck("Ford", "F-150", 2019, 7000));

        for (Vehicle vehicle : vehicles) {
            System.out.println("Make: " + vehicle.getMake());
        }

        VehicleActions actions = new CarActions();
        actions.start();
        actions.stop();
    }
}
