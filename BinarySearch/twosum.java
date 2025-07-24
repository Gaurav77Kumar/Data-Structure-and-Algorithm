package BinarySearch;

public class twosum {
    public static int[] twosum(int[] nums, int target) {
        // Check all pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no solution found
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 11, 7};
        int target = 9;

        int[] result = twosum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
