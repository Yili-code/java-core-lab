package lab.javacore.oop.oopDemo3;

public class ArrayUtil1 {
  // private constructor -> 不讓外界創建對象
  private ArrayUtil1() {};

  public static void printArr(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length -1) {
        System.out.print(arr[i] + "]");
      } else {
        System.out.print(arr[i] + ", ");
      }
    }
    System.out.println();
  }

  public static void getAverage(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    System.out.printf("%.2f%n", (double) sum / arr.length);
  }
}
