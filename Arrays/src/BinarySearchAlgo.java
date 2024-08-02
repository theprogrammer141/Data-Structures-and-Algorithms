import java.util.Scanner;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {2,4,6,8,10,14};
        int key;

        System.out.print("Enter key to search: ");
        key = scanner.nextInt();

        System.out.println("Result: " + binarySearch(arr, key));
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                start = mid + 1;
            }
            else if(arr[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;

    }
}
