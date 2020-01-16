import java.util.Arrays;

public class Kata {
  public static boolean isAnagram(String test, String original) {
  
    char testArray[] = test.toCharArray();
    char originalArray[] = original.toCharArray();
   
    if (test.length() == original.length()) {
      for( int i = 0; i < test.length(); i++) {
        testArray[i] = Character.toLowerCase(testArray[i]);
        originalArray[i] = Character.toLowerCase(originalArray[i]);
      }
    }
      
    Arrays.sort(testArray);
    Arrays.sort(originalArray);
    
    if ( Arrays.equals(testArray, originalArray))
      return true;
    else 
      return false;
    
  }
}
