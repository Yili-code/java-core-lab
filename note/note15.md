# Abstract Class

抽象類別是不能被實例化 (Instantiate) 的類別，旨在作為子類的通用模板，定義了一組子類必須遵循的規範。

## core syntax: `abstract`

## core characteristics

1. 可以包含具體方法 (Concrete Methods) 和抽象方法 (Abstract Methods)

2. 以擁有成員變量 (Fields) 與建構子 (Constructor)


## 使用場景

有一組密切相關的類別，且它們共享大部分代碼，但某些核心邏輯必須由子類自行定義時（例如：定義一個 BaseService）