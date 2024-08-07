import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,4,3,2));
        System.out.println(reverseArray(arr));
    }

    public static List<Integer> reverseArray(List<Integer> arr) {
//        int[] arr2 = new int[arr.length];
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            arr2[i] = arr[arr.length-i-1];
//        }
//
//        return arr2;

        int first = 0;
        int last = arr.size() - 1;

        while(first < last){
            int temp = arr.get(last);
            arr.set(last, arr.get(first));
            arr.set(first, temp);

            first++;
            last--;
        }

        return arr;
    }

}
