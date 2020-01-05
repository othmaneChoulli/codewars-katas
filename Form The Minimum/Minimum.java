import java.util.HashSet;
import java.util.Set;


public class Minimum{

	public static int minValue(int[] values){
	  
    Set<Integer> uniqueDigits = new HashSet<>();

    for(int i = 0; i < values.length; i++) {
        uniqueDigits.add(values[i]);
    }


    String output = "";
    for(Integer digit : uniqueDigits) {
        output += digit;
    }
    return Integer.valueOf(output);
	}

}
