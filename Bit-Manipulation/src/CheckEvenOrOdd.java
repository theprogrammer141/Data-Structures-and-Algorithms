public class CheckEvenOrOdd {
    public static void main(String[] args) {
        evenOrOdd(3);
        evenOrOdd(11);
        evenOrOdd(14);
    }

    public static void evenOrOdd(int n){
        int bitMask = 1;
        if ((n & bitMask) == 0){
            System.out.println("Even number");
        }
        else if((n & bitMask) == 1){
            System.out.println("Odd number");
        }
    }
}
