# ArrayList

Java 集合框架（Collections Framework）中 `List` 介面的一個可變長度實作，底層基於傳統陣列，但在空間不足時會自動 Resizing。

## Core Characteristics

1. 動態擴容

與傳統陣列（如 int[]）在宣告時必須固定長度不同，ArrayList 會隨著元素的增加自動增長。

2. 有序性

元素會按照插入的順序排列，並允許透過索引（Index）存取。

3. 非執行緒安全

專為單執行緒效能優化。在多執行緒環境下，需手動同步或改用 CopyOnWriteArrayList

4. Generics

透過 <T> 指定存放的物件類型，確保型別安全。


```java
import java.util.ArrayList;
import com.yili.iterate.model.Review;

public class AARManager {
    // 建立一個存放 Review 物件的動態清單
    private ArrayList<Review> history = new ArrayList<>();

    public void addReview(Review r) {
        history.add(r); // 自動擴容，無需擔心空間限制
    }

    public Review getLatest() {
        return history.get(history.size() - 1); // O(1) 快速存取
    }
}
```