## `Arrays.stream(arr3).forEach(n -> System.out.printf("%d ", n));`

`Arrays.stream(arr3)`
將傳入的陣列 `arr3` 轉換為一個 `Stream` 物件
如果 `arr3` 是 `int[]`，它會回傳一個 `IntStream` (針對原始型別優化的串流)，避免了頻繁的 Auto-boxing 帶來的效能損耗 

- Primitive Specializations of Streams

- Auto-boxing

`forEach(...)` -> Terminal Operation
它會觸發串流的遍歷，對每一個元素執行括號內的行為。一旦執行，串流即被消耗，無法再次使用

`n -> System.out.printf(...)` -> Lambda Expression
實現了 Consumer<T> 介面，接受一個參數 n 且不回傳任何結果。