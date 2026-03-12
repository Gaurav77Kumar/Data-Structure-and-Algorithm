package RECURSION;

public class Rotated_Binary {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,8,arr.length-1,0));

    }
    static int search(int[] arr, int target, int e,int s){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if (arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                search(arr,target,s,m-1);
            }
            else{
                return search(arr,target,e,m+1);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return search(arr,target,e,m+1);
        }
        return search(arr,target,m-1,s);
    }
}
