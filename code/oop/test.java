package code.oop;

public class test {
  public static void main(String[] args) {
    Cook o1 = new Cook();

    o1.name = "Yili";
    o1.age = 20;
    o1.level = 3;

    System.out.println(o1.name);
    System.out.println(o1.age);
    System.out.println(o1.level);

    o1.cooking();
  }
  
}
