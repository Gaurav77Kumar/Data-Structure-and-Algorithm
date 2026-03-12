package RECURSION;
import java.util.ArrayList; // Import Java's ArrayList

public class Multiple_Target {
    public static void main(String[] args) {
        int[] nums = {22, 2, 2, 4, 6, 4};
        int target = 2;

        System.out.println(Findallindex(nums, target, 0, new ArrayList<>()));

        System.out.println(Findallindex(nums,4,0));
    }

    static ArrayList<Integer> Findallindex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list; // base case: return collected list
        }
        if (arr[index] == target) {
            list.add(index); // store index if element matches target
        }
        return Findallindex(arr, target, index + 1, list); // recursive call
    }

    static ArrayList<Integer> Findallindex(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list; // base case: return collected list
        }

        // This will  contain answer for that function call omly

        if (arr[index] == target) {
            list.add(index); // store index if element matches target
        }
        ArrayList<Integer> ansFromBelowCalls = Findallindex(arr, target, index + 1, list); // recursive call

        list.addAll(ansFromBelowCalls);

        return list;
    }

}


