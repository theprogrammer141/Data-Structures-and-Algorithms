import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HourglassSum {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 1, 1, 0, 0, 0));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0, 0));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 1, 1, 0, 0, 0));
        List<Integer> list4 = new ArrayList<>(Arrays.asList(0, 0, 2, 4, 4, 0));
        List<Integer> list5 = new ArrayList<>(Arrays.asList(0, 0, 0, 2, 0, 0));
        List<Integer> list6 = new ArrayList<>(Arrays.asList(0, 0, 1, 2, 4, 0));

        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        arr.add(list4);
        arr.add(list5);
        arr.add(list6);

        System.out.println(hourglassSum(arr));
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int hourGlassSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int top = 0;
        int mid = 0;
        int bottom = 0;

        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                top = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                mid = arr.get(i+1).get(j+1);
                bottom = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

                hourGlassSum = top + mid + bottom;

                if(maxSum < hourGlassSum) {
                    maxSum = hourGlassSum;
                }
            }
        }
        return maxSum;
    }
}
