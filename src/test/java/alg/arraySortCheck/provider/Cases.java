package alg.arraySortCheck.provider;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Cases {
    ASCENDING_SORT(
            false,
            new Integer[]{5, 3, 8, 1, 2},
            new int[]{1, 2, 3, 5, 8},
            null
    ),
    DESCENDING_SORT(
            true,
            new Integer[]{5, 3, 8, 1, 2},
            new int[]{8, 5, 3, 2, 1},
            null
    ),
    EMPTY_ARRAY(
            false,
            new Integer[]{},
            new int[]{},
            "Array cannot be empty"
    ),
    SINGLE_ELEMENT(
            false,
            new Integer[]{7},
            new int[]{7},
            null
    ),
    TWO_ELEMENTS(
            false,
            new Integer[]{9, 4},
            new int[]{4, 9},
            null
    ),
    IDENTICAL_ELEMENTS(
            false,
            new Integer[]{3, 3, 3, 3, 3},
            new int[]{3, 3, 3, 3, 3},
            null
    ),
    NEGATIVE_NUMBERS(
            false,
            new Integer[]{-5, -3, -8, -1, -2},
            new int[]{-8, -5, -3, -2, -1},
            null
    ),
    NULL_ARRAY(
            false,
            null,
            null,
            "Input array cannot be null"
    );

    final boolean descending;
    final Integer[] original;
    final int[] expected;
    final String expectedExceptionMessage;


}
