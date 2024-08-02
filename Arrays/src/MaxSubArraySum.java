public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, 1, -3};
        maxSubArraySum(arr);
    }

    public static void maxSubArraySum(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    currentSum += arr[k];
                }
                System.out.print("Sum = " + currentSum);
                System.out.println();
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("Maimum SubArray Sum: " + maxSum);
    }
}
