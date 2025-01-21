package GCD;

public class Main {
    public static void main(String[] args) {
        findGCD(52 ,10);
    }

    public static void findGCD(int a, int b){
        while(a > 0 && b > 0){
            if(a > b) a = a % 10;
            else b = b % 10;
        }
        if(a == 0) System.out.println(b);
        else System.out.println(a);
    }
}
