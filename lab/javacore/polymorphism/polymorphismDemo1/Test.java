public class Test {
    public static void main(String[] args) {
        Person p = new Student();

        // Method Lookup: Compile-time: Parent, Runtime: Child
        // Variable Lookup: Compile-time: Parent, Runtime: Child
        System.out.println(p.name);


        p.onlyPerson();
        // 子類有就執行子類，沒有就執行父類

        // 不能使用子類的 method
        // p.onlyStudent();

    }
}