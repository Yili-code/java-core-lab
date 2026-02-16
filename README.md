# java-core-lab

Java 基礎與 OOP 範例、練習。

## 結構

```
lab/javacore/
├── variable/     VariableDemo1～3
├── datatype/     DatatypeDemo1
├── operator/     OperatorDemo1～3
├── switchdemo/   SwitchDemo1～2
├── oop/          oopDemo1～7（OOP 與繼承）
├── practice/     P001～P012 單檔；p013、p014 多類別
├── enumtest/     enumDemo1（OrderState）
└── finall/       finalDemo1（Circle）
note/
```

## 目錄與套件對應

| 目錄 | 套件 |
|------|------|
| variable/ | lab.javacore.variable |
| datatype/ | lab.javacore.datatype |
| operator/ | lab.javacore.operator |
| switchdemo/ | lab.javacore.switchdemo |
| oop/oopDemoN | lab.javacore.oop.oopDemoN |
| practice/ | lab.javacore.practice |
| enumtest/enumDemo1/ | lab.javacore.enumtest.enumDemo1 |
| finall/finalDemo1/ | lab.javacore.finall.finalDemo1 |

## 編譯與執行

單一類別（例如練習 P001）：

```bash
javac lab/javacore/practice/P001.java
java lab.javacore.practice.P001
```

單一模組（例如 oopDemo4）：

```bash
javac lab/javacore/oop/oopDemo4/*.java
java lab.javacore.oop.oopDemo4.Test
```

全量編譯（PowerShell）：

```powershell
javac -d out (Get-ChildItem -Path lab\javacore -Recurse -Filter *.java).FullName
```

執行時使用完整類別名（點號），例如：`java lab.javacore.practice.P012`。
