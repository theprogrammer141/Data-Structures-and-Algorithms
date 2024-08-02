public class PairsInArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        printPairs(arr);
    }

    public static void printPairs(int[] arr) {
        int currentNumber = 0;
        int totalPairs = 0;

        for(int i = 0; i < arr.length; i++) {
            currentNumber = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + currentNumber + ", " + arr[j] + ")" + " ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + totalPairs);
    }
}
