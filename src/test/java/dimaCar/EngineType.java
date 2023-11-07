package dimaCar;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum EngineType {
    DIESEL("Diesel", 160, Brand.AIRBUS.toString(), 0.1);
    private final String decscription;
    private final int maxSpeed;
    private final  String brand;
    private final double co2Emission;
}
