# Interface

An **interface** is a **fully abstract** contract that defines **what an object can do** (its capabilities), not what it **is**. It acts as an agreement between the caller and the implementation.

- A class can **implement multiple interfaces**, which compensates for Java’s **single inheritance** (only one superclass).
- The **Interface Segregation Principle** (from SOLID) recommends designing focused interfaces rather than large, monolithic ones — important for clear and maintainable APIs.

---

## Table of Contents

1. [Core Idea](#core-idea)
2. [Abstract Class vs Interface (Essential Difference)](#abstract-class-vs-interface-essential-difference)
3. [When to Use Which](#when-to-use-which)
4. [Example](#example)
5. [Summary](#summary)

---

## Core Idea

- **Interface** = contract: method signatures (and optionally default/static methods), no instance state.
- **Implements** = the class guarantees it provides those methods; callers depend on the interface type.

---

## Abstract Class vs Interface (Essential Difference)

| Focus | Abstract class | Interface |
|-------|----------------|-----------|
| **Identity** | “What the object **is**” — part of a class hierarchy with shared state and behavior. | “What the object **can do**” — a set of capabilities (behavior only). |
| **State** | Can have fields, constructors, and shared implementation. | No instance fields (only `public static final` constants traditionally). |
| **Inheritance** | Single: one abstract (or concrete) superclass. | Multiple: a class can implement many interfaces. |

**Rule of thumb:** Use an **abstract class** when you care about **identity and shared implementation**; use an **interface** when you care about **behavior and multiple contracts**.

---

## When to Use Which

- **Interface** — Multiple unrelated classes need to support the same capability (e.g. `Comparable`, `Serializable`); API boundaries; dependency injection and testing.
- **Abstract class** — Several classes share a lot of code and a clear “is-a” relationship; you need shared fields or constructors.

---

## Example

```java
public interface Drawable {
    void draw();
}

public class Circle implements Drawable {
    @Override
    public void draw() { /* ... */ }
}

// Another class can also implement Drawable and other interfaces
public class Button implements Drawable, Clickable { }
```

---

## Summary

- **Interface** = contract (capabilities); **abstract class** = template (identity + shared code).
- Prefer **small, focused interfaces** (Interface Segregation) for better API design.
