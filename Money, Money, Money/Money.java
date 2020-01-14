public class Money {
  public static int calculateYears(double principal, double interest,  double tax, double desired) {
    int numYears = 0;
    while (principal < desired) {
      principal += principal * interest * (1 - tax);
      numYears++;
    }
    
    return numYears;
  }
}
