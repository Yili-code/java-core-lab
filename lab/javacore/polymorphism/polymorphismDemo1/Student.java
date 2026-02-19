public class Student extends Person {
    String name = "Student";

    public void onlyStudent() {
        System.out.println("student onlyStudent...");
    }

    @Override
    public void show() {
        System.out.println("name: " + name);
    }
}