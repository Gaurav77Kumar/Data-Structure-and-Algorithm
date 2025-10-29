package SORTING;

import java.util.Arrays;

public class InPlace_Merge {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInplace(arr, 0, arr.length  );
        System.out.println(Arrays.toString(arr));


    }

    static  void mergeSortInplace(int[] arr, int s, int e ){
        if (e - s == 1) {
            return ;
        }

        int mid = (s + e) / 2;

        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr, mid, e);

        mergeinplace(arr,s,mid,e);
    }

    private static void mergeinplace(int[] arr,int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;  // increment i when taking from first
            } else {
                mix[k] = arr[j];
                j++;  //  increment j when taking from second
            }
            k++;
        }

        // If elements remain in first array
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // If elements remain in second array
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

       for(int l = 0; l < mix.length; l++){
           arr[s + l] = mix[l];
       }

    }
}
