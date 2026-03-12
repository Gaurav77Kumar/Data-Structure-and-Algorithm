package RECURSION;

public class Checking_Sorted_array {
    public static void main(String[] args) {
        int[] arr ={ 2,3,2,34,5};
        System.out.println(sorted(arr,0));

    }
    static boolean sorted(int[] arr , int index){
        // Base Condition
        if( index == arr.length - 1){
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr,index+ 1);
    }




}
