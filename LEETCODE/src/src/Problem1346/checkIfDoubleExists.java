package Problem1346;

import java.util.Arrays;

public class checkIfDoubleExists {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
//        int[] arr = {3, 1, 7, 11};
        System.out.println(checkIfExists(arr));
    }

//    public static boolean helper(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (i != j && arr[i] == (2 * arr[j])) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static boolean checkIfExists(int[] arr){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];

            int index = binarySearch(arr, target, i);

            if(index != -1){
                return true;
            }
        }
        return false;
    }

    public static int binarySearch(int[] arr, int target, int self){
        int left = 0, right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target && mid != self){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return -1;
    }
}
