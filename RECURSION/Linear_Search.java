package RECURSION;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {2,4,2,33,54,6};
        int target  = 33;
        System.out.println(Search(nums,0,target));

    }
    static int Search(int[] arr, int index, int target){
        if(arr[index] == target){
            return index;
        }
        if(index == arr.length){
            return -1;
        }
        return Search(arr, index + 1, target);
        // return arr[index] == target || Search(arr,target,index + 1)
    }
}

//  static ArrayList<Integer> list = new Arraylist<>();

//   static int Search(int[] arr, int index, int target){
//    if(arr[index] == target){
//        return index;
//    }
//    if(index == arr.length){
//        list.add(index);
//    }
//    Search(arr, index + 1, target);

