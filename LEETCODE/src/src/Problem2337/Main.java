package Problem2337;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(canChange("_L__R__R_", "L______RR"));
    }

    public static boolean canChange(String start, String target){
        int m = start.length();
        int p1 = 0;
        int p2 = 0;

        while(p1 < m || p2 < m){
            while(p1 < m && start.charAt(p1) == '_'){
                p1++;
            }

            while(p2 < m && target.charAt(p2) == '_'){
                p2++;
            }

            if(p1 == m || p2 == m){
                return p1 == m && p2 == m;
            }

            if(start.charAt(p1) != target.charAt(p2)){
                return false;
            }

            if(start.charAt(p1) == 'L' && p1 < p2){
                return false;
            }

            if(start.charAt(p1) == 'R' && p1 > p2){
                return false;
            }

            p1++;
            p2++;
        }
        return true;
    }

}
