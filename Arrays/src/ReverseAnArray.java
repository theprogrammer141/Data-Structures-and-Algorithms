import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30 ,40};

        System.out.println("Reversed array: " + Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr){
        int first = 0;
        int last = arr.length - 1;

        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }

        return arr;
    }
}
