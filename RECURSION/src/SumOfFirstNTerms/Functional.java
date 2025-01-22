package SumOfFirstNTerms;

public class Functional {
    public static void main(String[] args) {
        System.out.println(sumOfNTerms(3));
    }
    static int sumOfNTerms(int n){
        if (n == 0) return 0;
        return n + sumOfNTerms(n - 1);
    }
}
