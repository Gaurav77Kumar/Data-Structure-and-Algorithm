package Sliding_Window;
import java.util.*;

// Given an array of integers and a number k, find the maximum sum of a subarray of size k with distinct elements.
// If there is no such subarray, return 0.

public class Maximum_Sub_Array_of_Size_k {
    public static int maxSubArrayDisntict(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        while( j < arr.length){
            // Add current element to window
            sum += arr[j];
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            // window size is less than k, just move the end pointer
            if(j-i+1 < k){
                j++;
            }
            // window size is equal to k, calculate max sum and slide the window
            else if(j-i+1 == k){
                if(map.size() == k){
                    maxSum = Math.max(maxSum, sum);
                }

                // Remove the first element of the window and move the start pointer
                sum -= arr[i];
                map.put(arr[i], map.get(arr[i]) - 1);
                if(map.get(arr[i]) == 0){
                    map.remove(arr[i]);
                }
                i++;
                j++;
            }
        }
        return maxSum;
    }

/*
Given an array of integers and a number k, find the maximum sum of a subarray of size k.

    public static int maxSumSubarray(int[] arr, int k){
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while(j < arr.length){
            // Add current element to window
            sum += arr[j];

            // window size is less than k, just move the end pointer
            if(j-i+1 < k){
                j++;
            }
            // window size is equal to k, calculate max sum and slide the window
            else if(j-i+1 == k){
                maxSum = Math.max(maxSum, sum);

                // Remove the first element of the window and move the start pointer
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }

 */
    public static void main(String[] args){
        int[] arr = {2,5,2,8,2,9,1};
        int k  =3;
        int result = maxSubArrayDisntict(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}


