public class ClearIthBit {
    public static void main(String[] args) {
        System.out.println(clearIthBit(6, 2));
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
}
