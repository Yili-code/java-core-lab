# Stack 與 Heap（堆疊與堆）

## Stack（堆疊）

- 管理者：由作業系統與執行緒自動分配與釋放（每個執行緒有自己的 stack）。

- 結構：遵循 LIFO（後進先出），以 stack frame 為單位保存函式呼叫時的參數、區域變數、回傳位址等。

- 存放：原始型別值（primitives）與物件參考（references）。在 Java 中，變數本身（例如 `User user`）儲存的是參考，物件實體位於 Heap。

- 特性：存取速度快、配置開銷低、碎片化風險小；但大小固定且有限（每個執行緒的 stack size 有上限）。

- 生命週期：隨方法/函式返回自動釋放。

## Heap（堆）

- 管理者：由執行環境（在 Java 中為 JVM）管理，透過 `new` 分配，並由 GC（Garbage Collector）回收。

- 存放：物件實體與陣列（objects and arrays）。

- 特性：空間彈性較大（受 JVM/系統設定限制），但分配與回收成本較高，可能產生記憶體碎片與較慢的存取延遲。

- 生命週期：由引用關係與 GC 決定；無強引用且無其他可達路徑時，物件才會被回收。

```java
public void myMethod() {
    int age = 22;              // 原始型別，值儲存在 stack frame
    User user = new User();    // 變數 `user`（reference）在 stack，物件實體在 heap
}
```

`age` 儲存整數值於 stack。

`new User()` 在 heap 建立物件並回傳 reference。

`user` 儲存對 heap 上物件的 reference。


## 實務與效能考量

- 物件分配成本：頻繁在 heap 建立短命物件會增加 GC 壓力，影響效能；可用物件重用、緩衝或使用原始型別減少分配次數。

- 記憶體限制：調整 JVM 參數（如 `-Xms`/`-Xmx`）以控制 heap 大小；注意每個執行緒的 stack size（如 `-Xss`）。


## 常見記憶體問題與預防

- OOM（OutOfMemoryError）：通常因為 heap 被大量可達物件佔用、記憶體洩漏（例如長生存期的集合、靜態容器、ThreadLocal 未清理）或配置不足所致。

- 記憶體洩漏模式：靜態集合持有參考、監聽器未移除、資源未關閉、長時間 ThreadLocal。

- 預防措施：使用弱引用（`WeakReference`）、限制快取大小、主動清理長生存物件、寫單元/整合測試模擬高負載場景。

## 小結

- Stack：快速、生命週期短、儲存原始值與參考。適合短期、頻繁的本地運算。

- Heap：彈性大、由 GC 管理、儲存物件實體。需關注分配頻率與回收策略以避免效能或記憶體問題。

- stack, heap, method: 

-- stack: method 被調用進 stack 執行，當執行完畢自動釋放

-- heap: new

-- method: 相關字節碼文件 (class)存儲