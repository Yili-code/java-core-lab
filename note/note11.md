# final (Constants and Immutability)

The **`final`** keyword means the reference or variable can be assigned **only once** (for locals and fields) or that a method/class cannot be overridden or extended.

---

## Table of Contents

1. [Variables and Constants](#variables-and-constants)
2. [Reference vs Object](#reference-vs-object)
3. [Other Uses](#other-uses)

---

## Variables and Constants

- A **final** variable (or constant) can be assigned **only once**; reassignment causes a compile error.
- By convention, **constant** names use **UPPER_SNAKE_CASE**.

```java
final int NUMBER = 100;
NUMBER = 200;  // Compile error
```

---

## Reference vs Object

- **Final** applies to the **reference** (or the variable), not necessarily to the **object** it points to.
- For **`final SomeType ref = new SomeType();`** — the reference `ref` cannot be changed (no reassignment), but the **contents** of the object (e.g. fields, list elements) can still be modified unless the object itself is designed to be immutable.

So: what is immutable is the **memory address** (the reference), not necessarily the data inside the object.

---

## Other Uses

| Use | Description |
|-----|-------------|
| **final method** | Cannot be overridden in subclasses. |
| **final class** | Cannot be extended (no subclasses). |
| **final parameter** | The parameter reference cannot be reassigned inside the method (contents may still be mutable). |
