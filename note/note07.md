# Namespace Management

A **namespace** is a mechanism for **isolating identifiers** (e.g. class names, method names, variable names). It creates a logical boundary so that entities with the same name can coexist in different namespaces, avoiding **naming collisions**.

---

## Table of Contents

1. [Why We Need It](#why-we-need-it)
2. [In Java](#in-java)

---

## Why We Need It

| Benefit | Description |
|---------|-------------|
| **Uniqueness** | Same names can be used in different packages or scopes without conflict. |
| **Access control boundary** | Visibility rules (e.g. package-private) are defined relative to packages and classes. |
| **Search optimization** | Compiler and JVM can resolve symbols efficiently within a well-defined scope. |

---

## In Java

- **Packages** (`package com.example.app`) provide the primary namespace for classes.
- **Classes** form a scope for static and instance members.
- **Methods** form a scope for local variables and parameters.

Combined, they give uniqueness, access control, and clear resolution order for identifiers.
