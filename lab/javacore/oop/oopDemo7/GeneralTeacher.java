package lab.javacore.oop.oopDemo7;

public class GeneralTeacher extends Teacher {
  GeneralTeacher() {
  }

  GeneralTeacher(String name, int age, String subject) {
    super(name, age, subject);
  }

  @Override
  public void teach() {
    System.out.println("teach (general).");
  }
}
