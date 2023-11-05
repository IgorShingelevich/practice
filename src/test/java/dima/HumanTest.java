package dima;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HumanTest {
    @Test
    @DisplayName("Inheritance test")
    public void inheritanceTest(){
        Grandfather dedWasia = new Grandfather(78, 170, 80, "uzbek", "Wasia");
        Grandfather dedOleg = new Grandfather(88,150, 90, "usa", "Oleg");
        Grandmother babkaDusia = new Grandmother(99,144,34,"rus", "Dusia")
    }
}
