import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    
    String res = "";
    
    for (int i : binary)
            res += i; 
  
    return Integer.parseInt(res, 2);
    }
}
