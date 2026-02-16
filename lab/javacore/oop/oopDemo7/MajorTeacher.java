package lab.javacore.oop.oopDemo7;

public class MajorTeacher extends Teacher {
  MajorTeacher() {
  }

  MajorTeacher(String name, int age, String subject) {
    super(name, age, subject);
  }
  
  @Override
  public void teach() {
    System.out.println("teach (major).");
  }
}
