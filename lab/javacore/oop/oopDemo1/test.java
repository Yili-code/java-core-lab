public class test {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student("John", 20, 180, "Male");

        s.setName("John");
        s.setAge(20);
        s.setHeight(180);

        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getHeight());
    }
}