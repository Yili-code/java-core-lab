# Polymorphism

**Polymorphism** means that the **same operation** (e.g. a method call) can exhibit **different behavior** depending on the actual type of the object. In Java, this is often achieved by using a **parent-type reference** that points to a **child-type object**.

---

## Table of Contents

1. [Core Syntax](#core-syntax)
2. [Static vs Dynamic Polymorphism](#static-vs-dynamic-polymorphism)
3. [Why It Matters](#why-it-matters)
4. [Use in Backend Development](#use-in-backend-development)

---

## Core Syntax

```java
Parent obj = new Child();
```

- The **compile-time type** of `obj` is `Parent` (what the compiler allows you to call).
- The **runtime type** is `Child`; overridden methods are invoked based on the **actual object type** (dynamic dispatch).

---

## Static vs Dynamic Polymorphism

| Type | Mechanism | When Resolved | Example |
|------|-----------|----------------|---------|
| **Static polymorphism** | **Method overloading** — same method name, different parameter lists. | **Compile time** | `println(String)` vs `println(int)` |
| **Dynamic polymorphism** | **Method overriding** — subclass provides its own implementation of a superclass method. | **Runtime** | `Parent p = new Child(); p.doWork();` runs `Child`’s `doWork()` |

Dynamic polymorphism is central to **extensibility**: you can add new subtypes without changing code that depends on the parent type.

---

## Why It Matters

- **Extensibility** — New behavior can be added by introducing new subclasses; existing code that uses the parent type automatically benefits.
- **Abstraction** — Callers depend on the abstract type (interface or parent class), not concrete implementations.
- **Testability** — Dependencies can be replaced with mocks or stubs that implement the same type.

---

## Use in Backend Development

- **Dependency Injection (DI)** — Frameworks (e.g. Spring) inject implementations based on interfaces or abstract types; polymorphism allows swapping implementations without changing callers.
- **APIs and plugins** — Define interfaces or base classes; third-party or internal code provides concrete implementations that are used polymorphically.
