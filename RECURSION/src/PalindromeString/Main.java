package PalindromeString;

public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.print(f(0, s.toLowerCase(), s.length() - 1));
    }
    static boolean f(int i, String s, int n){
        if(i >= n) return true;

        if(!Character.isLetterOrDigit(s.charAt(i))){
            return f(i + 1, s, n);
        }
        else if(!Character.isLetterOrDigit(s.charAt(n))){
            return f(i, s, n - 1);
        }
        else if(s.charAt(i) != s.charAt(n)){
            return false;
        }
        else{
            return f(i + 1, s , n - 1);
        }
    }
}
