package alg;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If inner loop didn't swap any element, break out of the outer loop
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
/*Explanation:
Bubble Sort Algorithm:

The algorithm works by repeatedly stepping through the list, comparing each pair of adjacent items and swapping them if they are in the wrong order.
The process is repeated for every element until no swaps are needed, indicating that the list is sorted.
Optimization:

The variable swapped is used to optimize the Bubble Sort.
 If during a pass through the list, no elements are swapped,
  it means the list is already sorted and we can break out of the loop early.
Main Method:

An example array is initialized and then sorted using the bubbleSort method.
 Before and after the sort, the array is printed to demonstrate the effectiveness of the algorithm.
This task checks a candidate's knowledge of basic algorithms
and their ability to code without relying on built-in functions.
 It also provides an opportunity to discuss possible optimizations,
 as Bubble Sort is not the most efficient sorting algorithm for large datasets.*/