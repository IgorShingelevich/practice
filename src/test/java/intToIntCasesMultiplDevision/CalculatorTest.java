package intToIntCasesMultiplDevision;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final CalculatorIfElse calculator = new CalculatorIfElse();

    @ParameterizedTest
    @EnumSource(NegativeTestCases.class)
    @DisplayName("Negative tests")
    void negativeTest(NegativeTestCases testCase) {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> calculator.businessProcess(testCase.getInput()));
        assertEquals(testCase.getExceptionMessage(), exception.getMessage());
    }

    @ParameterizedTest
    @EnumSource(PositiveTestCases.class)
    @DisplayName("Positive tests")
    void positiveTest(PositiveTestCases testCase) {
        int result = calculator.businessProcess(testCase.getInput());
        assertEquals(testCase.getExpectedOutput(), result);
    }

}
