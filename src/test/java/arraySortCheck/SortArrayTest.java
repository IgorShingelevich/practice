package arraySortCheck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import arraySortCheck.provider.Cases;

public class SortArrayTest {

    @EnumSource(Cases.class)
    @ParameterizedTest
    public void testSortArray(Cases testCase) {
        try {
            int[] sortedArray = SortArray.sortArray(testCase.getOriginal(), testCase.isDescending());
            Assertions.assertArrayEquals(testCase.getExpected(), sortedArray);
            Assertions.assertNull(testCase.getExpectedExceptionMessage(), "Unexpected success for negative test case");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(testCase.getExpectedExceptionMessage(), e.getMessage(), "Unexpected exception message");
        }
    }
}