public class NumberOfWords {
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        System.out.println(numberOfWords(s));
    }

    public static int numberOfWords(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }

        int wordCount = 1;

        for(int i = 0; i < s.length() - 1; i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                wordCount++;
            }
        }
        return wordCount;
    }
}
