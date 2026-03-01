package Sliding_Window;

// Given an array of integers and a number k, find the maximum for each and every contiguous subarray
// of size k.


public class Maximum_of_all_subarray_size_k {
    /*
    public int[] maxSlidingWindow(int[] arr, int k){
    int n = arr.length;
    int[] ans = new int[n-k+1];
    Deque<Integer> qu = new LinkedList<>();
    int i = 0;
    int j = 0;


    while(j < arr.leength){
    // Remove smaller elements from back
    while(!qu.isEmpty() && arr[qu.peekLast()] < arr[j]){
        qu.pollLast();
        }
    qu.add(j);

    // Remove elements out of the current window
    if(qu.peekFirst() < j-k+1){
        qu.pollFirst();
        }
    if(j >= k -1){
    ans[i++] = arr[qu.peekFirst()];
    }
    j++;
    }
    return ans;
    }

     */
    public static int[] maxOfSubarray(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n - k + 1];
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;

        while (j < n) {
            max = Math.max(max, arr[j]);

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                ans[i] = max;

                // If the element leaving the window is the maximum, we need to find the new maximum
                if (arr[i] == max) {
                    max = Integer.MIN_VALUE;
                    for (int m = i + 1; m <= j; m++) {
                        max = Math.max(max, arr[m]);
                    }
                }

                i++;
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxOfSubarray(arr, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
