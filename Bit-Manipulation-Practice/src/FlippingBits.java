public class FlippingBits {
    public static void main(String[] args) {
        long n = 9;
        System.out.println(flipBits(n));
    }

    public static long flipBits(long n) {
        long bitMask = (long) (Math.pow(2, 32) - 1);
        return n ^ bitMask;
    }
}
