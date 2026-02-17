# Streams, Lambda, and Generics

## Table of Contents

1. [Stream API Example](#stream-api-example)
2. [Array vs Stream](#array-vs-stream)
3. [Generics and Auto-boxing](#generics-and-auto-boxing)
4. [Summary](#summary)

---

## Stream API Example

```java
Arrays.stream(arr3).forEach(n -> System.out.printf("%d ", n));
```

This wraps the array `arr3` in a **Stream** with **lazy evaluation**, uses **internal iteration**, and applies a **lambda** that conforms to the `Consumer` functional interface to each element, then performs a **terminal operation** (formatted print to standard output).

- **`Arrays.stream(T[] array)`** — Converts an array into a `Stream` (a sequence of elements with functional-style operations). For `int[]`, it returns **`IntStream`** (primitive specialization), avoiding repeated auto-boxing and improving performance.
- **`forEach(n -> System.out.printf("%d ", n))`** — `forEach` requires a **`Consumer<T>`** (accepts one argument, returns void). The compiler uses **type inference** to compile the lambda as an implementation of `Consumer`.

---

## Array vs Stream

| Concept | Array | Stream |
|--------|--------|--------|
| **Role** | Data structure | Computational pipeline: declarative processing and transformation |
| **Mutability** | Elements can be modified by index (side effects) | Functional: transformations return a **new** stream; the original source is not modified. Important for concurrency. |

---

## Generics and Auto-boxing

- **Generics** provide parameterized types (e.g. `List<T>`), giving **compile-time type safety** and reducing explicit casts.
- Java generics use **type erasure** at runtime, so **generic type parameters cannot be primitive types** (e.g. `int`).

To use primitives in generic containers, Java **boxes** them into wrapper classes (e.g. `int` ↔ `Integer`). The compiler handles **auto-boxing** and **unboxing**.

**Example:**

```java
// Error: generics do not allow primitive types
List<int> list = new ArrayList<>();

// Correct: use wrapper class
List<Integer> list = new ArrayList<>();
```

### Object Header and Boxing Cost

Objects in the heap have an **object header** (e.g. Mark Word, Klass pointer). Primitives can be stored directly in variables or arrays. Boxing stores a primitive inside an object on the heap, adding memory and performance cost.

### Summary

- For performance-sensitive code with many primitive operations, prefer **primitive-specialized APIs** (e.g. `IntStream`) or plain arrays to avoid unnecessary boxing/unboxing.
