# Static vs Instance

`static` 表示類別載入時即存在（存放於 Method Area），無須建立物件即可存取；適合無狀態（stateless）或共用資源。

`實例化（instantiate）`：將類別轉為記憶體中的物件，頻繁建立物件會增加 GC 次數，可能影響效能。

Thread Safety
- Static：若多執行緒同時修改共用靜態資料，可能產生競爭條件（Race Condition）。
- Instance：每個執行緒通常操作自己的物件狀態，隔離性較好，但較耗記憶體。

---

# GC（Garbage Collection）
GC 會回收不再被引用的 Heap 物件。GC 運作時有時會觸發 Stop-The-World（STW），短暫暫停應用執行以清理記憶體，需注意延遲與吞吐量折衷。

---

# Singleton Pattern
確保一個類別在整個應用生命週期只有一個實例。

優點：集中資源管理（例如連線池）、可以延遲初始化（lazy initialization）、容易在不同環境替換實作（介面導向）。

---

# Double-Checked Locking（DCL）
在多執行緒環境下常用於懶載入單例，但需要正確的同步與記憶體可見性（`volatile` 在 Java 中通常是必要的）。

範例（簡化）：

```java
private static volatile PaymentGateway instance;

public static PaymentGateway getInstance() {
    if (instance == null) {
        synchronized (PaymentGateway.class) {
            if (instance == null) {
                instance = new PaymentGateway();
            }
        }
    }
    return instance;
}
```

---

# Stack vs Heap

- Stack：儲存方法呼叫、區域變數與基本型別，由系統自動分配與釋放，每個執行緒擁有獨立 Stack（執行緒安全）。
- Heap：儲存物件與陣列，由 `new` 產生並由 GC 管理，為所有執行緒共用（需注意同步問題）。

若 `static` 方法只使用區域變數，該方法在記憶體層級上仍是執行緒安全的，因為每個執行緒有自己的區域變數副本。