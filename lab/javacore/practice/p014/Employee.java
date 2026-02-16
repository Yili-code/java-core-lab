package lab.javacore.practice.p014;

public class Employee {
  private int staffId;
  private String name;
  private String work;

  Employee() {
  }

  Employee(int staffId, String name, String work) {
    this.staffId = staffId;
    this.name = name;
    this.work = work;
  }

  public void setStaffId(int staffId) {
    this.staffId = staffId;
  }

  public int getStaffId() {
    return staffId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public String getWork() {
    return work;
  }
}
