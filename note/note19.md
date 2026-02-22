# Interface：Default / Static / Private 方法

為了讓 interface 升級時能向下相容，Java 允許在介面中定義**有方法體**的方法：`default`、`static`，以及 Java 9+ 的 `private`。

---

## 為什麼需要 default？

**需求**：想在介面裡新增方法，又不希望所有實作類別立刻編譯錯誤。

若用抽象方法，所有實作類別都必須馬上實作，否則編譯失敗：

```java
public interface Inter {
    int method();
    int newMethod01();  // 新增 → 所有 impl 都要改
    int newMethod02();
}

public class InterImpl01 implements Inter {
    @Override
    public int method() { return 0; }
    // 必須實作 newMethod01、newMethod02，否則編譯錯誤
}

public class InterImpl02 implements Inter {
    @Override
    public int method() { return 0; }
    // 同上
}
```

- 多個實作類別不方便同時修改。
- **解法**：新方法用 `default` 給預設實作，實作類別不必立刻 override，有需要再覆寫即可。

```java
public interface Inter {
    int method();
    default void newMethod() { /* 預設實作 */ }
}
```

### default 使用注意

1. **Override 時**：實作類別覆寫時不要寫 `default`，只寫 `public void newMethod() { ... }`。
2. **修飾子**：`public` 可省略；`default` 不可省略。
3. **多重實作**：若子類別實作多個介面，且這些介面有**同名同參數**的 default 方法，子類別必須 override 該方法以消除歧義。

---

## Static 方法

1. **不可被 override**：介面的 `static` 方法屬於介面本身，實作類別不會繼承、也不能 override。
2. **呼叫方式**：用**介面名稱**呼叫，例如 `Inter.staticMethod()`；不應以「實作類別名稱」當作呼叫主體（語意上屬於介面，不屬於某個實作類）。

---

## Private 方法（Java 9+）

若多個 default 方法（或 static 方法）裡有重複邏輯，可抽成介面內部的 **private** 方法，避免重複、且不暴露給外部。

```java
public interface Inter {
    default void function1() {
        function();  // 共用邏輯
    }
    default void function2() {
        function();
    }
    private void function() {
        // 重複邏輯，僅供本介面內使用
    }
}
```

- 外部無法呼叫 `function()`，僅供介面內的 default/static 方法使用。
