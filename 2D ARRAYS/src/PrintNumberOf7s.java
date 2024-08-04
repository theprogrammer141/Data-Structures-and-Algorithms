public class PrintNumberOf7s {
    public static void main(String[] args) {
        int[][] arr = {{4, 7 ,8},
                {8, 8 , 7}};
        printNumberOf7s(arr);
    }

    public static void printNumberOf7s(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Number of 7s is " + count);
    }
}
