## `Arrays.stream(arr3).forEach(n -> System.out.printf("%d ", n));`

`Arrays.stream(arr3)`
將傳入的陣列 `arr3` 轉換為一個 `Stream` 物件
如果 `arr3` 是 `int[]`，它會回傳一個 `IntStream` (針對原始型別優化的串流)，避免了頻繁的 Auto-boxing 帶來的效能損耗 

- Primitive Specializations of Streams

`forEach(...)` -> Terminal Operation
它會觸發串流的遍歷，對每一個元素執行括號內的行為。一旦執行，串流即被消耗，無法再次使用

`n -> System.out.printf(...)` -> Lambda Expression
實現了 Consumer<T> 介面，接受一個參數 n 且不回傳任何結果。

---
在 Java 中，為了 implement 代碼復用，我們使用 Generics mechanism，它允許我們定義 Parameterized Types (Ex. `List<T>`)，像是在容器上貼上一個「僅限某種物件」的標籤。然而，generics 在底層必須統一處理成 object，無法直接容納沒有 object header 的 primitive type (Ex. `int`)，為了解決此問題，Java 引入 auto-boxing，將 primitive data 直接包裝成帶有 object header 的 object，好讓他們可以放進那些使用 parameterized types 的容器。


---
### Auto-boxing
Java compiler 在 Primitive Types 與其對應的 物件封裝類別 (Wrapper Classes) 之間自動進行的轉換過程。具體而言，將原始型別（如 int）轉換為物件（如 Integer）稱為 Auto-boxing；反之則稱為 Unboxing（拆箱）

## 為何需要 `Auto-boxing`?
Java 的 generics 不支援 primitive types。如果想在 `ArrayList` 中儲存整數，必須使用 `ArrayList<Integer>`。 Auto-boxing 讓我不需要手動轉換就能 `list.add(10)`。

```Java
// 這是錯誤的，編譯不會過 
// int -> primitive types not object, no having object header
List<int> list = new ArrayList<>(); 

// 你必須這樣寫
List<Integer> list = new ArrayList<>();
```

---
## Generics
泛型是一種「參數化型別」(Parameterized Types) 的機制，允許程式設計師在定義類別、介面或方法時，不預先指定具體的資料型別，而是將型別當作參數傳遞。其核心目的在於 編譯時期的型別安全 (Type Safety) 與 減少型別轉換 (Casting) 的繁瑣。

### Parameterized Types
指在宣告時不指定具體型別，而是透過「型別參數」（如 T, E）來定義，直到實例化時才確定其真實身份。 `List<T>` -> T must be Object.


### Object Header
每一個在 Heap 中產生的物件，除了存放資料本身，還必須包含一段額外的空間 (通常是 8-16 bytes)，用於存放 Mark Word (鎖狀態、GC 分代年齡) 與 Klass Pointer (指向類別元數據的 pointer)。

`int` (Primitive): 本身就是 value storing in Stack.
`Integer` (Object): 像一個保險箱，包含資料本身、Object Header，storing in Heap. 只有指向這個保險箱的 Reference.


### 泛型的限制
Java 的泛型是透過 型別擦除 (Type Erasure) 實作的。簡單來說，編譯器在執行時會把所有的泛型標記（如 <T>）擦除並替換為 Object。Object 可以指向任何類別（String, Integer, User...），但是，Object 不能儲存 int, double 等原始型別，因為它們在記憶體中只是純粹的數值，沒有物件標頭 (Object Header)。

