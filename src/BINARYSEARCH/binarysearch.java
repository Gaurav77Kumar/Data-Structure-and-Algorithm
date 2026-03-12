package BINARYSEARCH;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-12, -6, 0, 2, 3, 4, 15, 16, 18, 22};
        int target = 15;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
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

        return -1;
    }
}

