# Polymorphism

多型是指同一個行為（方法）在不同的物件執行時，能表現出多種不同的形態。在 Java 中，這通常透過父類引用指向子類物件來達成。

## core syntax: `Parent obj = new Child();`

1. 編譯時多型 (Static Polymorphism)：方法多載 (Method Overloading)。

2. 運行時多型 (Dynamic Polymorphism)：方法覆寫 (Method Overriding)，這是 Java 後端開發的核心，也是依賴注入 (Dependency Injection) 的基礎

極大地提升了系統的擴展性 (Extensibility)