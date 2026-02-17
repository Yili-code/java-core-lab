# SimpleDateFormat and DateTimeFormatter

Formatting and parsing **dates** and **strings** in Java.

---

## Table of Contents

1. [SimpleDateFormat (Legacy)](#simpledateformat-legacy)
2. [Thread Safety Note](#thread-safety-note)
3. [DateTimeFormatter (Recommended)](#datetimeformatter-recommended)
4. [Cross-API Date Conversion](#cross-api-date-conversion)

---

## SimpleDateFormat (Legacy)

**Package:** `java.text.SimpleDateFormat`

A concrete class in `java.text` for **two-way conversion** between `Date` and `String`, using a custom **pattern** (e.g. `yyyy-MM-dd HH:mm:ss`).

### Date → String

```java
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String reportTime = sdf.format(new Date());
```

### String → Date

```java
String input = "2026/11/25";
SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
Date birthday = sdf.parse(input);
```

---

## Thread Safety Note

**`SimpleDateFormat` is not thread-safe.**

In multi-**threaded** environments (e.g. Spring Boot backend), sharing a single `SimpleDateFormat` instance across threads can cause incorrect results or failures. Prefer **`java.time.format.DateTimeFormatter`**, which is **immutable and thread-safe**.

---

## DateTimeFormatter (Recommended)

**Package:** `java.time.format.DateTimeFormatter`

```java
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

LocalDate localDate = LocalDate.parse(dataStr, DATE_FORMAT);
Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
```

---

## Cross-API Date Conversion

Java 8’s **`LocalDate`** is immutable and has no time zone. To convert to **`java.util.Date`** (an instant in time), you need to supply a time zone (e.g. system default) and then convert to an `Instant`.

**Example: String → `LocalDate` → `Date`**

```java
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateConverter {
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static Date toDate(String str) {
        return Date.from(LocalDate.parse(str, FMT)
                   .atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}
```
