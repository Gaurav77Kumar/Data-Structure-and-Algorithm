package Sliding_Window;


import java.util.HashSet;

// Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
public class Contain_Duplicate_1 {
    public static boolean containDuplicate(int[] arr, int k) {
        int i = 0;
        int j = 0;
        HashSet<Integer> set = new HashSet<>();

        while (j < arr.length) {
            if (set.contains(arr[j]) && j - i <= k) {
                return true;
            }
            set.add(arr[j]);

            if (j - i + 1 > k) {
                set.remove(arr[i]);
                i++;
            }
            j++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int k = 3;
        System.out.println("Does the array contain duplicates within distance " + k + "? " + containDuplicate(arr, k));
    }
}
