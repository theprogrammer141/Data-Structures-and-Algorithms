public class ClearLastiBits {
    public static void main(String[] args) {
        System.out.println(clearLastiBits(15, 2));
    }

    public static int clearLastiBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
}
