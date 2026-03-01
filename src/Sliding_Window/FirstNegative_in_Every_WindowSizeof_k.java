package Sliding_Window;
import java.util.HashSet;
import java.util.LinkedList;

public class FirstNegative_in_Every_WindowSizeof_k {

    /*
     Given an array of integers and a number k and a number x find the x smallest negative integer in the current window of size k,
     if there is no such negative integer then return 0 for that window.

    public static int[] randomNegative(int[] arr, int k, int x){
        int i = 0;
        int j = 0;
        int [] ans = new int[arr.length - k + 1];
        LinkedList<Integer> qu = new LinkedList<>();

        while( j< arr.length){
            if(arr[j] < 0){
                qu.add(arr[j]);
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){

                if(qu.size() >= x){
                    ans[i] = qu.get(x-1);
                } else{
                    ans[i] = 0;
                }
               // remove element leaving the window
               if(!qu.isEmpty() && arr[i] == qu.peek()){
                   qu.poll();
               }
                i++;
                j++;
            }

        }
    }
     */


    /*
    Given an array of integers and a number k, find the second negative integer for each and every window
    if a window does not contain a second negative integer, then print 0 for that window.

    public static int[] secondNegative(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int [] ans = new int[arr.length - k + 1];
        LinkedList<Integer> qu = new LinkedList<>();

        while( j< arr.length){
            if(arr[j] < 0){
                qu.add(arr[j]);
            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){

                if(qu.size() >= 2){
                    ans[i] = qu.get(1); // this will give us the second negative integer in the current window
                } else{
                    ans[i] = 0;
                }
               // remove element leaving the window
               if(!qu.isEmpty() && arr[i] == qu.peek()){
                   qu.poll();
               }
                i++;
                j++;
            }

        }
        return ans;
    }

     */

    // Given an array and a number k, find the first negative integer for each and every window(contiguous subarray) of size k.
    // If a window does not contain a negative integer, then print 0 for that window.

    public static int[] firstNegative(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int [] ans = new int[arr.length - k + 1];
        LinkedList<Integer> q = new LinkedList<>();

        while( j< arr.length){
            if(arr[j] < 0){
                q.add(arr[j]);

            }
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                if(!q.isEmpty()){
                    ans[i] = q.peek();
                } else {
                    ans[i] = 0;
                }
               if(!q.isEmpty() && arr[i] == q.peek()){
                   q.poll();
               }
                i++;
                j++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int [] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int [] ans = firstNegative(arr, k);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }

}
