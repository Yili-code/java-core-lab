# ArrayList

**ArrayList** is a **resizable** implementation of the **`List`** interface in the Java Collections Framework. It is backed by an array and **grows automatically** when capacity is exceeded.

---

## Table of Contents

1. [Core Characteristics](#core-characteristics)
2. [Example](#example)
3. [When to Use](#when-to-use)

---

## Core Characteristics

| Feature | Description |
|--------|-------------|
| **Dynamic growth** | Unlike a fixed-length array (e.g. `int[]`), an `ArrayList` expands as elements are added; no need to declare size upfront. |
| **Order** | Elements are stored in **insertion order** and can be accessed by **index** (e.g. `get(i)`). |
| **Not thread-safe** | Optimized for single-threaded use. In multi-threaded code, use explicit synchronization or consider **`CopyOnWriteArrayList`**. |
| **Generics** | Use **`<T>`** to specify element type (e.g. `ArrayList<Review>`), ensuring type safety at compile time. |

---

## Example

```java
import java.util.ArrayList;
import com.yili.iterate.model.Review;

public class AARManager {
    private ArrayList<Review> history = new ArrayList<>();

    public void addReview(Review r) {
        history.add(r);  // Grows as needed
    }

    public Review getLatest() {
        return history.get(history.size() - 1);  // O(1) by index
    }
}
```

---

## When to Use

- Use **ArrayList** when you need a dynamic, ordered sequence with index access and moderate add/remove at the end.
- Use **plain array** when length is fixed and performance is critical (e.g. primitives, no boxing).
