package dimaCar;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Brand {
    BOING("Boing"),
    AIRBUS("Airbus"),
    TU("TU"),
    AN("AN"),
    IL("IL"),
    MITSUBISHI("Mitsubishi"),
    LAMBORGHINI("Lamborghini"),
    GENERAL_MOTORS("General Motors");
    private final  String description;


    @Override
    public String toString() {
        return description;
    }
}
