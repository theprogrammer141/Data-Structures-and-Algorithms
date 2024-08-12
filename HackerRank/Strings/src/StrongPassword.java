public class StrongPassword {
    public static void main(String[] args) {
        int n = 3;
        String password = "Ab1";
        System.out.println(minimumCharacters(n, password));
    }

    public static int minimumCharacters(int n, String password){
        int minChars = 0;

        String special_characters = "!@#$%^&*()-+";

        boolean hasDigit = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialCharacters = false;

        for(char c : password.toCharArray()){
            if(Character.isDigit(c)){
                hasDigit = true;
            }
            else if(Character.isLowerCase(c)){
                hasLowercase = true;
            }
            else if(Character.isUpperCase(c)){
                hasUppercase = true;
            }
            else if(special_characters.indexOf(c) != -1){
                hasSpecialCharacters = true;
            }
        }

        if(!hasDigit) minChars++;
        if(!hasLowercase) minChars++;
        if(!hasUppercase) minChars++;
        if(!hasSpecialCharacters) minChars++;

        int totalLengthNeeded = Math.max(0, 6-n);

        return Math.max(minChars, totalLengthNeeded);
    }
}
