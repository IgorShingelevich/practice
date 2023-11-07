package dimaCar;

public class WaterVehicle extends Vehicle{
    int displacement;
    public WaterVehicle(int speed, int weight, int price, String name, int displacement) {
        super(speed, weight, price, name);
        this.displacement = displacement;
    }
}
