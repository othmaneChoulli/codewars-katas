import java.util.*;

public class Kata {

	public static int[] flattenAndSort(int[][] array) {		
  
      int len = array.length, num = 0;
      
      for (int[] arr : array) {
          num += arr.length;
      }
      
      int out[] = new int[num], n = 0;
      
      for (int[] arr : array) {
          for (int i : arr) {
              out[n++] = i;
          }
      }
      
      Arrays.sort(out);
      return out;	
	}
}
