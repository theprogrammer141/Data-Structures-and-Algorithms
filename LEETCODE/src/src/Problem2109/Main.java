package Problem2109;

public class Main {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        System.out.println(addSpaces(s, spaces));
    }

    public static String addSpaces(String s, int[] spaces){
        StringBuilder result = new StringBuilder();
        int m = s.length();
        int n = spaces.length;
        int p1 = 0;
        int p2 = 0;

        while(p1 < m){
            if(p2 < n && p1 == spaces[p2]){
                result.append(" ");
                p2++;
            }
            result.append(s.charAt(p1));
            p1++;
        }
        return result.toString();
    }
}
