# Abstract Class

An **abstract class** is a class that **cannot be instantiated** directly. It serves as a **template** for subclasses and defines a contract (including optional concrete behavior and required abstract methods) that subclasses must follow.

---

## Table of Contents

1. [Core Syntax](#core-syntax)
2. [Core Characteristics](#core-characteristics)
3. [When to Use](#when-to-use)
4. [Abstract Class vs Interface](#abstract-class-vs-interface)

---

## Core Syntax

Use the **`abstract`** keyword:

```java
public abstract class BaseService {
    // abstract and/or concrete members
}
```

- You cannot write `new BaseService()`.
- Subclasses extend it and typically implement or override abstract methods.

---

## Core Characteristics

| Feature | Description |
|--------|-------------|
| **Abstract methods** | Declared with `abstract`; no body in the abstract class; **must** be implemented by concrete subclasses. |
| **Concrete methods** | Can have normal method bodies; subclasses may override them or use as-is. |
| **Fields and constructors** | Abstract classes can have **member variables** and **constructors** (e.g. for shared initialization). Subclasses call `super(...)` from their constructors. |

---

## When to Use

Use an **abstract class** when:

- You have a **group of closely related classes** that share a lot of code.
- Some **core behavior** must be defined by each subclass (abstract methods).
- You want to share **state** (fields) and **constructors** in the hierarchy.

**Example:** A **BaseService** that defines common setup and lifecycle, with subclasses implementing specific business logic.

---

## Abstract Class vs Interface

| Aspect | Abstract class | Interface |
|--------|----------------|-----------|
| **Identity** | Describes **what the object is** (e.g. a kind of service). | Describes **what the object can do** (capabilities / contract). |
| **State** | Can have instance fields and constructors. | No instance fields (before Java 8); only constants. |
| **Inheritance** | Single inheritance (one superclass). | A class can implement **multiple** interfaces. |
| **Default code** | Full method bodies, shared logic. | Default methods (Java 8+) for backward compatibility. |

In short: **abstract class ≈ identity / shared implementation**; **interface ≈ contract / behavior**.
