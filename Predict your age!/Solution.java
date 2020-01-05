import java.lang.Math; 

public class Solution {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        
        return (int)Math.sqrt(Math.pow(age1,2) + Math.pow(age2,2) + Math.pow(age3,2) + Math.pow(age4,2) + Math.pow(age5,2) + Math.pow(age6,2) + Math.pow(age7,2) + Math.pow(age8,2))/2;
    }
}
