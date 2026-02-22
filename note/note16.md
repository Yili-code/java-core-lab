# Interface

當部分子類別有**共通能力**時，可抽成 interface ，讓不同類別實作同一套行為。

- 一個 class 可**實作多個 interface ，彌補 Java 的單一繼承**限制。
- **Interface 隔離原則**：設計精簡、聚焦的 interface ，而非龐大單一的 interface 。

---

## 核心語法

```java
public class MyClass implements Interface1, Interface2 { ... }
```

- `implements` 後可接多個 interface ，以逗號分隔。

---

## 核心特性


| 特性               | 說明                                                                                                |
| ---------------- | ------------------------------------------------------------------------------------------------- |
| **不可實例化**        | Interface 無法 `new`、**沒有建構子**。                                                                     |
| **實作類別的義務**      | 實作類別必須**覆寫 interface 中所有 abstract method**；若多 interface 有同名方法，只需寫一次。若無法全部實作，則實作類別須宣告為 `abstract`。 |
| **成員變數**         | 只能是**常數**；預設為 `public static final`。                                                              |
| **Interface 繼承** | interface 可繼承其他 interface （`extends`），一個 interface 可繼承多個 interface 。                              |


---

## 適用情境

適用於 **Interface** 的情境：

- 多個**不相關的類別**需要支援相同能力（如 `Comparable`、`Serializable`）。
- 定義 **API 合約**；依賴注入、測試時依賴 interface 型別。
- 需要**多重合約**（一個類別實作多個 interface ）。