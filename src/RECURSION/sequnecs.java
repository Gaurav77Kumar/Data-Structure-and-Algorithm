package RECURSION;

import java.util.ArrayList;
import java.util.List;

public class sequnecs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        // start with empty subset
        outer.add(new ArrayList<>());

        // iterate over each number in array
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                // copy existing subset
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // add current number to it
                internal.add(num);
                // push back to outer list
                outer.add(internal);
            }
        }
        return outer;
    }
}
