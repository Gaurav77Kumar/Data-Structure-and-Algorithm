//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package SORTS;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 1, 2, 3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for(int i = 0; i < arr.length - 1; ++i) {
            for(int j = i + 1; j > 0 && arr[j] < arr[j - 1]; --j) {
                selectionsort.swap(arr, j, j - 1);
            }
        }

    }
}
