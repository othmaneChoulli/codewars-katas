import java.lang.StringBuilder;


public class Kata
{
  public static String reverseWords(final String original)
  {
    String [] words = original.split(" ");
    
    if (words.length == 0)
      return original;
    
    int i = 0;
    for (String a : words) {
      words[i] = new StringBuilder(a).reverse().toString();
      i++;
    }
    
    return String.join(" ",words);
    
  }
}
