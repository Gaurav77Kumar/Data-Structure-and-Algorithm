package SORTING;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {  // This loop runs for each element in the array outer loop
            boolean swapped = false; // Flag to check if any swapping occured in the inner loop

            for(int j = 1; j < arr.length - i; ++j) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;  // Set the flag to true if a swap occurs and we need to continue checking
                }
            }

            if (!swapped) {  // If no swapping occured, the array is already sorted
                break;
            }
        }

    }
}

