package SumOfSeries;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
    static int sumOfSeries(int n){
        if (n == 0) return 0;

        return (int) (n + Math.pow(sumOfSeries(n - 1), 3));
    }
}
