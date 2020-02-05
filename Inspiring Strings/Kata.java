public class Kata {
  public static String longestWord(String wordString) {
    String[] arr = wordString.split(" ");
    String longest = "";
    for(int i=0; i<arr.length; i++){
      if(arr[i].length() >= longest.length()){
        longest = arr[i];
      }
    }
    return longest;
  }
}
