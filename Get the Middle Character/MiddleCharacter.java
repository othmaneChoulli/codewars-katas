class Kata {
  public static String getMiddle(String word) {
    String middle ="";
    
    if(word.length() % 2 == 0){
    
       for (int i= (word.length() / 2)-1; i <= word.length() / 2; i++)
         middle += String.valueOf(word.charAt(i));
         
     }else 
         middle = String.valueOf(word.charAt(word.length() / 2));
       
      return middle;
  }
}
