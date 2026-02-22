package lab.javacore.defaultt.defaultDemo1;

public interface Inter {
    // abstract method
    public abstract void method1();
    public abstract void method2();

    // default method 不是 abstract method，可以有方法體 (不強制 override)
    public default void function1() {
        System.out.println("Interface's default method");
    }

    // public 可以省略；default 不可省略
    default void function2() {
        System.out.println("Interface's default method 2");
        System.out.println("public 可以省略；default 不可省略");
    }
}