public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println(fastExpo(5,10));
    }

    public static int fastExpo(int a, int n){
        int answer = 1;
        while(n > 0){
            if((n & 1) != 0){
                answer = answer * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return answer;
    }
}
