public class ClearRangeOfiBits {
    public static void main(String[] args) {
        System.out.println(clearRangeOfiBits(10, 2, 1));
    }

    public static int clearRangeOfiBits(int n, int i, int j) {
        int a = (~0) << (j+1);
        int b = 1 << (i - 1);

        int bitMask = a | b;
        return n & bitMask;
    }
}
