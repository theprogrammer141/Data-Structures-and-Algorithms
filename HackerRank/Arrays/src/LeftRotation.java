import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {
        int d = 2;
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        System.out.println(rotateLeft(arr, d));
    }

    public static List<Integer> rotateLeft(List<Integer> arr, int d) {
        int n = arr.size();
        d = d % n;
        List<Integer> temp = new ArrayList<>(arr.subList(0, d));

        for(int i = 0; i < n - d; i++){
            arr.set(i, arr.get(i + d));
        }

        for(int i = 0; i < d; i++){
            arr.set(n - d + i, temp.get(i));
        }

        return arr;


    }
}
