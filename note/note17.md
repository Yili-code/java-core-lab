# Inner Class

An **inner class** (nested class) is a class **defined inside another class**. It is used to strengthen **encapsulation** and to keep closely related logic together, often with direct access to the **outer class’s private members**.

---

## Table of Contents

1. [Why Use Inner Classes](#why-use-inner-classes)
2. [Types of Nested Classes](#types-of-nested-classes)
3. [Access to Outer Class](#access-to-outer-class)
4. [When to Use](#when-to-use)
5. [Summary](#summary)

---

## Why Use Inner Classes

- **Encapsulation** — Hide implementation details; the inner class is not exposed as a top-level type if not needed.
- **Logical grouping** — Types that are only used in one place can live inside the class that uses them.
- **Access to outer instance** — Non-static inner classes hold a reference to the enclosing object and can access its **private** members (and vice versa in scope).

---

## Types of Nested Classes

| Type | Keyword / Syntax | Has reference to outer instance? | Typical use |
|------|-------------------|----------------------------------|-------------|
| **Non-static inner class** | Class inside another class (no `static`) | Yes | Helper tied to one outer instance; callbacks, builders. |
| **Static nested class** | `static class` inside another class | No | Grouping without needing outer instance; often for structure (e.g. `Map.Entry`). |
| **Local class** | Class inside a method block | Yes (if in instance method) | One-off type used only in that method. |
| **Anonymous class** | `new Interface() { }` or `new Class() { }` | Yes (if in instance method) | One-off implementation of interface or subclass. |

---

## Access to Outer Class

- A **non-static** inner class has an implicit reference to the **outer object** (`Outer.this`). It can read and use the outer class’s **private** fields and methods.
- A **static** nested class has **no** outer instance; it can only access static members of the outer class (and must have an explicit reference to access instance members).

---

## When to Use

- Use an **inner class** when the type is only relevant inside one class and benefits from direct access to that class’s instance state.
- Use a **static nested class** when you only need logical grouping or structure, without needing the outer instance.

---

## Summary

- **Inner class** = class inside another class; improves encapsulation and keeps related types together.
- Non-static inner classes can access the **outer instance’s private members**; static nested classes cannot.
