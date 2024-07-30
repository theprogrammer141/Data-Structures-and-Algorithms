public class ModularExponentiation {
    public static void main(String[] args) {
        System.out.println(modularExpo(3432323, 8, 1000007));
    }

    public static long modularExpo(long n, long a, long p){
        long result = 1;

        while(n > 0){
            if((n & 1) != 0){
                result = (result * a % p) % p;
            }
            a = (a % p * a % p) % p;
            n >>= 1;
        }
        return result;
    }

}
