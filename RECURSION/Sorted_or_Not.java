package RECURSION;


public class Sorted_or_Not {
    public static void main(String[] args) {
        int[] arr = {1,2,31,4,5,6,7,8};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int index){
        if(index == arr.length - 1){ // If we reach the last element, the array is sorted so return true
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1); // Check current and next element and recurse
        // and if both are false return false

    }
}
