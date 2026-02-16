package lab.javacore.practice.p013;

public class Employee {
  private int staffId;
  private String name;
  private int salary;

  // constructor
  Employee() {
  }

  Employee(int staffId, String name, int salary) {
    this.staffId = staffId;
    this.name = name;
    this.salary = salary;
  }

  // SET/GET
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setId(int staffId) {
    this.staffId = staffId;
  }

  public int getId() {
    return staffId;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  // Method
  public void work() {
    System.out.println("Working...");
  }

  public void eat() {
    System.out.println("Eating rice.");
  }
}
