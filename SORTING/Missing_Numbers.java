//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler
package SORTING;

import java.util.Arrays;

public class Missing_Numbers {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,0};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr)); // Array.toString() is is used to print the array in a readable format if we directly print the array it will print the hashcode of the array
        System.out.println("Missing Number is: " + missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0; // This is used to maintain the index like 0,1,2,3....

        while (i < arr.length) {  // This loop will run until the last index of the array is reached
            int correct = arr[i]; // This is used to find the correct index of the element present at index i
            if (arr[i] < arr.length && arr[i] != arr[correct]) { // This condition checks whether the element is in the range and not at its correct position
                swap(arr, i, correct); // If the element is not at its correct position, we swap it with the element at its correct position
            } else { //
                ++i;
            }
        }

        for (int index = 0; index < arr.length; ++index) {
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
