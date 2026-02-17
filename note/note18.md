# Encapsulation

**Encapsulation** is the practice of **bundling data** (fields) with the **operations** that use them (methods) and **hiding internal implementation details** from the outside. Access is only through a **controlled surface** (e.g. public methods or getters/setters).

In backend development, encapsulation is like building a **black box**: callers do not need to know how the object works internally; they only need to know how to call the API or methods.

---

## Table of Contents

1. [Access Modifiers](#access-modifiers)
2. [Why Encapsulation Matters for Backend Engineers](#why-encapsulation-matters-for-backend-engineers)
3. [Summary](#summary)

---

## Access Modifiers

Java defines **four levels of visibility** (from most to least restrictive):

| Modifier | Visibility |
|----------|------------|
| **private** | Only within the **same class**. |
| **default** (package-private) | Only within the **same package** (no modifier written). |
| **protected** | Same package **and** all **subclasses** (even in other packages). |
| **public** | Visible **everywhere**. |

Use the most restrictive modifier that still allows the intended access; prefer **private** for fields and expose behavior through methods.

---

## Why Encapsulation Matters for Backend Engineers

| Benefit | Description |
|---------|-------------|
| **Maintainability** | If you change internal representation (e.g. replace `List` with `Set`), callers are unaffected as long as the **public method signatures** (and contract) stay the same. |
| **Validation** | Setters (or dedicated methods) let you add **validation and business rules** when data is assigned (e.g. range checks, null checks, invariants). |
| **Read-only access** | Expose only **getters** (no setters) so the object appears **read-only** from the outside. This supports **immutability** and is useful in **concurrent programming** (fewer shared mutable state issues). |
| **API stability** | Internal details can evolve without breaking clients; the public surface remains the contract. |

---

## Summary

- **Encapsulation** = data + behavior in one unit; hide internals; expose a controlled API.
- Use **access modifiers** to enforce boundaries; prefer **private** fields and public methods.
- Encapsulation improves **maintainability**, **validation**, **read-only views**, and **concurrency-friendly** design.
