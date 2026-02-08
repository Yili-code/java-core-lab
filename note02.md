```java
public class HelloWorld {
  public static void main(String[] args) {
    system.output.println("Hello World!");
  }
}
```

`System` standard library 中的 class

`out` 是 System class 下在靜態成員，指向 `PrintStream` object 的 Reference.

雖然冗贅但提供架構上的嚴謹性: 明確的存取控制、類型宣告

--- 
# Static v. Instance

`static` 意味著 JVM 不需要實例化 (instantiate) 這個 class 就能執行此方法。
從記憶體角度看，他在 class 載入時就已存在於 Method Area，全域共享。

`Instantiate: class -> object` 
將抽象的 class 轉化為 Memory 中具體的 Object 的過程
頻繁 Instantiate 會導致 GC 頻繁啟動，進而影響 Throughput

`Thread Safety` 
- Static: 
多個 Thread 同時呼叫並修改，就會發生 Race Condition，導致數據錯亂。
static 適合無狀態 Stateless 的操作

- Instance:
每個 Thread 擁有自己獨立的 Instance ，彼此的數據 Isolation，雖然較耗記憶體但安全。

--- 
# GC Garbage Collection -  JVM 自動管理記憶體的機制
GC 會定期掃描 Heap Memory，找出那些不再被任何變數引用的物件，並將其占用的記憶體回收。
The Cost: GC 運作時，有時會觸發 Stop-The-World (`STW`)，即短暫暫停所有程式邏輯清理記憶體。

---
# Singleton Pattern - Design Pattern
確保一個 class 在整個 application 運行期間，只會有一個 Instance 存在

1. Resource Management
Without: 每個 User 進來都 new 一個連線，資料庫會瞬間崩潰
With: 整個 App 只有一個 DatabasePool 物件，所有人排隊共用它，這就是 `Resource Throttling`

2. Lazy Initializtion\Loading (延遲載入)
Static: 程式一啟動，這 2GB 就在記憶體裡了。
Singleton: 設計成直到第一個使用者呼叫 getInstance() 時，才去執行那耗時的 new 動作。這在優化啟動速度時至關重要

3. Polymorophism (面向介面編程)
可以寫一個 StorageService 介面，在測試環境時，Singleton 回傳的是記憶體模擬的儲存空間；在正式環境（Production），它回傳的是雲端 S3 的儲存空間。這種靈活性，static 做不到。

---
# (Unsolved) Double-Checked Locking `DCL`
這是在多執行緒（Multi-threading）環境下，為了確保 Singleton 真的只有一個而設計的防禦機制

```java
public static PaymentGateway getInstance() {
  if (instance == null) {
    instance = new PaymentGateway();
  }
  return instance;
}
```
假如兩個人同時點擊，系統會出現兩個 PaymentGateway -> Race Condition

```java
public static PaymentGateway getInstance() {
    // 第一層檢查：效能優化
    if (instance == null) {
        
        // T2 enter synchronized
        synchronized (PaymentGateway.class) {
            
            // 第二層檢查：
            if (instance == null) {
                instance = new PaymentGateway();
                // instantiate
            }
        }
    }
    return instance;
}
```

--- 
# Stack v. Heap

Stack stores `Local Variables`、method、basic types，由系統自動分配/釋放，Thread Safety: 安全(每個 Thread 有獨立的 Stack)

Heap stores `Objects/Instance`、array，由開發者透過 `new` 觸發，由 GC 回收。 Thead Safety: 不安全(所有 Thread 共享同個 Heap)

如果一個 `Static` method 中只使用局部變數 Local Variables，他是 Thread-Safety 的，因為每個呼叫該方法的 Thread ，都會在自己的 Stack 建立 Variables 副本，互不干涉。