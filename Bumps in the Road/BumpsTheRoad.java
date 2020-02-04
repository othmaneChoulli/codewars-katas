public class BumpsTheRoad {
  public static String bumps(final String road) {
    int count=0;
    for (int i = 0; i < road.length(); i++) {
      if (road.charAt(i) =='n')
        count++;
    }  
    if (count <= 15)
      return "Woohoo!";
    else
      return "Car Dead";
  }
}
