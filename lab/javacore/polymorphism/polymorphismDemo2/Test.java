public class Test {
    public static void main(String[] args) {
        Person p = new Person("John", 20, "Male");
        Vehicle v = new Bicycle("Giant", 20);
        // v.honk(); 會報錯，因為 Bicycle 沒有 honk 方法
        p.ride(v);

        System.out.println();
        v = new Car("Toyota", 100);
        v.honk();
        p.ride(v);
        System.out.println();

        System.out.println();
        v = new Vehicle("Vehicle", 50);
        p.ride(v);
        System.out.println();
        System.out.println("Polymorphism 不能調用子類特有的方法");


    }
}