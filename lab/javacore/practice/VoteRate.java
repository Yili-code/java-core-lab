// compute the vote rate with each candidate and print
package lab.javacore.practice;

import java.util.Random;

public class VoteRate {
  public static void main(String[] args) {
    int[] cand = { 0, 0, 0, 0, 0, 0 };
    Random r = new Random();

    for (int i = 0; i < 1000; i++) {
      int index = r.nextInt(0, 6);
      cand[index]++;
    }

    int winnerIndex = 0;
    for (int i = 1; i <= 5; i++) {
      if (cand[i] > cand[winnerIndex]) winnerIndex = i;
      System.out.printf("The candidate %d's vote share is %.1f%%. (got %d votes)%n", i, (double) cand[i] / 1000 * 100, cand[i]);
    }
    System.out.println();

    System.out.printf("The candidate %d won the election with %d votes.%n", winnerIndex, cand[winnerIndex]);
    System.out.printf("Abstention: %.2f%%.%n", (double) cand[0] / 1000 * 100);
  }
}
