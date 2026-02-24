# Inner Class

在 Outer class 中再定義一個 Inter class
```java
public class Outer {
    public class Inter {
        ...
    }
}
```

## 需求產生

一個 class 表示的事物是另一個 class 的一部分，且單獨存在沒有意義
```java
public class Car {
    String carName;
    int carAge;
    int carColor;
    class Engine {
        String engineName;
        int engineAge;
    }
}
```

```java
Outer.Inner oi = newv Outer().new Inner();0                        
```

## 匿名 inner class