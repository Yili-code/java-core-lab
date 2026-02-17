# Type Promotion, printf, and Scanner

## Table of Contents

1. [Type Promotion](#type-promotion)
2. [Formatted Output (printf)](#formatted-output-printf)
3. [Scanner](#scanner)

---

## Type Promotion

**Type promotion** refers to the automatic conversion of smaller numeric types to larger ones in expressions (e.g. `byte` → `int` when used in arithmetic). Be aware of this when mixing types in operations or method calls.

---

## Formatted Output (printf)

- In formatted output (e.g. `printf`), floating-point values are typically formatted with **`%f`**.
- **`%n`** is a **platform-independent newline** (equivalent to `\n` on most systems).

---

## Scanner

**`Scanner`** is an object that wraps and operates on an input source (e.g. `System.in`).

- It holds a reference to a resource; always consider **closing** the scanner (e.g. try-with-resources) and **exception handling** (e.g. `InputMismatchException`, `NoSuchElementException`).
