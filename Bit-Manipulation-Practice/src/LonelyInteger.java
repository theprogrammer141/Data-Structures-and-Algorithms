import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1));
        System.out.println(lonelyInteger(arr));
    }

    public static int lonelyInteger(List<Integer> arr) {
        int xor = 0;

        for (int i = 0; i < arr.size(); i++) {
            xor = xor ^ arr.get(i);
        }
        return xor;
    }
}
