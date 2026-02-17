# static

**Static** members belong to the **class**, not to individual instances. They are shared by all objects of that class and are loaded when the class is loaded (typically stored in the Method Area).

---

## Table of Contents

1. [Rules](#rules)
2. [main Method](#main-method)
3. [Summary](#summary)

---

## Rules

| Rule | Description |
|------|-------------|
| **1** | Static methods can only access **static** variables and other **static** methods (they cannot directly access instance members). |
| **2** | Instance (non-static) methods can access **both** static and instance members. |
| **3** | Static methods have **no `this`** reference (there is no current object). |
| **4** | Static members are loaded with the **class** and exist **before** any object is created. |
| **5** | Instance members exist only **after** an object is created. |

---

## main Method

```java
public static void main(String[] args)
```

| Modifier | Meaning |
|----------|---------|
| **public** | Maximum visibility so the JVM can invoke it from anywhere. |
| **static** | Invoked on the class without creating an instance; other methods in the same class used for testing are often static as well so they can be called without an object. |

---

## Summary

- **static** = class-level, shared, no `this`, loaded with the class.
- **non-static** = instance-level, per object, has `this`, created with the object.
