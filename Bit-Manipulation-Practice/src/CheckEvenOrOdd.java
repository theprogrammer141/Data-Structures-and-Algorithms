public class CheckEvenOrOdd {
    public static void main(String[] args) {
        checkEvenOrOdd(100);
    }

    public static void checkEvenOrOdd(int n) {
        if((n & 1) == 0){
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
