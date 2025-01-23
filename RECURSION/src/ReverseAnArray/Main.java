package ReverseAnArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        f(0, arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void f(int i, int[] arr, int n){
        if(i >= n / 2) return;

        swap(arr, i, n - i - 1);
        f(i + 1, arr, n);
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
