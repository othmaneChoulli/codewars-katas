public class Kata {
  public static int[] invert(int[] array) {
    
  int[] invert = new int[array.length];
  
  int i = 0;
  
  for (int a : array){
    invert[i] = a*-1;
    i++;
  }
  
  return invert;
  }
}
