package dimaCar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    @Test
    @DisplayName("Presentacion test")
    public void presentationTest() {
        Hummer wasiaHummer = new Hummer(100, 1000, 10000, "Hummer", "Diesel");
        F16 olegF16 = new F16(1000, 10000, 100000, "F16", 1000);
        Boing dimaBoing = new Boing(10000, 100000, 1000000, "Boing", 10000);
    }
}
