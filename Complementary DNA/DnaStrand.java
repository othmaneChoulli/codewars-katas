public class DnaStrand {
  public static String makeComplement(String dna) {
    
    String[] array = dna.split("");
    String complement =""; 
    
    for (int i = 0; i < array.length; i++){
      switch (array[i]) {
        case"A":
          complement += 'T';
          break;
        case"T":
          complement += 'A';
          break;
        case "C":
          complement += 'G';
          break;
        case "G":
          complement += 'C';
          break;     
      }
    }
    return complement;
  }
}
