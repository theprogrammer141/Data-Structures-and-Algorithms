package SumOfDivisors;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfDivisors(4));
    }

    public static int sumOfDivisors(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    sum += j;
                }
            }
        }
        return sum;
    }
}
