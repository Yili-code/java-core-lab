// Inheritance implement 01
package lab.javacore.practice.p013;

public class Test {

  private static void runEmployee(String name, int salary, Employee emp) {
    emp.setName(name);
    emp.setSalary(salary);
    emp.eat();
    emp.work();
    System.out.println();
  }

  public static void main(String[] args) {
    runEmployee("first person", 123123, new Chef());
    runEmployee("mana", 456456, new Manager());
  }
}
