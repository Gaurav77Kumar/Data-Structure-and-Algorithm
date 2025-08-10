package BINARYSEARCH;

public class problem7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 7, 6, 4};
        int peakIndex = peakIndexMountainArray(arr);
        System.out.println("Peak index is: " + peakIndex);
    }

    public static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}

