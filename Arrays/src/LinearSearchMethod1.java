import java.util.Scanner;

public class LinearSearchMethod1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 60, 50};
        int key;

        System.out.print("Enter the key to search: ");
        key = scanner.nextInt();

        linearSearchAlgo(arr, key);
    }

    public static void linearSearchAlgo(int[] arr, int key){
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                found = true;
                System.out.println(key + " found at index " + i);
            }
        }
        if (!found) {
            System.out.println("Number not found");
        }
    }
}
