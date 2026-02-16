// Inheritance implement 01
package lab.javacore.practice.p013;

public class Test {
  public static void main(String[] args) {
    Chef c = new Chef();
    c.setName("first person");
    c.setSalary(123123);

    // call eat() which prints its own message
    c.eat();
    c.work();

    System.out.println();

    Manager m = new Manager();
    m.setName("mana");
    m.setSalary(456456);
    
    m.eat();
    m.work();

    System.out.println();
  }
}
