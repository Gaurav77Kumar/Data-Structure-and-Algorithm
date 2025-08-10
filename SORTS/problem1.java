//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package SORTS;

import java.util.Arrays;

public class problem1 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 0};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;

        while(i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                ++i;
            }
        }

        for(int index = 0; index < arr.length; ++index) {
            if (arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
