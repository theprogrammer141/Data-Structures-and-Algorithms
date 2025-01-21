package ArmstrongNumbers;

public class Main {
    public static void main(String[] args) {
        int n = 1634;
        int armstrong = 0;
        int original_number = n;

        while(n > 0){
            int last_digit = n % 10;
            armstrong += (int) Math.pow(last_digit, 3);
            n = n / 10;
        }

        if(original_number == armstrong){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
