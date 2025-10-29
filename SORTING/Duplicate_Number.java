package SORTING;

public class Duplicate_Number {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 2, 2};
        int missing = DuplicateNumber(arr);
        System.out.println("Dupliacte number: " + missing);
    }

    public static int DuplicateNumber(int[] arr) {
        int i = 0;

        while(i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] == arr[correct]) {
                    return arr[i];
                }

                swap(arr, i, correct);
            } else {
                ++i;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

