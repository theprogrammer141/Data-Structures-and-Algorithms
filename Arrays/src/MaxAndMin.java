public class MaxAndMin {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 1, 56, 10000, 167};
//        int[] arr = {1, 345, 234, 21, 56789};
        int[] arr = {56789};
        System.out.println("Maximum is: " + maximum(arr));
        System.out.println("Minimum is: " + minimum(arr));
    }

    public static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int minimum(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
