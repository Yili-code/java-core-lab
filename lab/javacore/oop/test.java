package lab.javacore.oop;

public class test {
  public static void main(String[] args) {
    Cook o1 = new Cook();

    o1.name = "Yili";
    o1.setAge(20);
    o1.setAge(-100);
    o1.level = 3;

    System.out.println(o1.name);
    System.out.println(o1.getAge());
    System.out.println(o1.level);

    o1.cooking();
  }
  
}
