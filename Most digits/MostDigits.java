public class MostDigits {
  public static int findLongest(int[] numbers) {
  
    int max = 0, nb = 0;
    
    for (int i = 0; i < numbers.length; i++) {
      int n = Math.abs(numbers[i]);
      int nbDig = String.valueOf(n).length();
      if (nbDig > max) {
        max = nbDig;
        nb = numbers[i];
      }
    }
    return nb;
  }
}
