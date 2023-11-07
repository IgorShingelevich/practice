package dimaCar;

import java.util.concurrent.SubmissionPublisher;

public class Vehicle {


    int speed;
    int weight;
    int price;
    String name;

    public Vehicle(int speed, int weight, int price, String name) {

    }

    String presentacion(){
        String text = "This is " + name + ". This vehicle can reach speeds " + speed + ", at a weight of " + weight + "Its price " + price;
        return text;


    }
}
