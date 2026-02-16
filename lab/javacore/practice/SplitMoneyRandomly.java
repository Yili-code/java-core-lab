// M split into N randomly
package lab.javacore.practice;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SplitMoneyRandomly {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter M and N separately.");
    int M = sc.nextInt();
    int N = sc.nextInt();
    if (M < N) {
      System.out.println("M can not smaller than N.");
      sc.close();
      return;
    }

    int[] arr = new int[N];

    Random r = new Random();
    System.out.println("Origin: ");
    for (int i = 0; i < N - 1; i++) {
      int money = r.nextInt(1, M - (N - 1));
      arr[i] = money;
      M -= money;
      System.out.printf("%d: %d%n", i + 1, money);
    }
    arr[N - 1] = M;
    System.out.printf("%d: %d%n", N - 1, M);
    System.out.println();

    for (int i = 0; i < arr.length; i++) {
      int temp = arr[i];
      int ran = r.nextInt(0, arr.length - 1) + 1;
      System.out.printf("Pos %d change with Pos %d%n", i + 1, ran);
      arr[i] = arr[ran];
      arr[ran] = temp;
    }
    System.out.println();

    Arrays.stream(arr).forEach(n -> System.out.printf("%d%n", n));
    sc.close();
  }
}
