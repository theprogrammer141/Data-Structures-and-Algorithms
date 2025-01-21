package ExtractionOfDigits;

public class Main {
    public static void main(String[] args) {
        int n = 7789;
        while(n > 0){
            int last_digit = n % 10;
            System.out.println(last_digit);
            n = n / 10;
        }
    }
}
