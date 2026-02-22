package lab.javacore.defaultt.defaultDemo3;

public interface Inter {
    public default void login() {
        check();
        System.out.println("Run the login process");
    }

    public default void register() {
        check();
        System.out.println("Run the register process");
    }

    // private static method
    private static void check() {
        System.out.println("Check the internet connection");
        System.out.println("Check the username and password");
        System.out.println("Check the user if exists");
    }
}