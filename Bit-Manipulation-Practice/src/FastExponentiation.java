public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println(fastExpo(5,3));
    }

    public static int fastExpo(int number, int power) {
        int result = 1;

        while (number > 0) {
            if((power & 1) != 0){
                result *= number;
            }
            number = number * number;
            power >>= 1;
        }
        return result;
    }
}
