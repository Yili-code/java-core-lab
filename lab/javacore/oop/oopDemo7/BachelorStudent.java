package lab.javacore.oop.oopDemo7;

public class BachelorStudent extends Student {

  // constructor
  BachelorStudent() {
  }

  // 直接 superclass + 間接 superclass
  BachelorStudent(String name, int age, int grade) {
    super(name, age, grade);
  }

  @Override
  public void study() {
    System.out.println("Study (bachelor degree).");
  }
}
