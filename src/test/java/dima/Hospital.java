package dima;

import java.util.List;

public class Hospital {
     private int reduceWeight(int actualWeight, int reduceAmount) {
        return  actualWeight - reduceAmount;
    }

    private int increaseWeight(int ac, int incr) {
        return ac + incr;
    }

    private int improveBiologicalAge(int actualAge, int estimatedImprovement) {
        return actualAge  - estimatedImprovement;
    }


    void totalUpgrade(Human hum, int makeYounger, int reduceWeight) {
        hum.age = improveBiologicalAge(hum.age, makeYounger);
        hum.weight = reduceWeight(hum.weight, reduceWeight);
        System.out.println(hum + " after going to the hospital now  has age " + hum.age + " and weight " + hum.weight);
    }

    void totalVillageUpgrade(List<Human> hums, int makeYounger, int reduceWeight) {
        for (Human hum : hums) {
            hum.age = improveBiologicalAge(hum.age, makeYounger);
            hum.weight = reduceWeight(hum.weight, reduceWeight);
            System.out.println(hum + " after going to the hospital now  has age " + hum.age + " and weight " + hum.weight);
        }
    }




}
