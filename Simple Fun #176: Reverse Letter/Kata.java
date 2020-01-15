
public class Kata {
    public static String reverseLetter(final String str) {
        
        String subStr = str.replaceAll("[^a-z]", "");
        String reverse = "";
        
        for (int i = subStr.length() - 1; i>=0; i--) 
          reverse += subStr.charAt(i);
        
        
        return reverse;
    }  
}
