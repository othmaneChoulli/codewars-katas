import java.util.*;

public class Kata {
  public static String highAndLow(String numbers) {
    String [] array = numbers.split(" ");
    int [] intArray = new int[array.length];
    
    for (int i=0; i<intArray.length; i++){
      intArray[i] = Integer.parseInt(array[i]);
    }
    
    Arrays.sort(intArray);
    
    return String.valueOf(intArray[intArray.length-1]) + " " + String.valueOf(intArray[0]);
  }
}
