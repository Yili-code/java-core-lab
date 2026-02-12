## Streams, Lambda, and Generics

```java
Arrays.stream(arr3).forEach(n -> System.out.printf("%d ", n));
```

`Arrays.stream(arr3)`：將陣列 `arr3` 轉為 `stream`；若 `arr3` 為 `int[]`，回傳 `IntStream`，這是針對 primitive 的特殊化（primitive specialization），可以避免大量 auto-boxing 的效能損耗。

- `forEach(...)`：終端操作（terminal），會遍歷串流並執行指定動作；執行後串流被消耗，無法重複使用。
- `n -> System.out.printf(...)`：Lambda Expression，實作 `Consumer<T>`，接受參數且不回傳值。



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
