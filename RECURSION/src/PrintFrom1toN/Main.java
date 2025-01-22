package PrintFrom1toN;

public class Main {
    public static void main(String[] args) {
        print1ToN(1, 10);
    }
    public static void print1ToN(int i, int n){
        if(i > n) return;
        System.out.println(i);
        print1ToN(i + 1, n);
    }
}
