package lab.javacore.practice;
import java.util.Scanner;

public class p004 {
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 6};
    Scanner sc = new Scanner(System.in);

    int target = sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        System.out.printf("%d%n", i);
      } else if (arr[i] > target) {
        System.out.printf("%d%n", i);
      }
    }

    sc.close();
  }
}
