public class MaxSubArraySumWithKadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//        int[] arr = {-1, -2, -3, -4};
        printMaxSubArray(arr);
    }

    public static void printMaxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;


        for(int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];

            if(currentSum < 0) {
                currentSum  = 0;
            }

            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Max Sum = " + maxSum);
    }
}
