public class CheckPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }
}
