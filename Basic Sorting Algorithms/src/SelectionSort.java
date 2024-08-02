public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i <= arr.length - 2; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
