public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 1, 3};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for(int turn = 0; turn <= arr.length - 1; turn++) {
            for(int j = 0; j < arr.length - 1 - turn; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
