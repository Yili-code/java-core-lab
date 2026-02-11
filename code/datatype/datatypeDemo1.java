package code.datatype;

import java.util.Random;

public class datatypeDemo1 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      int temp = arr[i];
      int num = r.nextInt(0, 10);
      arr[i] = arr[num];
      arr[num] = temp;
    }

    for (int i = 0; i < 10; i++) System.out.printf("%d ", arr[i]);
    System.out.println(" ");
  }
}
