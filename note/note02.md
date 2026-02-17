# Static vs Instance, GC, and Singleton

## Table of Contents

1. [Static vs Instance](#static-vs-instance)
2. [Garbage Collection (GC)](#garbage-collection-gc)
3. [Singleton Pattern](#singleton-pattern)
4. [Double-Checked Locking (DCL)](#double-checked-locking-dcl)
5. [Stack vs Heap (Summary)](#stack-vs-heap-summary)

---

## Static vs Instance

- **`static`** — Members exist when the **class** is loaded (stored in the **Method Area**). They can be accessed without creating an object; suitable for stateless or shared resources.
- **Instance (instantiate)** — Creating an **object** from a class in memory. Creating many short-lived objects increases GC activity and can affect performance.

### Thread Safety

| Type | Behavior |
|------|----------|
| **Static** | Shared across all instances and threads. If multiple threads modify static data without synchronization, **race conditions** can occur. |
| **Instance** | Each thread often works with its own object; better isolation but higher memory usage. |

---

## Garbage Collection (GC)

- GC reclaims **heap objects** that are no longer reachable (no references).
- During collection, GC may trigger **Stop-The-World (STW)**, briefly pausing the application. Tuning involves balancing **latency** and **throughput**.

---

## Singleton Pattern

Ensures that a class has **only one instance** throughout the application lifecycle.

**Benefits:** Centralized resource management (e.g. connection pools), optional **lazy initialization**, and easier substitution of implementations (e.g. via interfaces).

---

## Double-Checked Locking (DCL)

Often used for **lazy-initialized singletons** in multi-threaded environments. Requires correct synchronization and **memory visibility**; in Java, `volatile` on the instance field is typically necessary.

**Example (simplified):**

```java
private static volatile PaymentGateway instance;

public static PaymentGateway getInstance() {
    if (instance == null) {
        synchronized (PaymentGateway.class) {
            if (instance == null) {
                instance = new PaymentGateway();
            }
        }
    }
    return instance;
}
```

---

## Stack vs Heap (Summary)

- **Stack** — Method calls, local variables, and primitives; managed by the system; each thread has its own stack (thread-local). If a `static` method only uses local variables, it is thread-safe at the memory level because each thread has its own copy of those variables.
- **Heap** — Objects and arrays created with `new`; managed by GC; shared by all threads (synchronization may be required).
