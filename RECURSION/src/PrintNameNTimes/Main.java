package PrintNameNTimes;

public class Main {
    public static void main(String[] args) {
        printNTimes(1, 3);
    }
    public static void printNTimes(int i, int n){
        if(i > n) return;
        System.out.println("abd");
        printNTimes(i+1, n);
    }
}
