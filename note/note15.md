# abstract class（Abstract Class）

若某方法無法在 superclass 給出具體實作，則宣告為 `abstract`；**含有 abstract method 的 class 即為 abstract class**。

---

## 核心語法

使用 `**abstract`** 關鍵字宣告 class：

```java
public abstract class BaseService {...}
```

- 無法 `new BaseService()` 直接實例化。
- subclass 繼承後，**必須**實作或覆寫所有 abstract method（編譯器強制，避免遺漏）。
- **abstract class** 是一種**無法直接實例化**的 class，作為子 class 的**範本**，定義子 class 必須遵循的合約（可選的具體行為 + 必須實作的 abstract method ）。

---

## 核心特性


| 特性              | 說明                                                                  |
| --------------- | ------------------------------------------------------------------- |
| **abstract 方法** | 以 `abstract` 宣告、無方法本體；**必須**由具體子 class 實作。                          |
| **具體方法**        | 可有完整方法本體；子 class 可覆寫或直接使用。 abstract class 也可沒有 abstract method（罕見）。 |
| **欄位與建構子**      | 可有**成員變數**與**建構子**（共用初始化）； subclass 在建構子中呼叫 `super(...)`。           |


---

## 適用情境

適用於 **abstract class** 的情境：

- 有一**群密切相關的 class**，且共享大量程式碼。
- 部分**核心行為**須由各子 class 各自定義（abstract方法）。
- 想在繼承階層中共享**狀態**（欄位）與**建構子**。

**範例：** **BaseService** 定義共用設定與生命週期， subclass 實作各自業務邏輯。