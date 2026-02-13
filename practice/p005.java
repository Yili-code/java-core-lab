// 隨機生成十個不重複的數字，並利用 java.util.Arrays print
package practice;
import java.util.Random;
import java.util.Arrays;

public class p005 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    Random r = new Random();
    for (int i = 0; i < 10; ) {
      int num = r.nextInt(0, 100) + 1;
      if(check(num, arr)) {
        arr[i] = num;
        i++;
      }
    }

    Arrays.stream(arr).forEach(n -> System.out.printf("%d ", n));
    System.out.println();
  }

  public static boolean check(int num, int[] arr) {
    for (int i = 0; i < 10; i++) {
      if (arr[i] == num) return false;
    }
    return true;
  }
}
