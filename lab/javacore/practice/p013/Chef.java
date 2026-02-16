package lab.javacore.practice.p013;

public class Chef extends Employee {
  // Constructor
  Chef() {
  }

  Chef(int staffId, String name, int salary) {
    super(staffId, name, salary);
  }

  // Method
  @Override
  public void work() {
    System.out.println("Stir-fry.");
  }
}
