# Inheritance

**Inheritance** is a mechanism that allows a class (subclass / child class) to inherit the attributes and methods of another class (superclass / parent class), enabling **code reuse** and building a **class hierarchy**.

---

## Table of Contents

1. [Core Syntax](#core-syntax)
2. [Core Characteristics](#core-characteristics)
3. [Use Cases](#use-cases)
4. [Keywords Summary](#keywords-summary)
5. [Design Guidelines](#design-guidelines)
6. [Appendix: Memory & Tools](#appendix-memory--tools)

---

## Core Syntax

Use the `extends` keyword (placed after the class name):

```java
public class Student extends Person {}
```

- Only one superclass is allowed per class (single inheritance).
- If no `extends` clause is written, the class implicitly extends `Object`.

---

## Core Characteristics

### 1. Single Inheritance

- Java supports **single inheritance** only: a class can extend at most one superclass.
- This avoids the **diamond problem** found in C++ (multiple inheritance ambiguity).
- **Multi-level inheritance** is allowed: a subclass can have a direct parent, and that parent can have its own parent (e.g. `Student extends Person`, `Person extends Object`).

### 2. Method Overriding

A subclass can **override** a superclass method to provide a more specific implementation.

- Use the `@Override` annotation (capital O) for clarity and compile-time checks.
- **Rules for overriding:**
  - Method name and parameter list must match the superclass method.
  - The subclass method’s access modifier must be **at least as visible** as the superclass method:  
    `private` &lt; (package-private) &lt; `protected` &lt; `public`.
  - Methods or classes marked `final` cannot be overridden or extended.
  - Members that are `final`, `static`, or `private` are not overridable and may not be directly accessed by the subclass (e.g. `private` is hidden, not inherited for direct access).

### 3. The Root Class: `Object`

- Every class ultimately inherits from `Object`.
- `public class A extends Object {}` is equivalent to `public class A {}`.

### 4. The `super` Keyword

`super` is used to refer to the superclass when there are name clashes or when you need to call superclass members or constructors.

**Resolving name clashes (variable lookup order):**

```java
System.out.println(name);       // 1. local variable
System.out.println(this.name);  // 2. current class (subclass) member
System.out.println(super.name); // 3. superclass member
```

### 5. Constructors Are Not Inherited

- Constructors are **not inherited** by subclasses (constructor names must match the class name).
- The subclass must define its own constructors and typically call a superclass constructor via `super(...)`.

**Example: calling superclass constructors**

```java
Student s = new Student("Yili", 22);

public class Student extends Person {
  public Student() {
    super();
  }

  public Student(String name, int age) {
    super(name, age);
  }
}

public class Person {
  String name;
  int age;

  public Person() {}
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
```

### 6. `this()` vs `super()` in Constructors

- If a subclass has multiple constructors, they can call each other via `this(...)`, but **at least one** constructor must eventually call `super(...)` (explicitly or implicitly).
- If a constructor uses `this(...)` to delegate to another constructor, it must **not** also call `super(...)`; the other constructor is responsible for calling `super(...)`.

### 7. Inheritance vs Invocation

| Concept | Behavior |
|--------|-----------|
| **Constructors** | Not inherited; use `super(...)` to invoke a superclass constructor. |
| **Member variables** | Inherited (except `private` is hidden). Subclass can use inherited non-`private` fields directly. |
| **Private members** | Not directly accessible in subclass; use public/protected getters/setters if provided. |

**Example:**

- Inherited, non-private: `s.age = 24;`
- Private in superclass: use accessor, e.g. `s.setAge(24);`

### 8. Memory Layout (Object Creation)

When a subclass object is created, the JVM allocates space for both superclass and subclass fields. Superclass “part” is conceptually laid out before the subclass part.

```java
public class Person {
  String name;
  int age;
}
public class Student extends Person {
  String grade;
}

public class Test {
  public static void main(String[] args) {
    Student stu = new Student();
    System.out.println(stu);
    stu.name = "Yi";
    stu.age = 20;
    stu.grade = "5";
    System.out.println(stu.name + stu.age + stu.grade);
  }
}
```

**Rough flow:**

- **Stack:** `main` frame holds local variable `stu` (reference).
- **Heap:** One object containing both `Person` fields (`name`, `age`) and `Student` fields (`grade`).
- **Method area:** Class metadata for `Test`, `Person`, `Student` (e.g. method info). Superclass is loaded before subclass.

**Variable lookup:** When resolving a member (e.g. for assignment), the JVM looks in the subclass first, then the superclass, following the inheritance chain.

### 9. Virtual Methods (Dynamic Dispatch)

- Methods that are **not** `private`, `static`, or `final` can be overridden and are subject to **dynamic dispatch**: the actual method run is determined by the **runtime type** of the object, not the reference type.
- This is the basis of polymorphism: a superclass reference can refer to a subclass object and call the overridden method of the subclass.

### 10. Space–Time Trade-off

- Storing frequently used logic in a **shared superclass** (or utility) avoids duplication and can improve maintainability; the “cost” is the inheritance hierarchy and understanding the flow of execution. This is a form of “space for time” (or “structure for reuse”) in design.

---

## Use Cases

Use inheritance when **multiple classes share common attributes and behavior**. Extract the common part into a superclass and let specific classes extend it.

**Example:** `Teacher` and `Student` both have `name`, `age`, and `eat()`. Extract these into a `Person` superclass.

```java
// Superclass
public class Person {
  String name;
  int age;

  public void eat() {}
}

// Subclass
public class Student extends Person {
  String grade;

  public void study() {}
}

// Subclass
public class Teacher extends Person {
  String subject;

  public void teach() {}
}
```

---

## Keywords Summary

| Keyword / Concept | Role |
|-------------------|------|
| **Reuse** | Inheritance enables code reuse via shared superclass code. |
| **extends** | Declares that a class inherits from another class. |
| **Override** | Subclass provides its own implementation of a superclass method. |
| **super** | Access superclass members or call superclass constructors. |
| **private** | Members are not directly visible to subclasses; use accessors if needed. |
| **variable.show()** | Polymorphism: the method invoked depends on the actual object type (e.g. `variable` may be a subclass instance). |

---

## Design Guidelines

1. **Draw from bottom to top:** Identify concrete classes first, then group common features and introduce a superclass above them.
2. **Extract commonality:** Find shared attributes and methods; put them in a superclass.
3. **Implement superclass first:** Define and stabilize the parent class before writing subclasses that depend on it.

---

## Appendix: Memory & Tools

### Viewing JVM processes and heap

- **List Java processes:** `jps`
- **HSDB (Heap and System Debugger):** `jhsdb hsdb` — attach to a JVM to inspect memory layout, threads, and objects (advanced debugging).
