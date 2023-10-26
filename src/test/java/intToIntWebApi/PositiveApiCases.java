package intToIntWebApi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PositiveApiCases {
    BETWEEN_1_AND_10_MIN("Range from 1 to 10 minimum", null, 1, 2),
    BETWEEN_1_AND_10_NOM("Range from 1 to 10 nominal", null, 5, 10),
    BETWEEN_1_AND_10_MAX("Range from 1 to 10 maximum", null, 10, 20),
    BETWEEN_11_AND_15_MIN("Between 11 and 15 minimum", null, 11, 5),
    BETWEEN_11_AND_15_NOM("Between 11 and 15 nominal", null, 12, 6),
    BETWEEN_11_AND_15_MAX("Between 11 and 15 maximum", null, 15, 7);


    private final String description;
    private final String exceptionMessage;

    private final Integer input;
    private final Integer expectedOutput;

    @Override
    public String toString() {
        return description;
    }
}
