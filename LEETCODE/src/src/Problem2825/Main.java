package Problem2825;

public class Main {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "d";

        System.out.println(canMakeSubSequence(str1, str2));
    }

    public static boolean canMakeSubSequence(String str1, String str2){
       int m = str1.length();
       int n = str2.length();
       int p1 = 0;
       int p2 = 0;

       char[] charStr1 = str1.toCharArray();

       while(p1 < m && p2 < n){
           if(charStr1[p1] == str2.charAt(p2) || (charStr1[p1] + 1 == str2.charAt(p2))|| (charStr1[p1] - 25 == str2.charAt(p2))){
               p2++;
           }
           p1++;
       }

        return p2 == n;
    }
}
