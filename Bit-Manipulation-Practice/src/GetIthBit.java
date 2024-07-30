public class GetIthBit {
    public static void main(String[] args) {
        System.out.println(getIthBit(5, 2));
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n & bitMask;
    }
}
