// classic problem: catching the raindrop
package lab.javacore.practice;

import java.util.Arrays;

public class TrappingRainWater {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

    // from left to right
    int[] left = new int[arr.length];
    left = Arrays.copyOf(arr, arr.length);
    int height = arr[0];
    for (int i = 0; i < left.length; i++) {
      if (height > arr[i]) {
        left[i] = height;
      } else if (height < arr[i]) {
        height = arr[i];
      }
    }

    // from right to left
    int[] right = new int[arr.length];
    right = Arrays.copyOf(arr, arr.length);
    height = arr[arr.length - 1];
    for (int i = arr.length - 1; i >= 0; i--) {
      if (height > arr[i]) {
        right[i] = height;
      } else if (height < arr[i]) {
        height = arr[i];
      }
    }

    // compare left and right
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      if (left[i] < right[i]) {
        result[i] = left[i];
      } else {
        result[i] = right[i];
      }
    }

    // compare result and original array
    int sum = 0, max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) max = arr[i];
      if (arr[i] != result[i]) sum += result[i] - arr[i];
    }

    System.out.printf("Result: %d%n", sum);

    for (int i = 0; i < max; i++) {
      System.out.print("|");
      for (int j = 0; j < arr.length; j++) {
        if (j != 0) System.out.print(" ");
        if (arr[j] >= max - i) {
          System.out.print("H");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("|");
    }
  }
}
