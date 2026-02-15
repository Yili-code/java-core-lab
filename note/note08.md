# SimpleDateFormat

text.SimpleDateFormat

Java text 套件中用於在 Date 物件與 String 字串之間進行雙向轉換的具體類別，允許開發者定義自定義的模式（Pattern）來呈現時間

## Date -> String

```java
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String reportTime = sdf.format(new Date());
```

## String -> Date

```java
String input = "2026/11/25";
SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
Date birthday = sdf.parse(input);
```

## 後端開發
`SimpleDateFormat` -> Not Thread-Safe

在多執行續環境 (如 Spring Boot backend service)，如果多個 user 同時呼叫同一個 `SimpleDateFormat` instance，可能會導致日期計算錯誤或程式崩潰。

現已改用 `java.time.format.DateTimeFormatter` (不可變且執行緒安全的)

---

# DateTimeFormatter

time.format.DataTimeFormatter

```java
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

LocalDate localDate = LocalDate.parse(dataStr, DATE_FORMAT);
Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
```

`Cross-API Date Conversion`
Java 8 引入的「不可變、無時區日期」 `LocalDate` -> 透過系統預設時區 `ZoneId` 補完 -> 絕對時間戳記 `java.util.Date`


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