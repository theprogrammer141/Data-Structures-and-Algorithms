public class SumOfSecondRow {
    public static void main(String[] args) {
        int[][] m = {{1,4,9},
                {11,4,3},
                {2,2,3}};
        sumOfSecondRow(m);
    }

    public static void sumOfSecondRow(int[][] m) {
        int sum = 0;
        int[] secondRow = m[1];

//        for (int j = 0; j < m.length; j++) {
//            sum += m[1][j];
//        }

        for(int i : secondRow) {
            sum += i;
        }
        System.out.println("The sum of numbers of second row is: " + sum);
    }
}
