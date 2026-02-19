public class Test {
    public static void main(String[] args) {
        Person p = new Student();

        // 調用成員變量: 編譯、執行都看 superclass
        System.out.println("調用成員變量時，編譯、執行都看 superclass -> p.name : " + p.name);
        System.out.println();

        // 調用成員方法: 編譯看 superclass，執行看 subclass
        System.out.print("調用成員方法時，編譯看 superclass，執行看 subclass -> p.show() : ");
        p.show();
        System.out.println();

        System.out.println("Polymorphism 不能調用子類特有的方法");
        // p.onlyStudent();
        System.out.println();

        System.out.println("解決方法: 類型轉換");
        Student s = (Student)p;
        System.out.print("類型轉換後，可以調用子類特有的方法 -> Student s = (Student)p");
        System.out.println();

        if (s instanceof Student) {
            System.out.println("s 是 Student 類型的物件");
        } else {
            System.out.println("s 不是 Student 類型的物件");
        } 

        if (p instanceof Person) {
            System.out.println("p 是 Person 類型的物件");
        } else {
            System.out.println("p 不是 Person 類型的物件");
        }
    }
}