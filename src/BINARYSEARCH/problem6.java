package BINARYSEARCH;

public class problem6 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;

        int end;
        int temp;
        for(end = 1; target > arr[end]; start = temp) {
            temp = end + 1;
            end += (end - start + 1) * 2;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(true) {
            if (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                    continue;
                }

                if (target > arr[mid]) {
                    start = mid + 1;
                    continue;
                }

                return mid;
            }

            return -1;
        }
    }
}

