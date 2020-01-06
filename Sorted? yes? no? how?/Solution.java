class Solution {
  
  public static String isSortedAndHow(int[] array) {
      
      int length = array.length;
      String sorted = "";
      
      if(array[length - 2] > array[length - 1])
          sorted = "yes, descending";
      else if (array[length - 2] < array[length - 1] && array[0] < array[1])
          sorted = "yes, ascending";
      else {
            for (int i = 0; i< length-1; i++){
              if(array[i] > array[i+1]) 
                sorted = "no";
            }  
          }
          
      
      return sorted;
  }
