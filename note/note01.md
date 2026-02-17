# Java Tools and Execution

**Compilation and execution** are the two main steps to run a Java program.

- **`javac main.java`** — Compiles Java source code into **bytecode**, producing `.class` files.
- **`java main`** — The JVM loads bytecode and runs it via interpretation and/or **JIT (Just-In-Time)** compilation, producing native machine code for the target platform.

---

## Table of Contents

1. [Historical Overview](#historical-overview)
2. [Java Platform Editions](#java-platform-editions)
3. [Application Examples](#application-examples)

---

## Historical Overview

- **1990s:** Java was developed by James Gosling and others at Sun Microsystems. The language was initially named **Oak**, then renamed to **Java**.

---

## Java Platform Editions

| Edition | Description |
|--------|-------------|
| **Java SE (Standard Edition)** | Core language and standard library; suitable for desktop and general application development. |
| **Java ME (Micro Edition)** | Targeted at embedded and resource-constrained devices (legacy); largely superseded by other platforms or dedicated firmware. |
| **Java EE / Jakarta EE (Enterprise Edition)** | Enterprise and distributed server-side support; common in web applications, microservices, and enterprise integration. |

---

## Application Examples

| Domain | Examples |
|--------|----------|
| Desktop & IDE | Swing, JavaFX |
| Enterprise & microservices | Spring, Jakarta EE |
| Big data | Some components of Hadoop and related ecosystems |
| Games & tools | e.g. Minecraft |
