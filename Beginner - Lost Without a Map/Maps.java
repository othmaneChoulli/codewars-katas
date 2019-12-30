public class Maps {
  public static int[] map(int[] arr) {
    
    int i = 0;
    
    for (int a : arr) {
      arr[i] = a*2;
      i++;
    }
    
    return arr;
  }
}
