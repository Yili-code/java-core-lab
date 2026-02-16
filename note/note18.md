# Encapsulation

將資料（屬性）與操作資料的方法（行為）綑綁在一起的機制，並對外部隱藏物件的內部實作細節，僅透過受控的介面（Interface）進行存取。

在後端開發的語境下，封裝就是建立一個「黑盒子」，外部使用者不需要知道內部的運作邏輯，只需要知道如何呼叫 API 或方法

## Access Modifiers

定義可見性的四個層級

`private` 僅限 class 內部 access 
`default` 僅限同一 package access
`protected` 允許同 package 以及所有 subclasses access
`public` 對全世界開放


## 為什麼封裝對後端工程師至關重要？

1. Maintainability

修改了內部的資料結構（例如將 List 改為 Set），只要對外的 Getter/Setter 或方法簽章（Method Signature）不變，所有調用該類別的代碼都不需要更動


2. Validation

封裝允許你在賦值時加入邏輯


3. Read-only Access

可以只提供 Getter 而不提供 Setter，使該物件在外部看來是「唯讀」的，這對於併發編程（Concurrent Programming）中的不可變性 (Immutability) 非常有幫助