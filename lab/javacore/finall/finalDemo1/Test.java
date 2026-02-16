package lab.javacore.finall.finalDemo1;

public class Test {
  public static void main(String[] args) {
    Circle c = new Circle(1.5);
    System.out.println(c.getRadi());
    System.out.println(c.getPI());
    System.out.println(String.format("%.2f", c.getArea()));
    System.out.println(String.format("%.2f", c.getLength()));
  }
}
