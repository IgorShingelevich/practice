package dimaCar;

public class AirVehicle extends Vehicle {
    int flightAltitude;
    public AirVehicle(int speed, int weight, int price, String name,int flightAltitude) {
        super(speed, weight, price, name);
        this.flightAltitude = flightAltitude;
    }
}
