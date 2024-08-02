import java.util.ArrayList;
import java.util.Arrays;

public class CheckNonRepeatingElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,2,1,4));
        System.out.println(checkNonRepeatingElement(arr));
    }

    public static ArrayList<Integer> checkNonRepeatingElement(ArrayList<Integer> arr) {
        int n = arr.size();
        int xor = 0;

        for(int i = 0; i < n; i++) {
            xor = xor ^ arr.get(i);
        }

        int right_set_bit = xor & ~(xor - 1);
        int x = 0, y = 0;

        for(int i = 0; i < n; i++) {
            if((arr.get(i) & right_set_bit) != 0){
                x = x ^ arr.get(i);
            }
            else {
                y = y ^ arr.get(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(x);
        result.add(y);
        return result;
    }
}
