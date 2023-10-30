package alg.arraySortCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public  class SortArray {

    public static int[] sortArray(Integer[] array, boolean descending) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Convert array to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        // Determine sort order and sort the ArrayList accordingly
        if (descending) {
            arrayList.sort(Collections.reverseOrder());
        } else {
            Collections.sort(arrayList);
        }

        // Convert ArrayList back to array
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = arrayList.get(i);
        }

        return sortedArray;
    }
}
