public class Factorial {

  public int factorial(int n) {
    int fact = 1;
    
  if (n < 0 || n > 12) 
    throw new IllegalArgumentException(Integer.toString(n));
  else{
    for (int i = n; i > 0; i--)
      fact *= i ;
    }
    return fact;
  }
}
