# java-core-lab

一個用於練習與記錄 Java 基礎與物件導向概念的小型範例庫，收錄變數、運算子、流程控制、類別與練習題等範例程式碼，適合初學者與自我練習使用。

## 目錄

- 簡介

- 專案結構
- 如何編譯與執行

## 專案結構（重點）

- `code/`：範例程式碼與練習題。
  - `datatype/`、`operator/`、`variable/`、`switch/`、`oop/` 等分類資料夾。
- `note/`：學習筆記（Markdown）。
- `practice/`：練習題檔案（例如 `p001.java` ~ `p012.java`）。

若要瀏覽完整檔案列表，請查看 repository 內容。

## Compile and Run

1. 編譯單一檔案（以 `p012.java` 為例）：

```
javac -d out code\practice\p012.java
java -cp out p012
```

2. 編譯整個 `code` 資料夾（簡單示範）：

```
javac -d out code\**\*.java
```
