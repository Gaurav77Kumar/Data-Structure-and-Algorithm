
package LINEARSEARCH;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums = new int[]{23, 34, 45, 44, 433, 3, 323};
        int target = 44;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            for(int index = 0; index < arr.length; ++index) {
                int element = arr[index];
                if (element == target) {
                    return index;
                }
            }

            return -1;
        }
    }
}
