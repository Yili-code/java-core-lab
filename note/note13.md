# Inheritance

繼承是一種機制，允許一個類別（Subclass / 子類）繼承另一個類別（Superclass / 父類）的屬性與方法，藉此達成程式碼複用（Code Reuse）與建立類別層級結構


## Core Syntax

`extends` (加在後面)

```java
public class Student extends Person {}
```


## Core Characteristics

1. Java 僅支持單一繼承 (Single Inheritance)，避免了 C++ 中的鑽石問題 (Diamond Problem)，但支持多層繼承 (直接父類、間接父類)

2. 子類可以覆寫 (Override) 父類的方法，以提供更具體的實現 -> `@Override` (大寫)

- override 的 method name, parameters 需相同

- subclass 的 permission 需大於等於 superclass

- `final` 修飾的方法和類別不能被 inheritance 及 override

- `final`、`static`、`private` 修飾的成員無法被 subclass 繼承存取


3. 頂級父類 Object
`public class A extends Object` (等同於 `public class A {}`)


4. `super` 用於跳過 local variable、member variable，直接去 superclass 找 value

當存在重名變數時
```java
System.out.println(name);          // local variable
System.out.println(this.name);     // member variable
System.out.println(super.name);    // superclass variable
```

5. Superclass 中的 constructor 不能被 subclass inheritance
(因為 constructor name 必須與 class name 相同)

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

6. `this` 

  - 如果 subclass 中有多個 contructor，不能用 `this()` 互相調用，需要預留一個調用 superclass 的 contructor

  - 如果 constructor 中寫上 `this()` ，就不能再寫 `super()`



## 使用場景 

多個 class 中都有相同的部分，比如說 Teacher class 和 Student class 都有 name、age 和 eat() 方法。

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

## Key word

1. Reuse 

2. Extends

3. Override

4. super


## How to build connection

1. 由下往上畫

2. 分類並抽取共性

3. 先寫 superclass