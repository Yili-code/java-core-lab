# Inheritance

繼承是一種機制，允許一個類別（Subclass / 子類）繼承另一個類別（Superclass / 父類）的屬性與方法，藉此達成程式碼複用（Code Reuse）與建立類別層級結構


## core syntax

`extends` (加在後面)

```java
public class Student entends Person {}
```


## core characteristics

1. Java 僅支持單一繼承 (Single Inheritance)，避免了 C++ 中的鑽石問題 (Diamond Problem)

2. 子類可以覆寫 (Override) 父類的方法，以提供更具體的實現


## 使用場景 

多個 class 中都有相同的部分，比如說 Teacher class and Student class both have name, age and eat function.

```java
// Superclass
public class Person() {
  String name;
  int age;
  public void eat() {}
}

// Subclass
public class Student {
  String grade;
  public void study() {}
}

// Subclass 
public class Teacher {
  String subject;
  public void teach() {}
}
```

## key word

1. Reuse 

2. Extends

3. Override