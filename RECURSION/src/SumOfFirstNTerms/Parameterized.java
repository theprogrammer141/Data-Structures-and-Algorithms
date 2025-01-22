package SumOfFirstNTerms;

public class Parameterized {
    public static void main(String[] args) {
        sumOfNTerms(3, 0);
    }
    static void sumOfNTerms(int i, int sum){
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNTerms(i - 1, sum + i);
    }
}
