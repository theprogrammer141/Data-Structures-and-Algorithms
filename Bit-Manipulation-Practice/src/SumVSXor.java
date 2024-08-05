import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.BitSet;

public class SumVSXor {
    public static void main(String[] args) {
//        long n = 1099511627776;
//        System.out.println(sumVSXor(n));
    }

    public static long sumVSXor(long n) {
//        int count = 0;
//
//        for (int x = 0; x <= n; x++) {
//            if((n + x) == (n ^ x)){
//                count++;
//            }
//        }
//        return count;

//        int count = 0;
//
//        while(n != 0){
//            count += n % 2 == 0 ? 1 : 0;
//            n /= 2;
//        }
//        return (int) Math.pow(2, count);

        long count = 1;

        while(n > 0){
            if(n % 2 == 0){
                count *= 2;
            }
            n = n >> 1;
        }

        return count;
    }
}
