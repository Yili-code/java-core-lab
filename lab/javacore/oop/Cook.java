package lab.javacore.oop;

public class Cook {
  String name;
  private int age;
  int level; // 外界無法使用
    
  public void cooking() {
    System.out.println("...");
  }

  public void setAge(int num) {
    if (num >= 0) {
      age = num;
    }
  }

  public int getAge() {
    return age;
  }
}
