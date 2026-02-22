package lab.javacore.defaultt.defaultDemo2;

public class Test1 {
    public static void main(String[] args) {
        // static method can be called directly using the interface name
        Inter.method1();
        System.out.println();

        // static method can not be called using the subclass name
        /* 
        InterImpl i = new InterImpl();
        i.method1();
        */
    }
}