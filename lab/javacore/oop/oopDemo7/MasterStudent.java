package lab.javacore.oop.oopDemo7;

public class MasterStudent extends Student {
  MasterStudent() {
  }

  MasterStudent(String name, int age, int grade) {
    super(name, age, grade);
  }
  
  @Override
  public void study() {
    System.out.println("Study (master degree).");
  }

  @Override
  public void sleep() {
    System.out.println("The rest environment upgrade.");
  }
}
