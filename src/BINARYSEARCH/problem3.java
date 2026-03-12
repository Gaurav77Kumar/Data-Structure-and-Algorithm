package BINARYSEARCH;

public class problem3 {
    public static void main(String[] args) {
        int[] arr = new int[]{-12, -6, 0, 2, 3, 4, 16, 18, 22};
        int target = 15;
        int ans = Floor(arr, target);
        System.out.println(ans);
    }

    static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                if (target <= arr[mid]) {
                    return mid;
                }

                start = mid + 1;
            }
        }

        return end;
    }
}

