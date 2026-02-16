package lab.javacore.oop.oopDemo6;

public class Test {
  public static void main(String[] args) {
    SmartPhone p = new SmartPhone();
    p.name = "apple";
    p.price = 16000;

    System.out.printf("%.2f %n", p.payment());

    PAD p2 = new PAD();
    p2.name = "item2";
    p2.price = 16000;

    System.out.printf("%.2f %n", p2.payment());

  }
}
