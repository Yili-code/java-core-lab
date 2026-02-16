# java-core-lab

Java 基礎與 OOP 範例、練習。規範見 [STANDARDS.md](STANDARDS.md)。

## 結構

```
lab/javacore/
├── oop/        variable/   datatype/   switchdemo/   operator/
└── practice/   (p001～p012)
note/           .cursor/rules/
```

## 編譯與執行

單檔：

```bash
javac lab/javacore/oop/Cook.java lab/javacore/oop/test.java
java lab.javacore.oop.test
```

全量編譯（PowerShell）：

```powershell
javac -d out (Get-ChildItem -Path lab\javacore -Recurse -Filter *.java).FullName
```

執行：`java <完整類別名>`，類別名用點（如 `lab.javacore.practice.p012`），不用斜線。
