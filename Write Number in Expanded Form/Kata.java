public class Kata
{
    public static String expandedForm(int num)
    {
      StringBuffer res = new StringBuffer();
      int d = 1;
      while(num > 0) {
        int nextDigit = num % 10;        
        num /= 10;
        if (nextDigit > 0) {
          res.insert(0, d * nextDigit);
          res.insert(0, " + ");
        }
        d *= 10;
      }
      
      return res.substring(3).toString();
    }
}
