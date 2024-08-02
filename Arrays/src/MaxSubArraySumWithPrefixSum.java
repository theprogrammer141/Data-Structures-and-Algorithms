public class MaxSubArraySumWithPrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        printMaxSubArraySum(arr);
    }

    public static void printMaxSubArraySum(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                currentSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];

                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Max subArray sum = " + maxSum);
    }
}
