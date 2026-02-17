# Compile and Run

How to compile and run Java programs **with** and **without** a package declaration.

---

## Table of Contents

1. [With package](#with-package)
2. [Without package](#without-package)

---

## With package

Run from the **project root** (directory that contains the package path).

```bash
cd d:\code\java-core-lab
javac lab\javacore\oop\oopDemo1\*.java
java lab.javacore.oop.oopDemo1.Test
```

- **`javac`** — Use path separators appropriate for your OS (`\` on Windows, `/` on Unix).
- **`java`** — Use **fully qualified class name** with dots (e.g. `lab.javacore.oop.oopDemo1.Test`), not file path.

---

## Without package

Run from the directory that contains the `.java` files. No package prefix in the class name.

```bash
cd d:\code\java-core-lab\oop\oopDemo1
javac .\*.java
java Test
```

---

## Quick Reference

| Scenario | Compile | Run |
|----------|---------|-----|
| **With package** | `javac path/to/package/*.java` | `java fully.qualified.ClassName` (from project root) |
| **Without package** | `javac .\*.java` (from same dir) | `java ClassName` (from same dir) |
