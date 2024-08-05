public class MaximizingXOR {
    public static void main(String[] args) {
        int l = 10;
        int r = 15;

        System.out.println("The maximum value in the pair of " + l + " and " + r + " is " + maxXOR(l, r));
    }

    public static int maxXOR(int l, int r){
        int maxVal = 0;
        int result = 0;

        for (int a = l; a <= r; a++) {
            for(int b = a; b <= r; b++) {
                result = a ^ b;
                if (result > maxVal) {
                    maxVal = result;
                }
            }
        }
        return maxVal;
    }
}