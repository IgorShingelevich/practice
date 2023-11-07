package dimaCar;

public class Boing  extends AirVehicle{
    public Boing(int speed, int weight, int price, String name, int flightAltitude) {
        super(speed+10, weight, price, name, flightAltitude);
    }
}
