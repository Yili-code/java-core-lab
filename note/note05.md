# Stack and Heap

**Stack** and **Heap** are the two main memory regions used by the JVM for method execution and object storage.

---

## Table of Contents

1. [Stack](#stack)
2. [Heap](#heap)
3. [Code Example](#code-example)
4. [Practical Considerations](#practical-considerations)
5. [Common Memory Issues](#common-memory-issues)
6. [Summary](#summary)

---

## Stack

| Aspect | Description |
|--------|-------------|
| **Management** | Allocated and freed automatically by the OS/thread (each thread has its own stack). |
| **Structure** | **LIFO** (Last In, First Out); each **stack frame** holds method parameters, local variables, return address, etc. |
| **Contents** | Primitive values and **object references**. In Java, a variable such as `User user` holds a reference; the actual object lives on the **Heap**. |
| **Characteristics** | Fast access, low allocation cost, little fragmentation; size is fixed and limited (per-thread stack size has an upper limit). |
| **Lifecycle** | Freed automatically when the method returns. |

---

## Heap

| Aspect | Description |
|--------|-------------|
| **Management** | Managed by the JVM; allocated with `new`, reclaimed by the **Garbage Collector (GC)**. |
| **Contents** | Object instances and arrays. |
| **Characteristics** | Larger, flexible space (within JVM/system limits); higher allocation and GC cost; possible fragmentation and higher access latency. |
| **Lifecycle** | Determined by references and GC; objects are reclaimed when no strong references and no other reachable paths exist. |

---

## Code Example

```java
public void myMethod() {
    int age = 22;              // Primitive: value stored in stack frame
    User user = new User();    // Variable `user` (reference) on stack; object on heap
}
```

- **`age`** — Integer value stored on the stack.
- **`new User()`** — Creates an object on the heap and returns a reference.
- **`user`** — Holds the reference to that heap object.

---

## Practical Considerations

- **Object allocation cost:** Frequent creation of short-lived objects increases GC pressure and can hurt performance. Consider object reuse, pooling, or using primitives to reduce allocations.
- **Memory limits:** Use JVM options such as **`-Xms`** / **`-Xmx`** to control heap size, and **`-Xss`** for per-thread stack size.

---

## Common Memory Issues and Prevention

| Issue | Causes / Patterns |
|-------|-------------------|
| **OOM (OutOfMemoryError)** | Heap exhausted by many reachable objects, **memory leaks** (e.g. long-lived collections, static holders, uncleaned `ThreadLocal`), or insufficient heap size. |
| **Leak patterns** | Static collections holding references; listeners not removed; resources not closed; long-lived `ThreadLocal` not cleared. |
| **Prevention** | Use **weak references** (`WeakReference`), limit cache size, clean up long-lived data, and test under load (unit/integration tests). |

---

## Summary

| Region | Role |
|--------|------|
| **Stack** | Fast, short-lived; holds primitives and references. Suited for local, frequent computation. |
| **Heap** | Large, GC-managed; holds object instances. Watch allocation rate and GC behavior to avoid performance or OOM issues. |
| **Method area** | Stores class metadata (e.g. bytecode). Methods are loaded and executed from here; when a method is invoked, a frame is pushed onto the **stack**; objects created with **`new`** go on the **heap**. |
