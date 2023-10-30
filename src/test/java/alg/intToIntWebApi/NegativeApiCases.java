package alg.intToIntWebApi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NegativeApiCases {
    BETWEEN_16_AND_20("Between 16 and 20", "first exception range", 18, null),
    BETWEEN_21_AND_25("Between 21 and 25", "second exception range", 23, null),
    GREATER_THAN_25("Greater than 25", "Out of range", 26, null),
    ZERO("Zero", "Out of range", 0, null),
    NEGATIVE("Negative", "Out of range", -1, null);

    private final String description;
    private final String exceptionMessage;

    private final Integer input;
    private final Integer expectedOutput;

    @Override
    public String toString() {
        return description;
    }
}
