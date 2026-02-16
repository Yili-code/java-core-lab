# Java Core Lab 目錄結構

本目錄為 Java 核心練習專案，結構說明如下。

## 目錄與套件對應

| 目錄 | 套件 | 說明 |
|------|------|------|
| `variable/` | `lab.javacore.variable` | 變數與輸出練習（VariableDemo1～3） |
| `datatype/` | `lab.javacore.datatype` | 資料型別與陣列（DatatypeDemo1） |
| `operator/` | `lab.javacore.operator` | 運算子與流程控制（OperatorDemo1～3） |
| `switchdemo/` | `lab.javacore.switchdemo` | switch 語法（SwitchDemo1～2） |
| `oop/oopDemo1～7` | `lab.javacore.oop.oopDemoN` | OOP 與繼承範例 |
| `practice/` | `lab.javacore.practice` | 綜合練習（依內容命名的單檔；p013、p014 多類別） |
| `enumtest/enumDemo1/` | `lab.javacore.enumtest.enumDemo1` | 列舉（OrderState） |
| `finall/finalDemo1/` | `lab.javacore.finall.finalDemo1` | final 與 Circle 範例 |

## 命名與慣例

- **類別與檔名**：Demo 類別採 PascalCase，檔名與類別名一致（如 `SwitchDemo1.java`、`OperatorDemo1.java`）。
- **套件**：每個模組依路徑使用對應 `lab.javacore.*` 套件，與目錄結構一致。
- **practice**：單一題目單檔，檔名與類別依內容命名；p013、p014 為子目錄，內含多個類別與 `Test.java`。
- **finall**：目錄名為 `finall`（因 `final` 為 Java 關鍵字）。

### practice 單檔對照（檔名 = 類別名，依內容命名）

| 檔名 | 說明 |
|------|------|
| GuessNumber | 猜數字遊戲 |
| UniqueRandomArray | 不重複亂數陣列 |
| MergeSortArrays | 兩陣列合併並排序 |
| ArraySearch | 陣列搜尋目標值 |
| RandomUniqueArray | 不重複隨機數（含 check 方法） |
| ScoreAverage | 五筆分數去最高最低取平均 |
| ScoreStats | 十筆分數的不及格率、平均、最高分 |
| RemoveTargetFromArray | 移除陣列中所有目標值 |
| SplitMoneyRandomly | 將 M 隨機分為 N 份 |
| MergeArraysMedian | 兩有序陣列合併求中位數 |
| VoteRate | 候選人得票與投票率 |
| TrappingRainWater | 接雨水問題 |

## 編譯與執行範例

從專案根目錄或 `lab/javacore` 下，依套件編譯後執行主類，例如：

```bash
javac lab/javacore/oop/oopDemo4/*.java
java lab.javacore.oop.oopDemo4.Test
```
