public class HackerrankInAString {
    public static void main(String[] args) {
        String s = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        System.out.println(hackerrankInAString(s));
    }

    public static String hackerrankInAString(String s) {
        String subString = "hackerrank";

        int sIndex = 0;
        int subIndex = 0;

        while(sIndex < s.length() && subIndex < subString.length()) {

            if(s.charAt(sIndex) == subString.charAt(subIndex)) {
                subIndex++;
            }

            sIndex++;
        }

        if(subIndex == subString.length()) {
            return "YES";
        }

        else{
            return "NO";
        }
    }
}
