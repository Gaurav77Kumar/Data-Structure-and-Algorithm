package SORTING;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 1, 2, 3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for(int i = 0; i < arr.length - 1; ++i) { // This outer loop will go till the second last element of the array
            for(int j = i + 1; j > 0 && arr[j] < arr[j - 1]; --j) {  // This inner loop will compare the current element with the previous elements and swap them if they are in the wrong order
                Selectionsort.swap(arr, j, j - 1);
            }
        }

    }
}
