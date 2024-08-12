public class MarsExploration {
    public static void main(String[] args) {
        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
        System.out.println(marsExploration(s));
    }

    public static int marsExploration(String s){
        int charChangeCount = 0;
        String pattern = "SOS";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch)){
                System.out.println("LowerCase not allowed!");
                System.exit(1);
            }

            if(pattern.charAt(i % 3) != ch){
                charChangeCount++;
            }
        }
        return charChangeCount;
    }
}
