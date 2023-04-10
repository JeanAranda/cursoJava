import java.util.Arrays;
import java.util.Random;

public class Sorteo {
   public static void main(String[] args) {
      int min = 1;
      int max = 46;
      int numSelections = 6;
      
      int[] selections = new int[numSelections];
      Random rand = new Random();
      
      for (int i = 0; i < numSelections; i++) {
         int randomNum = rand.nextInt((max - min) + 1) + min;
         selections[i] = randomNum;
      }
      
      Arrays.sort(selections);
      System.out.println("Los números seleccionados son: " + Arrays.toString(selections));
   }
}

