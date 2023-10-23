package intToIntCasesMultiplDevisionExeptions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final CalculatorIfElse calculator = new CalculatorIfElse();

    @ParameterizedTest
    @EnumSource(NegativeApiCases.class)
    @DisplayName("Negative tests")
    void negativeTest(NegativeApiCases testCase) {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> calculator.businessProcess(testCase.getInput()));
        assertEquals(testCase.getExceptionMessage(), exception.getMessage());
    }

    @ParameterizedTest
    @EnumSource(PositiveApiCases.class)
    @DisplayName("Positive tests")
    void positiveTest(PositiveApiCases testCase) {
        int result = calculator.businessProcess(testCase.getInput());
        assertEquals(testCase.getExpectedOutput(), result);
    }

}
