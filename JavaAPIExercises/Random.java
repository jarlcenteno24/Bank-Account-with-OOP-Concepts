import java.util.Random;

package JavaAPIExercises;

public class Random {
  public static void main(String[] args) {
    Random rand = new Random();

    int min = 10;
    int max = 20;

    int randomNum = rand.nextInt((max - min) + 1) + min;

    system.out.println("Random number between " + min + " and " + max + ": " + randomNum);
  }

}
