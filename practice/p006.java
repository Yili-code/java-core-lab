// 手動輸入五的數字，數字界在 0-100，去除最高分以及最低，取平均
package practice;
import java.util.Random;

public class p006 {
  public static void main(String[] args) {
    Random r = new Random();

    int[] arr = new int[5];
    for (int i = 0; i < 5; i++) {
      arr[i] = r.nextInt(0 , 101);
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
