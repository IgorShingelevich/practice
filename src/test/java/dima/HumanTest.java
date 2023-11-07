package dima;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class HumanTest {
    @Test
    @DisplayName("Inheritance test")
    public void inheritanceTest(){
        Hospital sclifosovskii = new Hospital();

        Grandfather dedWasia = new Grandfather(78, 170, 80, "uzbek", "Wasia",2000);
        Grandfather dedOleg = new Grandfather(88,150, 90, "usa", "Oleg",1000);
        Grandfather dedPetr = dedOleg;
        Grandmother babkaDusia = new Grandmother(99,144,34,"rus", "Dusia");
        int totalSalary = dedWasia.salary + dedOleg.salary;
        System.out.println("salary " + totalSalary);
        String answer = dedOleg.introduce();
        int olegMassIndex = dedOleg.massIndex(dedOleg.height, dedOleg.weight);
        System.out.println("ded Oleg  before  going to the hospital introduce himself");
        dedOleg.introduce(dedOleg.name, dedOleg.age, dedOleg.weight);
        dedOleg.introduce();

//        System.out.println(answer);
//        System.out.println(olegMassIndex);
//        System.out.println(dedOleg.age);
        System.out.println(" ded oleg goimg to visit hospital");
        sclifosovskii.totalUpgrade(dedOleg, 10, 10);
        System.out.println("ded Oleg  after  going to the hospital introduce himself");
        dedOleg.introduce(dedOleg.name, dedOleg.age, dedOleg.weight);
        System.out.println("now the rest of the  village  going to the hospital(babkaDusia, dedWasia for total upgrade");
        sclifosovskii.totalVillageUpgrade(Arrays.asList(dedOleg, dedWasia, babkaDusia), 10, 10);

    }

}
