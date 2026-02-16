// 隨機生成十個分數，判斷 fail rate, average, max point
package lab.javacore.practice;

import java.util.Random;
import java.util.Arrays;

public class ScoreStats {
  public static void main(String[] args) {
    Random r = new Random();
    int[] arr = new int[10];

    int fail = 0, sum = 0, max = -1;
    for (int i = 0; i < 10; i++) {
      arr[i] = r.nextInt(0, 101);
      if (arr[i] < 60) fail++;
      sum += arr[i];
      if (arr[i] > max) max = arr[i];
    }

    Arrays.stream(arr).forEach(n -> System.out.printf("%d ", n));
    System.out.println();
    System.out.printf("Fail rate: %.2f%n", (float) fail / 10);
    System.out.printf("Average: %.2f%n", (float) sum / 10);
    System.out.printf("Max: %d%n", max);
  }
}
