// merge two array and find the medium
package lab.javacore.practice;

import java.util.Arrays;

public class MergeArraysMedian {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] arr2 = { 1, 2, 3, 4, 5, 6 };

    int[] result = new int[arr1.length + arr2.length];
    int p1 = 0, p2 = 0;
    for (int i = 0; i < result.length; i++) {
      if (p1 == arr1.length) {
        result[i] = arr2[p2];
        p2++;
        continue;
      } else if (p2 == arr2.length) {
        result[i] = arr1[p1];
        p1++;
        continue;
      }

      if (arr1[p1] < arr2[p2]) {
        result[i] = arr1[p1];
        p1++;
      } else {
        result[i] = arr2[p2];
        p2++;
      }
    }

    Arrays.stream(result).forEach(n -> System.out.printf("%d ", n));
    System.out.println();
    double median;
    int len = result.length;
    if (len % 2 == 1) {
      median = result[len / 2];
    } else {
      median = (result[len / 2 - 1] + result[len / 2]) / 2.0;
    }

    System.out.printf("Middle number: %s%n", median);
  }
}
