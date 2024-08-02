public class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6 ,8 ,10};
        printSubArrays(arr);
    }

    public static void printSubArrays(int[] arr) {
        int totalSubArrays = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print("Sum = " + sum);
                System.out.println();
                totalSubArrays++;
            }
            System.out.println();
        }
        System.out.println("Total SubArrays: " + totalSubArrays);
    }
}
