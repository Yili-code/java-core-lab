# Static

static variable，被該 class 的所有 object 共享

1. 靜態方法只能訪問靜態變量與其他靜態方法

2. 非靜態方法可以訪問所有

3. 靜態方法沒有 this 

4. static 隨 class 加載而加載， 優先於 object。

5. 非靜態等到 object 後才存在

---

`public static void main(String[] args)`

public 訪問權限最大，JVM 在任何地方都可以調用

static 可以直接用 class 進行訪問，測試類中其他方法也是靜態