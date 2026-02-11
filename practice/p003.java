package practice;
import java.util.Arrays;

public class p003 {
  public static void main(String[] args) {
    int[] arr1 = {1, 3, 5, 7, 9};
    int[] arr2 = {2, 4, 6, 8, 10};
    int[] arr3 = new int[arr1.length + arr2.length];
    
    System.arraycopy(arr1, 0, arr3, 0, arr1.length);
    System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
    Arrays.sort(arr3);
    
    Arrays.stream(arr3).forEach(n -> System.out.printf("%d ", n));
    System.out.println();
  }
}


/* 
`Arrays.stream(arr3) 將傳入的陣列 `arr3` 轉換為一個 `Stream` 物件
如果 `arr3` 是 `int[]`，它會回傳一個 `IntStream` (針對原始型別優化的串流)，避免了頻繁的 Auto-boxing 帶來的效能損耗 
*/