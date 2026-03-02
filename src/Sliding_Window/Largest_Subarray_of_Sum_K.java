package Sliding_Window;

public class Largest_Subarray_of_Sum_K {
    public static int largestSubarraySumK(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxLength = 0;

        while (j < arr.length) {
            sum += arr[j];

            if (sum < k) {
                j++;
            } else if (sum == k) {
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            } else if (sum > k) {
                while (sum > k && i <= j) {
                    sum -= arr[i];
                    i++;
                }
                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
                j++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int k = 12;
        System.out.println("Length of the longest subarray with sum " + k + " is: " + largestSubarraySumK(arr, k));
    }
}
