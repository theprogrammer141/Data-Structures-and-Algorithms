import java.nio.charset.CodingErrorAction;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "middle-Outz";
        int k = 2;
        System.out.println(caesarCipher(s, k));
    }

    public static String caesarCipher(String s, int k){
        String result = "";
        k = k % 26;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                char newChar = (char) (ch + k);
                if(newChar > 90){
                    newChar = (char) (newChar % 90 + 64);
                }
                result += newChar;
            }
            else if(Character.isLowerCase(ch)){
                char newChar = (char) (ch + k);
                if(newChar > 122){
                    newChar = (char) (newChar % 122 + 96);
                }
                result += newChar;
            }
            else{
                result += ch;
            }
        }
        return result;
    }
}
