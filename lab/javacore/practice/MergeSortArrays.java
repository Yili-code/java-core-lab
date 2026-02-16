package lab.javacore.practice;

import java.util.Arrays;

public class MergeSortArrays {
  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 5, 7, 9 };
    int[] arr2 = { 2, 4, 6, 8, 10 };
    int[] arr3 = new int[arr1.length + arr2.length];

    System.arraycopy(arr1, 0, arr3, 0, arr1.length);
    System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
    Arrays.sort(arr3);

    Arrays.stream(arr3).forEach(n -> System.out.printf("%d ", n));
    System.out.println();
  }
}
