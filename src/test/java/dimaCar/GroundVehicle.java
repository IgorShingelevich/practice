package dimaCar;

public class GroundVehicle extends Vehicle {
    String typeOfEngine;
    public GroundVehicle(int speed, int weight, int price, String name, String typeOfEngine) {
        super(speed, weight, price, name);
        this.typeOfEngine = typeOfEngine;
    }
}
