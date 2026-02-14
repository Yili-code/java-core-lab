// remove all target in array and print the result
package lab.javacore.practice;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class p008 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    Random r = new Random();
    for (int i = 0; i < arr.length; i++) arr[i] = r.nextInt(0,10) + 1;
    Arrays.stream(arr).forEach(n -> System.out.printf("%d ", n));
    System.out.println();

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the target: ");
    int target = sc.nextInt();

    int left = 0, right = 0;
    while (right != arr.length) {
      if (arr[right] != target) {
        arr[left] = arr[right];
        left++;
      }
      right++;
    }

    arr = Arrays.copyOf(arr, left);
    Arrays.stream(arr).forEach(n -> System.out.printf("%d ", n));
    System.out.println();
    sc.close();
  }
}
