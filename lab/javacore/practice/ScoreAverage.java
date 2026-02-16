// 五筆分數去除最高與最低後取平均
package lab.javacore.practice;

import java.util.Random;

public class ScoreAverage {
  public static void main(String[] args) {
    Random r = new Random();

    int[] arr = new int[5];
    for (int i = 0; i < 5; i++) {
      arr[i] = r.nextInt(0, 101);
    }

    int max = -1, min = 101, sum = 0;
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d: %d%n", i, arr[i]);
      if (arr[i] > max) max = arr[i];
      if (arr[i] < min) min = arr[i];
      sum += arr[i];
    }

    System.out.printf("Remove: %d, %d%n", max, min);
    System.out.printf("Result: %d%n", (sum - max - min) / 3);
  }
}
