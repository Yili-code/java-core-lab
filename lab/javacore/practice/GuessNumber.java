package lab.javacore.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args) {
    Random r = new Random();
    int target = r.nextInt(1, 100) + 1;
    System.out.printf("%d%n", target);

    try (Scanner sc = new Scanner(System.in)) {
      int count = 0;
      while (count < 10) {
        int guessNumber = sc.nextInt();

        if (guessNumber == target) {
          System.out.println("You got it.");
          break;
        } else if (guessNumber < target) {
          System.out.printf("The answer is bigger than %d%n", guessNumber);
        } else if (guessNumber > target) {
          System.out.printf("The answer is smaller than %d%n", guessNumber);
        }
        count++;
      }
    }
  }
}
