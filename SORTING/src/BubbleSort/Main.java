package BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 9, 7};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void bubbleSort(int[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
