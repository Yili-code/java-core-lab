public class Test {
    public static void main(String[] args) {
        Student s = new Student("John", 20);
        Shape c = new Circle(10);
        Shape r = new Rectangle(10, 20);
        s.useShape(c);
        System.out.println();   
        s.useShape(r);
        System.out.println();
    }
}