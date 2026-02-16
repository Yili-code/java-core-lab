package lab.javacore.practice.p013;

public class Manager extends Employee {
  private int manageBonus;

  // constructor
  Manager() {
  }

  Manager(int staffId, String name, int salary, int manageBonus) {
    super(staffId, name, salary);
    this.manageBonus = manageBonus;
  }

  // SET/GET Method
  public void setManageBonus(int manageBonus) {
    this.manageBonus = manageBonus;
  }

  public int getManageBonus() {
    return manageBonus;
  }

  // Method
  @Override
  public void work() {
    System.out.println("Supervise others.");
  }
}
