# Enum

An **enum** in Java is a special class that represents a **fixed set of constants** (named instances). It improves type safety and readability compared to integer or string constants.

---

## Table of Contents

1. [From Class to Enum](#from-class-to-enum)
2. [Core Characteristics](#core-characteristics)
3. [Syntax Summary](#syntax-summary)

---

## From Class to Enum

Conceptually, you go from a class with a fixed set of instances to an **enum**:

1. **class → enum** — Change the class keyword to `enum`.
2. **List all instances** — Declare the enum constants at the top, separated by commas (semicolon after the last if there are more members).
3. **Constructor** — If you define a constructor, it must be **private** (or package-private); the enum constants are created by the compiler.
4. **Access** — Enum constants are **public static final** by default and are the only instances of the enum type.

---

## Core Characteristics

| Point | Description |
|-------|-------------|
| **Fixed set** | All possible values are listed in the enum declaration. |
| **Constructor** | Must be **private** (or package-private); you cannot use `new` from outside. |
| **Constants** | Each constant is **public static final** and is an instance of the enum type. |
| **Methods & fields** | Enums can have fields, constructors, and methods like a normal class. |

---

## Syntax Summary

```java
public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

// With constructor and fields
public enum Level {
    LOW(1), MEDIUM(2), HIGH(3);
    private final int value;
    private Level(int value) { this.value = value; }
    public int getValue() { return value; }
}
```

- **Delete** the idea of a public constructor: enum constructors are not called directly; they are used only for the listed constants.
- Constants are **public static final** by default.
