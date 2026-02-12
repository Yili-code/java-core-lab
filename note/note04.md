## Streams, Lambda, and Generics

```java
Arrays.stream(arr3).forEach(n -> System.out.printf("%d ", n));
```

利用 Java Stream API 將 array `arr3` 封裝唯一個具備延遲求值特性的 Stream Object，並透過 Internal Iteration mechanism，將一個符合 Consumer functional interface 規範的 lambda expression 應用於 Stream 中的每個元素，最終在準輸出執行具格式化的 terminal operation.

`Arrays.stream(T[] array)`：將陣列 `array` 轉為 `stream`，轉化為一個具備函數編程能力的序列化元素流 `Sequence of Elements` ；若 `array` 為 `int[]`，回傳 `IntStream`，這是針對 primitive 的特殊化（primitive specialization），可以避免大量 auto-boxing 的效能損耗。

`forEach(n -> System.out.printf("%d ", n));` forEach 規定參數必須是一個 `Consumer` (有輸入沒輸出)，在 Compiler 進行檢查 型別斷定(Type Inference) 後就會將其編譯為 Consumer interface 的實作

## Array 與 Stream

`Array` -> Data Structure

`Stream` -> Comutational Pipeline，負責對資料進行聲明式的處理與轉換

### Mutablility vs. Immutability

`Array` -> 可以直接修改特定引索的值，具有 side effects

`Stream` -> 函數式。所有的轉換都會回傳一個新的 Stream，而不會更動原本的資料源，對於 Concurrency 極為重要。

## Generics 與 Auto-boxing

Java 的泛型（Generics）提供參數化型別（如 `List<T>`），可以在編譯期提供型別安全並減少顯式轉型。但 Java 的泛型在執行期採用型別擦除（type erasure），因此泛型參數不能是 primitive types（如 `int`）。

為了在泛型容器中使用原始型別，Java 需要將原始型別封箱（boxing）成對應的包裝類別（wrapper class，例如 `int` ↔ `Integer`），這個過程編譯器會自動處理（auto-boxing / unboxing）。

範例：

```java
// 錯誤：泛型不能使用原始型別
List<int> list = new ArrayList<>(); 

// 正確：使用包裝類別
List<Integer> list = new ArrayList<>();
```

### 物件標頭（Object Header）
物件在 Heap 中會有額外表頭（例如 Mark Word、Klass Pointer），而 primitive 值通常直接儲存在變數或陣列中。封箱會將 primitive 包成物件並放到 Heap，會帶來額外記憶體與效能成本。

### 小結
- 若對效能敏感且需大量原始型別操作，可優先使用 primitive-specialized APIs（如 `IntStream`）或維持原生陣列，避免不必要的封箱/拆箱。
