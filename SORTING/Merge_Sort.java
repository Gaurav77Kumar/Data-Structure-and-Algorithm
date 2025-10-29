package SORTING;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 87, 43};
        arr = merge(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeSort(left, right);
    }

    private static int[] mergeSort(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;  // increment i when taking from first
            } else {
                mix[k] = second[j];
                j++;  //  increment j when taking from second
            }
            k++;
        }

        // If elements remain in first array
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // If elements remain in second array
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
